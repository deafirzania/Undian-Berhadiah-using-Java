import java.util.Scanner;

/**
 *
 * @author DEA
 */
public class HadiahBelanja {
    private Scanner in;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
        String nama;
        int pilihan, total;
        System.out.print ("Masukkan Nama : ");
        nama =in.nextLine();
        System.out.print("Masukkan Total Belanja : ");
        total = in.nextInt();
        if (total>=3000000) {
            System.out.println("Keterangan Pelangggan " +nama+ " dinyatakan : Dapat Undian");
            boolean kondisi;
            //System.out.println(kondisi);
            do{
                    System.out.print("Pilihan : \n 1. Sepeda \n 2. Voucher Belanja \n 3. USB  \n\n Masukkan Pilihan");
                pilihan = in.nextInt();
                in.nextLine();
                String hadiah;
                switch (pilihan) {
                    case 1:
                        hadiah = "Sepeda";
                        break;
                    case 2:
                        hadiah = "Voucher Belanja";
                        break;
                    case 3:
                        hadiah = "USB";
                        break;
                    default:
                        hadiah = "Tidak Ada Hadiah";
                }
                System.out.println("\n" +nama+ " dengan total " +total+ " memilih hadiah " +hadiah);
                    System.out.println("Apakah Anda yakin dengan pilihan Anda? (y/n)");
                    String pilihan2 = in.nextLine();
                    if (pilihan2.equals("y")) {
                    kondisi = false;
                    } else if(pilihan2.equals("n")){
                    kondisi = true;
                    }else{
                        System.out.println("Pilihan Salah");
                        kondisi = true;
                    }  
            } while (kondisi);
                 System.out.println("Selamat! Silahkan Ambil Hadiah Anda");
            
    }
        else{
            System.out.println("Tidak Dapat Undian");
        }
}
}

