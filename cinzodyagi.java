import java.util.Scanner;
    
    public class cinzodyagi {

         public static void main(String[] args) {
            
            Scanner inp=new Scanner(System.in);
                
            /* Çin Zodyağı nedir?

                4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar. 
           
                    Çin Zodyağı bu 12 burcun eşit aralıklarla (10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur. */     

                int doğumyılı ; 

                System.out.print("Doğum yılınızı giriniz :");

                doğumyılı =inp.nextInt();

                if(doğumyılı<2023&&1904<doğumyılı){}

                else{System.out.println("Yıl 1905'ten büyük olmalıdır");}

                if (doğumyılı%12==0){System.out.println("Çin zodyağınız : Maymun");}
        
                if (doğumyılı%12==1){System.out.println("Çin zodyağınız : Horoz");}

                if(doğumyılı%12==2){System.out.println("Çin zodyağınız : Köpek");}

                if(doğumyılı%12==3){System.out.println("Çin zodyağınız : Domuz");} 

                if(doğumyılı%12==4){System.out.println("Çin zodyağınız : Fare");}

                if(doğumyılı%12==5){System.out.println("Çin zodyağınız : Öküz");}

                if(doğumyılı%12==6){System.out.println("Çin zodyağınız : Kaplan");}

                if(doğumyılı%12==7){System.out.println("Çin zodyağınız : Tavşan");}

                if(doğumyılı%12==8){System.out.println("Çin zodyağınız : Ejderha");}

                if(doğumyılı%12==9){System.out.println("Çin zodyağınız : Yılan");}

                if(doğumyılı%12==10){System.out.println("Çin zodyağınız : At");}

                if(doğumyılı%12==11){System.out.println("Çin zodyağınız : Koyun");}

                
        }

            
        }
    

