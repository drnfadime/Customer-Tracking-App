import java.util.Scanner;
public class BagliListe {
    Scanner scanner = new Scanner(System.in);
    MusteriNode head = null;
    MusteriNode tail = null;
    int id;
    String ad;
    String soyad;
    String tel;
    String adres;
    String urun;

    void ekle() {

        System.out.println("Müşterinin bilgilerini giriniz :");
        System.out.print("ID :           ");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ad :           ");
        ad = scanner.nextLine();
        System.out.print("Soyad :        ");
        soyad = scanner.nextLine();
        System.out.print("Telefon :      ");
        tel = scanner.nextLine();
        System.out.print("Adres :        ");
        adres = scanner.nextLine();
        System.out.print("Ürün :         ");
        urun = scanner.nextLine();

        MusteriNode eleman = new MusteriNode(id, ad, soyad, tel, adres, urun);

        if (head == null) {
            head = eleman;
            tail = eleman;
            System.out.println("Liste oluşturuldu. İlk müşteri kayıt edildi.");
        } else {
            eleman.next = head;
            head.prev = eleman;
            head = eleman;
            System.out.println(id + " numaralı müşteri kayıt edildi ");

        }
    }

    void sil() {
        boolean sonuc = false;

        if (head == null) {   // Listede silinecek eleman yoksa
            System.out.println("Liste boş! Silinecek müşteri yok.");
        } else {
            System.out.print("Silinecek müşteri numarası : ");
            id = scanner.nextInt();
            scanner.nextLine();

            if (head.next == null && head.id == id) {   // Listede tek eleman varsa ve o eleman silinmek isteniyorsa
                head = null;
                tail = null;
                System.out.println(id + " numaralı müşteri silindi ");
                sonuc = true;

            } else if (head != null && head.id == id) {   //Listede birden fazla eleman varsa ama baştaki eleman silinmek isteniyorsa
                head = head.next;
                head.prev = null;
                System.out.println(id + " numaralı müşteri silindi ");
                sonuc = true;

            } else if (tail.id == id) {    //Sondaki eleman silinmek isteniyorsa
                tail = tail.prev;
                tail.next = null;
                System.out.println(id + " numaralı müşteri silindi ");
                sonuc = true;

            } else {   //Aradaki bir eleman silinmek isteniyorsa
                MusteriNode temp = head;
                while (temp != null) {

                    if (temp.id == id) {
                        temp.next.prev = temp.prev;
                        temp.prev.next = temp.next;
                        sonuc = true;
                        break;
                    }
                    temp = temp.next;
                }

            }
            if (!sonuc) {
                System.out.println(id + " numaralı müşteri listede yok.");
            }
        }
    }

    void güncelle() {

        boolean sonuc = false;

        if (head == null) {   // Listede silinecek eleman yoksa
            System.out.println("Liste boş! ");
        } else {
            System.out.print("Güncellenecek müşteri numarası : ");
            id = scanner.nextInt();
            scanner.nextLine();

            MusteriNode temp = head;
               while (temp != null) {

                   if (temp.id == id) {
                       System.out.println(id + " numaralı müşteri bilgileri : ");
                       System.out.println("Ad :          " + temp.ad);
                       System.out.println("Soyad :       " + temp.soyad);
                       System.out.println("Telefon :     " + temp.tel);
                       System.out.println("Adres :       " + temp.adres);
                       System.out.println("Ürün :        " + temp.urun);

                       System.out.print("Ürün bilgisini güncelleyiniz : ");
                       temp.urun = scanner.nextLine();
                       System.out.println("Ürün bilgisi güncellendi ");

                        sonuc = true;
                        break;
                    }
                    temp = temp.next;
                }
            if (!sonuc) {
                System.out.println(id + " numaralı müşteri listede yok.");
            }
        }
    }

    void musteriAra() {

        boolean sonuc = false;

        if(head == null){
            System.out.println("Liste boş !");
        }else{
            System.out.print("Aradığınız müşteri numarasını giriniz : ");
            id = scanner.nextInt();;
            scanner.nextLine();

            MusteriNode temp = head;

            while(temp != null){

                if(temp.id == id){
                    System.out.println(id + "Numaralı müşteri bilgileri : ");
                    System.out.println("Ad         : " + temp.ad);
                    System.out.println("Soyad      : " + temp.soyad);
                    System.out.println("Telefon    : " + temp.tel);
                    System.out.println("Adres      : " + temp.adres);
                    System.out.println("Ürün       : " + temp.urun);

                    sonuc=true;
                    break;
                }
                temp = temp.next;

            }
            if(!sonuc)
                System.out.println(id + " numaralı müşteri listede yok. ");

        }
    }

    void yazdır() {

        if (head == null) {   // Listede silinecek eleman yoksa
            System.out.println("Liste boş! ");
        } else {
            System.out.print("Numara \tAd   \tSoyad \tTelefon \tAdres \tÜrün Adı \n");
            MusteriNode temp = head;
            while (temp != null) {
                System.out.println(temp.id +"     \t"+ temp.ad +" \t"+ temp.soyad +" \t"+ temp.tel +" \t"+ temp.adres +" \t"+ temp.urun);

                temp = temp.next;
            }

        }
    }
}
