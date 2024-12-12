public class MusteriNode {

    int id;
    String ad;
    String soyad;
    String tel;
    String adres;
    String urun;
    MusteriNode next;
    MusteriNode prev;

    public MusteriNode(int id, String ad, String soyad, String tel, String adres,String urun){
         this.id= id;
         this.ad= ad;
         this.soyad= soyad;
         this.tel= tel;
         this.adres= adres;
         this.urun= urun;

    }



}
