abstract class AnggotaKeluarga {
    public abstract void aktivitas();
}

interface Kegiatan {
    void membantu();
}

class Ibu extends AnggotaKeluarga {
    @Override
    public void aktivitas() {
        System.out.println("Saya ibu, aktivitas saya memasak.");
    }
}

class Anak extends AnggotaKeluarga implements Kegiatan {
    @Override
    public void aktivitas() {
        System.out.println("Saya anak, aktivitas saya belajar.");
    }

    @Override
    public void membantu() {
        System.out.println("Saya anak, saya membantu membereskan rumah.");
    }
}

public class Main {
    public static void main(String[] args) {
        AnggotaKeluarga ibu = new Ibu();
        AnggotaKeluarga anak = new Anak();

        ibu.aktivitas();
        anak.aktivitas();

        Kegiatan kegiatanAnak = new Anak();
        kegiatanAnak.membantu();
    }
}
