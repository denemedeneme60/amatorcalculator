import java.util.Scanner;

/**
 * Calculator
 */
public class Calculator {

    public static void main(String[] args) {
        // Furkan >>> Main 
        Scanner in = new Scanner(System.in);
        System.out.println("Lütfen hangi işlemi yapacaksınız numarasını seçiniz: ");
        System.out.println("Toplama için 1 e basınız");
        System.out.println("Çıkarma için 2 ye basınız");
        System.out.println("Çarpma için 3 e basınız");
        System.out.println("Bölme için 4 e basınız");
        int enteredNumber = in.nextInt() ;
        
        if(enteredNumber <= 4 && enteredNumber > 0 ){
            System.out.print("Lütfen sayıları giriniz: ");
            int enteredNumber2 = in.nextInt() ;
            int enteredNumber3 = in.nextInt() ;
            switch(enteredNumber){
                case 1 : 
                    // Toplama işlemi methodu
                    System.out.println("Toplama işlemi sonucu: " + toplama(enteredNumber3, enteredNumber2));

                    break ;
                case 2 : 
                    // çıkarma işlemi methodu
                    System.out.println("Çıkarma işlemi sonucu: " + cikarmaislemi(enteredNumber3, enteredNumber2));

                    break ;
                case 3 : 
                    // çarpma işlemi methodu
                    System.out.println("Çarpma işlemi sonucu: " + carpma(enteredNumber3, enteredNumber2));

                    break;
                case 4 :
                    // bölme işlemi methodu
                    System.out.println("Bölme işlemi sonucu: " + bolme(enteredNumber3, enteredNumber2));
                    break ;
                
            }
        }else
        System.out.println("Lütfen geçerli bir sayı giriniz");

       
    }
    // Ahmet --> ÇARPMA 
    public static int carpma(int integer1, int integer2){
        
        int result= integer1*integer2;

        return result;

    }




      /*  
    Bu fonksiyon cikarma islemi yapıyor
    */
    public static int cikarmaislemi(int eskilen, int cikan)
    {
        int fark= eskilen-cikan;
        return fark;
    }


    //Bölme işlemi methodu
    public static int bolme(int bolunen, int bolen)
    {
        return(bolunen / bolen);
    }
     // Cankutay --> Toplama
     public static int toplama(int integer1, int integer2){
        
        int result= integer1 + integer2;

        return result;

    }


 
}