import java.util.Random;
import java.util.Scanner;
public class Main {
    public static int i = 0;
    public static int los;
    public static int odp;
    public static int exp1 = 0;
    public static int exp = 100;
    public static int maxexp = 1000;
    public static int lvl = 1;
    public static void main(String[] args) {
        game();
    }
    public static void game(){
        String Exp = "otrzymałeś sporą liczbe doświadczenia !";



        menu.main(exp1);

        Random rnd = new Random(); //Losowanie
        los = rnd.nextInt(10) + 1; //liczba
        exp1 = rnd.nextInt(5 + 1); //doswiadczenie ale jak kurwa stala zrobic ze zapisuje sie?
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zgadnij liczbe od 1 do 10! ");
        do {
            i++;
            System.out.print("Podaj liczbe: ");
            odp = scanner.nextInt();
            if (odp > los) {
                System.out.println("Niestety nie zgadles moja liczba jest mniejsza ! ");
            } else if (odp < los)
                System.out.println("Niestety nie zgadles moja liczba jest wieksza ! ");

        } while (odp != los);
        System.out.println("Brawo odgadłeś za " + i + " razem " + Exp);
        if (exp < maxexp) {
            System.out.println("Gratulacje zdobywasz już doświadczenie na 2 poziom !");
        } else if (exp != maxexp)
            System.out.println("Niestety osiągnałeś maksymalną liczbe doświadczenia!");
        if (exp != maxexp) {
            System.out.println("Awansowałeś na 2 poziom !");
        } else if (exp >= maxexp)
            System.out.println("Gratulacje zdobywasz już doświadczenie na 3 poziom !");
        menu.main(exp1);
        if (lvl < 2){
            System.out.println("Twoj poziom wynosi : 1");
        }
    }

}