public class Main {
    public static void main(String[] args) {
        String mesaj = "bugün hava çok güzel";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(5,7);
        System.out.println(sayi);

    }

    public static void ekle(){
        System.out.println("Eklendi");

    }
    public static void sil(){
        System.out.println("Silindi");
    }
    public static void guncelle(){
        System.out.println("Güncellendi");
    }
    public static void int topla(int sayi1,int sayi2){
     return sayi1+sayi2;
    }
    public static void String sehirVer(){
       return "Ankara";
    }

}