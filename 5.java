import java.util.Scanner;

public class Lima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama = sc.nextLine();
        String nim = sc.next();
        int jumlahHadir = sc.nextInt();
        int tugas = sc.nextInt();
        int uts = sc.nextInt();
        int uas = sc.nextInt();

        double nilaiHadir = 0.1 * jumlahHadir;
        double nilaiTugas = 0.2 * tugas;
        double nilaiUts = 0.3 * uts;
        double nilaiUas = 0.4 * uas;

        int nilaiTotal = (int) (nilaiHadir + nilaiTugas + nilaiUts + nilaiUas);
        char nilai = 0;
        if (nilaiHadir==0||nilaiTugas==0||nilaiUts==0||nilaiUas==0||nilaiTotal<50){
            nilai = 'E';
        }
        else if (nilaiTotal>80) {
            nilai = 'A';
        } else if (nilaiTotal>70&&nilaiTotal<=79){
            nilai = 'B';
        } else if (nilaiTotal>60&&nilaiTotal<=70) {
            nilai = 'C';
        } else if (nilaiTotal>50&&nilaiTotal<=60){
            nilai = 'D';
        }

        System.out.println("Nama : " + nama);
        System.out.println("Nim : " + nim);
        System.out.println("Nilai : " + nilai);
    }
}
