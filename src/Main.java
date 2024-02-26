import java.util.Scanner;

public class Main {
    static int exp (int base , int exponent){
        // Taban 0 ise sonuç her daim 0'dır.
        if (base == 0)
            return 0;
        // Üs 0 ise sonuç her daim 1'dir.
        if (exponent == 0)
            return 1;
        // Üs değeri negatif ise tabanın 1/üs kadar hesaplanması gerekir.
        if (exponent < 0)
            return exp(base, exponent + 1) / base;
        // üs değeri pozitif ise taban kendisiyle üs kadar hesaplanır.
        return base * exp(base, exponent - 1);
    }
    public static void main(String[] args) {
        //Kullanıcı veri girişleri
        Scanner inp = new Scanner(System.in);
        System.out.print("Taban değerini giriniz : ");
        int base = inp.nextInt();
        System.out.print("Üs değerini giriniz : ");
        int exponent = inp.nextInt();
        //Değerleri hesaplayıp ekrana yazdırma.
        int result = exp(base, exponent);
        System.out.println(base + "^" + exponent + "=" + result);
    }
}