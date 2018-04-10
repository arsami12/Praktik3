package praktik3;
public class SepedaAksi {
    public static void main(String[] args) {
        Sepeda s = new Sepeda();

        s.setMerk("Polygon");
        s.setWarna("Biru");
        s.setHarga(1000);
        // can't it! s.setJenisMoto();
        
        s.cetakInfo();
        
        System.out.print("Merknya \t: ");
        System.out.println(s.getMerk());
        System.out.print("Warnanya \t: ");
        System.out.println(s.getWarna());
        System.out.print("Harganya \t: ");
        System.out.println(s.getHarga());
        
        SepedaMoto sm = new SepedaMoto();
        sm.setMerk("Honda");
        sm.setWarna("Merah Hitam");
        sm.setHarga(10000);
        sm.setJenisMoto("Mesin Tak 4");
        sm.cetakInfo();
        System.out.println("Jenis \t: "+sm.getJenisMoto());
        sm.throttle();
    }
}
