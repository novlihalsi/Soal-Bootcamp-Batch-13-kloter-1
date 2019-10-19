public class Dua {
    public static void main(String[] args) {
        Dua a = new Dua();

        a.hitungKembali(110500, 200000);

    }

    void hitungKembali (int totalBelanja, int totalUang){
        int uangKembali = totalUang-totalBelanja;
        int limaPuluh = (uangKembali/50000);
        int sisa = uangKembali % 50000;
        int duaPuluh = (sisa/20000);
        sisa = sisa % 20000;
        int sepuluh = (sisa/10000);
        sisa = sisa % 10000;
        int limaRibu = (sisa/5000);
        sisa = sisa % 5000;


        System.out.println(limaPuluh + " x 50000");
        System.out.println(duaPuluh + " x 20000");
        System.out.println(sepuluh + " x 10000");
        System.out.println(limaRibu + " x 5000");
        System.out.println(sisa + " Disumbangkan");
    }
}



