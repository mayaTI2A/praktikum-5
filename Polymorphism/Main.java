class AnggotaKeluarga {
    public void perkenalan() {
        System.out.println("Halo, saya anggota keluarga.");
    }
}

class Ayah extends AnggotaKeluarga {
    @Override
    public void perkenalan() {
        System.out.println("Halo, saya ayah dalam keluarga ini.");
    }
}

class Anak extends AnggotaKeluarga {
    @Override
    public void perkenalan() {
        System.out.println("Halo, saya anak dalam keluarga ini.");
    }

    public void perkenalan(String nama) {
        System.out.println("Halo, nama saya " + nama + ", saya anak dalam keluarga ini.");
    }

    public void perkenalan(String nama, int umur) {
        System.out.println("Halo, nama saya " + nama + ", umur saya " + umur + " tahun.");
    }
}

public class Main {
    public static void main(String[] args) {
        AnggotaKeluarga ayah = new Ayah();
        AnggotaKeluarga anak = new Anak();

        ayah.perkenalan();
        anak.perkenalan();

        Anak anak1 = new Anak();
        anak1.perkenalan("Budi");
        anak1.perkenalan("Budi", 15);
    }
}
