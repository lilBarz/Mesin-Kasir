import java.util.InputMismatchException;
import java.util.Scanner;
public class Cashier {
    private int quantity;
    private int total;
    private final Item itemDB = new Item();
    private int noItem;
    private Vouchers voucher = new Vouchers();

    public void setNoItem(int noItem) {
        this.noItem = noItem;

    }


    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getNoItem() {
        return noItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setTotal(){
        for(int i=0;i < itemDB.getItemDB().length;i++){
            if(getNoItem() == (int)itemDB.getItemDB()[i][0]){
                this.total += (int)itemDB.getItemDB()[i][2] * getQuantity();
                this.itemDB.setItemDB(getQuantity(),i);
            }
        }

    }

    public void afterDiscount(){
        Scanner input = new Scanner(System.in);

        String yes;
        System.out.print("Apakah anda memiliki voucher? (y/n) : ");
        yes = input.nextLine();
        if(yes.equalsIgnoreCase("y")){
            System.out.print("Masukkan kode voucher anda : ");
            String code = input.nextLine();
            System.out.println("Total setelah diskon : "+(this.total -= voucher.discount(code)));
        } else {
            System.out.println("Total Belanja : "+this.total);
        }

    }

    public int getTotal() {
        return total;
    }


    public void checkoutDisplay(){
        System.out.println("================================================================");
        System.out.print("No \t\t"+"Kode \t\t"+"Barang \t\t"+"Harga \t\t"+"Jumlah \t\t"+"Total\n");
        System.out.println("================================================================");
        for(int i=0;i < itemDB.getItemDB().length;i++){
            System.out.print((i+1)+"\t\t"+itemDB.getItemDB()[i][0]+"\t\t"+itemDB.getItemDB()[i][1]+"\t\t"+itemDB.getItemDB()[i][2]+"\t\t\t"+itemDB.getItemDB()[i][3]+"\t\t"+((int)itemDB.getItemDB()[i][2] * (int)itemDB.getItemDB()[i][3])+"\n");

        }
        System.out.println("================================================================");
    }
}
