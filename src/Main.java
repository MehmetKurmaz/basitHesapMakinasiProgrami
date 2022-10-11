import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi1,sayi2,sonuc,secim,toplama,cikarma,carpma,bolme;
        Scanner input=new Scanner(System.in);
        System.out.print("Sayi 1 Giriniz :");
        sayi1=input.nextInt();
        System.out.print("Sayi 2 Giriniz :");
        sayi2=input.nextInt();
        System.out.print("1.Toplama\n2.Cikarma\n3.Carpma\n4.Bolme\nSeciminizi Giriniz :");
        secim=input.nextInt();
        switch (secim) {
            case 1:
                toplama=sayi1 + sayi2;
                System.out.println("Sonuc :"+toplama);
                break;
            case 2:
                cikarma=sayi1-sayi2;
                System.out.println("Sonuc :"+cikarma);
                break;
            case 3:
                carpma=sayi1*sayi2;
                System.out.println("Sonuc :"+carpma);
                break;
            case 4:
                bolme=sayi1/sayi2;
                System.out.println("Sonuc :"+bolme);
                break;
        }


    }
}