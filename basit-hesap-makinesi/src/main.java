import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner in = new Scanner(System.in);

        System.out.print("Ilk sayı giriniz : ");
        n1=in.nextInt();

        System.out.print("Ikinci sayı giriniz : ");
        n2=in.nextInt();

        System.out.println("1-Toplam\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiniz : ");
        select=in.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam : " + (n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma : " + (n1-n2));
                break;
            case 3:
                System.out.println("Çarpma : " + (n1*n2));
                break;
            case 4:
                System.out.println("Bölme : "+ (n1/n2));
                break;

            default:
                System.out.println("Yanlis bir deger girdiniz. ");
        }



    }
}
