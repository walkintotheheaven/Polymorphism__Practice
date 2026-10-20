package Exaudia.Polymorphism;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=========================================================");
        System.out.println(" SISTEM OPERASIONAL EXPEDITION - FASTSPEED EXPRESS ");
        System.out.println("=========================================================\n");

        // 1. DYNAMIC POLYMORPHISM: KELOLA FLEET / ARMADA
        List<Armada> daftarArmada = new ArrayList<>();
        daftarArmada.add(new MotorExpress("L 1234 ABC", "Honda Supra", 50, true));
        daftarArmada.add(new MobilBox("B 9988 XYZ", "Isuzu Elf", 2000, 6));
        daftarArmada.add(new DronePengirim("C 1028 ZZZ", "Yamaha Lion", 30, 500));

        System.out.println(">>> REKAP BIAYA OPERASIONAL ARMADA <<<");
        double totalBiayaOperasional = 0;
        for (Armada a : daftarArmada) {
            a.tampilkanInfoArmada();
            totalBiayaOperasional += a.hitungBiayaOperasional();
            System.out.println("---------------------------------------------------------");
        }
        System.out.println("TOTAL OPERASIONAL ARMADA/HARI: Rp " + String.format("%,.2f", totalBiayaOperasional));
        System.out.println("\n=========================================================\n");

        // 2. DYNAMIC POLYMORPHISM & INTERFACE: KELOLA KURIR
        List<Kurir> daftarKurir = new ArrayList<>();
        daftarKurir.add(new KurirTetap("K-001", "Rudi Hermawan", 120, 3500000, 5000));
        daftarKurir.add(new KurirMitra("M-501", "Bambang Perkasa", 85, 12000));
        System.out.println(">>> DAFTAR GAJI & KAPABILITAS KURIR <<<");
        for (Kurir k : daftarKurir) {
            k.tampilkanProfil();
            System.out.println("\n[UJI HAK AKSES & DYNAMIC CASTING]");

            // Pengecekan Interface AksesSistem via instanceof
            if (k instanceof AksesSistem) {
                AksesSistem akun = (AksesSistem) k; //Downcasting
                akun.login(k.getIdKurir(), "password123");
            } else {
                System.out.println("Info: Kurir " + k.getNama()
                        + " TIDAK MEMILIKI akses login dashboard.");
            }

            // Pengecekan Interface PresensiDigital via instanceof
            if (k instanceof PresensiDigital) {
                PresensiDigital presensi = (PresensiDigital) k; // Downcasting
                presensi.rekamKehadiran();
            }
            System.out.println("---------------------------------------------------------");
        }
    }
}