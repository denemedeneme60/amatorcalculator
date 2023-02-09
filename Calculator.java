import java.util.Scanner;

/**
 * Calculator
 */
public class Calculator {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Lütfen hangi işlemi yapacaksınız numarasını seçiniz: ");
        System.out.println("Toplama için 1 e basınız");
        System.out.println("Çıkarma için 2 ye basınız");
        System.out.println("Çarpma için 3 e basınız");
        System.out.println("Bölme için 4 e basınız");
        int enteredNumber = in.nextInt() ;
        
        if(enteredNumber > 4 && enteredNumber <0 ){
            System.out.print("Lütfen sayıları giriniz: ");
            int enteredNumber2 = in.nextInt() ;
            int enteredNumber3 = in.nextInt() ;
            switch(enteredNumber){
                case 1 : 
                    // Toplama işlemi methodu
                    break ;
                case 2 : 
                    // çıkarma işlemi methodu
                    break ;
                case 3 : 
                    // çarpma işlemi methodu
                    break;
                case 4 :
                    // bölme işlemi methodu
                    break ;
                
            }
        }else
        System.out.println("Lütfen geçerli bir sayı giriniz");

       
    }


}