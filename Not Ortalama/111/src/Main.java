
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat,turkce,fizik,kimya,tarih,muzik;

        Scanner inp=new Scanner(System.in);
        System.out.print("Matematik notunuzu girin:");
        mat=inp.nextInt();
        System.out.print("Turkce not:");
        turkce=inp.nextInt();
        System.out.print("fizik not");
        fizik=inp.nextInt();
        System.out.print("kimya not");
        kimya=inp.nextInt();
        System.out.print("tarih notu");
        tarih= inp.nextInt();
        System.out.print("muzıknotu:");
        muzik= inp.nextInt();

        int toplam=(mat+turkce+tarih+muzik+kimya+fizik);
        double ortalama=toplam/6;
        System.out.println("ortalamaniz:"+ortalama);
        boolean gt=ortalama>=60;
        String durum=gt?"Sınıfı Gecti":"Sınıfta kaldi";
        System.out.println(durum);


    }
}
