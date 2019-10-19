public class Empat {
    public static void main(String[] args) {
        Empat a = new Empat();
        a.hitungParkir(4);

    }

    void hitungParkir(int jam){
        int tarifParkir = 2000;
        int total = 0;
        for (int i=1; i<=jam; i++){
            if (i>3){
                tarifParkir = 1000;
            }

            if (total == 10000) {
                tarifParkir = 0;
            }
            total = total + tarifParkir;
        }
        System.out.println("Biaya : " +total);
    }
}
