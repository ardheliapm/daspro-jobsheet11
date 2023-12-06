import java.util.Arrays;

public class Tugas405 {

    public static void main(String[] args) {
        // Jumlah atlet per cabang olahraga
        final int JUMLAH_ATLET_PER_CABANG = 5;

        // Data atlet untuk setiap cabang olahraga
        String[] atletBadminton = {"AtletB1", "AtletB2", "AtletB3", "AtletB4", "AtletB5"};
        String[] atletTenisMeja = {"AtletTM1", "AtletTM2", "AtletTM3", "AtletTM4", "AtletTM5"};
        String[] atletBasket = {"AtletBasket1", "AtletBasket2", "AtletBasket3", "AtletBasket4", "AtletBasket5"};
        String[] atletVoli = {"AtletVoli1", "AtletVoli2", "AtletVoli3", "AtletVoli4", "AtletVoli5"};

        // Mengurutkan nama atlet secara ascending
        Arrays.sort(atletBadminton);
        Arrays.sort(atletTenisMeja);
        Arrays.sort(atletBasket);
        Arrays.sort(atletVoli);

        // Menampilkan informasi nama atlet
        System.out.println("Badminton:");
        displayAtletInfo(atletBadminton);

        System.out.println("\nTenis Meja:");
        displayAtletInfo(atletTenisMeja);

        System.out.println("\nBasket:");
        displayAtletInfo(atletBasket);

        System.out.println("\nVoli:");
        displayAtletInfo(atletVoli);
    }

    // Metode untuk menampilkan informasi nama atlet
    private static void displayAtletInfo(String[] atlet) {
        for (int i = 0; i < atlet.length; i++) {
            System.out.println("Atlet " + (i + 1) + ": " + atlet[i]);
        }
    }
}
