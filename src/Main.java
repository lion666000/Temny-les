import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean opak = true;
        boolean konec = true;
        int zivot = 3;

        System.out.println("Hráč začíná s 3 životy. Pokud udělá špatné rozhodnutí, může o jeden život přijít. Když přijdou o všechny životy, hra končí.");



        for (int i = 0; opak == true; i++) {
            System.out.println();
            System.out.println("Jsi uprostřed temného lesa. Je noc, slyšíš šustění listí a vzdálené zavytí vlků.");
            System.out.println("Před sebou máš tři cesty. Kterou si vybereš?");
            System.out.println("4 pro ukončení hry");
            int a = sc.nextInt();
            if (zivot<=1){
                opak = false;
            }
            switch (a) {
                case 1:
                    Cesta1 cesta1 = new Cesta1();
                    cesta1.zivot = zivot;
                    cesta1.uff();
                    zivot = cesta1.zivot;
                    break;
                case 2:
                    Cesta2 cesta2 = new Cesta2();
                    cesta2.opak=opak;
                    cesta2.Svetluka();
                    opak = cesta2.opak;
                    konec = cesta2.opak;

                    break;
                case 3:
                    Cesta3 cesta3 = new Cesta3();
                    cesta3.opak = opak;
                    cesta3.zivot=zivot;
                    cesta3.vlcik();
                    zivot = cesta3.zivot;
                    opak = cesta3.opak;
                    konec = cesta3.opak;
                    break;
                case 4:
                    opak = false;
                    break;
                default:
                    System.out.println("Nemůžeš si udělat vlastní cestu 🦏");
                    break;
            }
        }

        if (konec==false){
            System.out.println();
            System.out.println("Došel si k bráně a utekl si");
        }
    }
}