import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Item item = new Item();
        Cashier cashier = new Cashier();
        Scanner input = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("   Selamat Datang di Indomeret!!");
        System.out.println("==================================");
        int kode = 0;
        boolean yes = true;
        while(yes){

            System.out.print("Masukkan kode barang yang dibeli : ");
            kode = input.nextInt();
            cashier.setNoItem(kode);


            System.out.print("Masukkan jumlah barang yang dibeli : ");
            int quantity = input.nextInt();
            cashier.setQuantity(quantity);

            input.nextLine();

            System.out.print("Ada tambahan barang lagi? (y/n): ");
            String decision = input.nextLine();
            cashier.setTotal();

            if(decision.equalsIgnoreCase("n")){
                yes = false;
            } else {
                System.out.println("==================================");
            }
        }

        cashier.checkoutDisplay();
        System.out.println("Total Belanja: "+cashier.getTotal());
        cashier.afterDiscount();


        boolean checkUang = false;
        int bayar = 0;

        while(!checkUang){
            System.out.print("Uang yang dibayarkan : ");
            bayar = input.nextInt();
            if(bayar < cashier.getTotal()){
                System.out.println("uang anda kurang !!");
            } else {
                checkUang = true;
            }
        }
        System.out.println("Kembalian : "+(bayar - cashier.getTotal()));


    }
}