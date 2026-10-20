package Exaudia.Polymorphism;

public class MobilBox extends Armada {
    private int jumlahRoda;

    public MobilBox(String noPlat, String merk, double kapasitasKG, int jumlahRoda){
        super(noPlat, merk, kapasitasKG);
        this.jumlahRoda = jumlahRoda;
    }
    @Override
    public double hitungBiayaOperasional(){
        return (this.kapasitasKG * 2500) + (this.jumlahRoda * 50000);
    }

    @Override
    public void tampilkanInfoArmada(){
        System.out.println("MOBIL BOX");
        super.tampilkanInfoArmada();
        System.out.println("Jumlah Roda :" + jumlahRoda);
        System.out.println("Biaya/Hari  : Rp" + String.format("%,.2f", hitungBiayaOperasional()));
    }
}
