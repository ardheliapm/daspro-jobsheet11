import java.util.Scanner;
import java.util.Random;

/**
 * Quiz05
 */
public class Quiz05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        char menu = 'y';
        do {
            int number = rand.nextInt(10) + 1;
            boolean success = false;

            do {
                System.out.print("Tebak Angka (1-10) : " );
                int answer = input.nextInt();
                input.nextLine();
                
                if (answer == number) {
                    success = true;
                } else {
                    if (answer < number) {
                        System.out.println("Nilai Tebakan Anda Lebih Kecil dari Jawaban yang Benar");
                    } else {
                        System.out.println("Nilai Tebakan Anda Lebih Besar dari Jawaban yang Benar ");
                    }
                }
                
             
               
            } while (!success);
            System.out.println("=============JAWABAN ANDA BENAR=============");
            System.out.println(" KETIK Huruf K untuk Keluar dari Permainan");
            System.out.print("Apakah anda ingin mengulang permainan (Y/T/K) : ");
            menu = input.next().charAt(0);
            input.nextLine();

            if (menu == 'K') {
                System.out.println("Anda Keluar dari Permainan");
                break;
            }
        }while (menu == 'Y' || menu == 'y');
    }
}