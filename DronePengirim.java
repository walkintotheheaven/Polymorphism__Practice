package Exaudia.Polymorphism;

public class DronePengirim extends Armada {
    private int batasKetinggianMaximal;

    public DronePengirim(String noPlat, String merk, double kapasitasKG, int batasKetinggianMaximal){
        super(noPlat, merk, kapasitasKG);
        this.batasKetinggianMaximal = batasKetinggianMaximal;
    }
    @Override
    public double hitungBiayaOperasional(){
        return (this.kapasitasKG * 10000) + (this.batasKetinggianMaximal * 50000);
    }

    @Override
    public void tampilkanInfoArmada(){
        System.out.println("DRONE PENGIRIM");
        super.tampilkanInfoArmada();
        System.out.println("Batas Ketinggian Maximal :" + batasKetinggianMaximal);
        System.out.println("Biaya/Hari : Rp" + String.format("%,.2f", hitungBiayaOperasional()));
    }
}
