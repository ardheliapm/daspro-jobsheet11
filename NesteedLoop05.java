import java.util.Scanner;

/**
 * NesteedLoop05
 */
public class NesteedLoop05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double [][] temps = new double[5][7];
        
       /* */ for (int i = 0; i < temps.length; i++) {
            System.out.println(" City : " + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Day " + (j + 1) + " : ");
                temps[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }
         int k = 1;
         for (double[] kota : temps) {
            System.out.println("City " + k++);
            int l = 0;
            double totalSuhu = 0.0;
            for (double suhu : kota) {
                System.out.println("Day :" + (l+1) + " " + " : " + suhu);
               totalSuhu += suhu;
                l++;
            }
            double rata = totalSuhu /  kota.length;
            System.out.println("Rata -Rata suhu per kota adalah : " + rata);
            System.out.println();
         }

        
/* */
    }
}