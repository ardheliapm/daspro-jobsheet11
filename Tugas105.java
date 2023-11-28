import java.util.Scanner;
/**
 * Tugas105
 */
public class Tugas105 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nilai N (Minimal 3) : ");
        int N = sc.nextInt();
        
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
             System.out.print(j);   
            }
            System.out.println();
        }
        
    }
}