import java.util.Scanner;
public class uygulama {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    BagliListe liste = new BagliListe();
    int secim = -1;
    while(secim != 0){
            System.out.println("1-ekle");
            System.out.println("2-sil");
            System.out.println("3-güncelle");
            System.out.println("4-müşteri ara");
            System.out.println("5-yazdır");
            System.out.println("0-çıkış");
            System.out.print("Seçiminiz : ");
            secim = scanner.nextInt();
            scanner.nextLine();

            switch(secim){
                case 1 :liste.ekle(); break;
                case 2 :liste.sil(); break;
                case 3 :liste.güncelle(); break;
                case 4 :liste.musteriAra(); break;
                case 5 :liste.yazdır(); break;
                case 0 :
                    System.out.println("Çıkış yaptınız "); break;
                default:
                    System.out.println("Hatalı seçim yaptınız [0-5] ");
                    break;
            }
        }
    }





}
