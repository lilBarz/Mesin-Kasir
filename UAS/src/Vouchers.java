import java.time.LocalDate;
public class Vouchers {
    private LocalDate date;
    private Object[][] voucher = {
            {"AEZAKMI", LocalDate.of(2023, 7, 10)},
            {"ROCKETMAN", LocalDate.of(2023, 7, 9)}
    };

    public int discount(String code) {
        int disc = 0;
        for (int i = 0; i < voucher.length; i++) {
            if (code.equalsIgnoreCase((String) voucher[i][0]) && LocalDate.now().isAfter((LocalDate) voucher[i][1]) || LocalDate.now().isEqual((LocalDate) voucher[i][1])) {
                disc = 1000;
                System.out.println("Anda mendapatkan potongan Rp.1000 !!");
                return disc;
            }
        }
        return disc;
    }
}
