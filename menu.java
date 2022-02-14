import java.util.Scanner;
public class menu {
    public static void main(Integer exp1){
        int odp;
        String menu = "Wybierz pozycje z menu : 1 - liczba posiadanego doswiadczenia 2 - wyjdz 3 - rozpoczecie dalszej gry ";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(menu);
            odp = scanner.nextInt();
            if (odp == 1) {
                System.out.println(exp1);
            }else if(odp == 2) {
                System.exit(0);
            }
        }while(odp != 3);
        Main.game();
    }

}