import java.util.Random;
import java.util.Scanner;
public class Cesta3 {
    static Scanner sc = new Scanner(System.in);
    Random random = new Random();
    public int zivot;
    public boolean opak;
    public boolean e;

    public void vlcik(){
        e = true;
        for(int i = 0 ;e == true ; i++){
            System.out.println("Potkáš vlka🐩, co uděláš ?");
            System.out.println("Utíkat");
            System.out.println("Bojovat");
            System.out.println("Schovat se");
            System.out.println("Vrátit se");
            System.out.println();



            int a = sc.nextInt();
            switch(a){
                case 1:
                    int r = random.nextInt(1,3);
                    if (r==1){
                        System.out.println("Utekl si vlkovy🐩");
                        opak = false;
                        e = false;
                    }
                    else{
                        System.out.println("Vlk🐩 tě dohnal, ztrácíš jeden život 💔");
                        zivot--;
                        System.out.println("♥ "+zivot);
                    }
                    break;
                case 2:
                    System.out.println("Hráč ztratí 1 život💔, ale získá poklad💰.");
                    zivot--;
                    System.out.println("♥ "+zivot);
                    break;
                case 3:
                    System.out.println("Vlk tě nevidí, pokračuješ dál.");
                    opak = false;
                    e = false;
                    break;
                case 4:
                    e = false;
                    break;
            }
        }



    }
}
