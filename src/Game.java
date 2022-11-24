import java.util.*;

public class Game {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Field field = new Field();
        Players players = new Players();

        String subname1 = "";
        String subname2 = "";

        int subturn1;
        int subturn2;

        System.out.println("Enter 1st Player's name : ");
        subname1 = scanner.nextLine();
        players.setP1name(subname1);
        System.out.println("Enter 2nd Player's name : ");
        subname2 = scanner.nextLine();
        players.setP2name(subname2);


        System.out.println("Game starting...");
        while (true) {
            System.out.println(players.getP1name() + " your turn!");
            subturn1 = scanner.nextByte();
            switch (subturn1) {
                case 1:
                    field.setSQ1toP1();
                    break;
                case 2:
                    field.setSQ2toP1();
                    break;
                case 3:
                    field.setSQ3toP1();
                    break;
                case 4:
                    field.setSQ4toP1();
                    break;
                case 5:
                    field.setSQ5toP1();
                    break;
                case 6:
                    field.setSQ6toP1();
                    break;
                case 7:
                    field.setSQ7toP1();
                    break;
                case 8:
                    field.setSQ8toP1();
                    break;
                case 9:
                    field.setSQ9toP1();
                    break;

            }

            field.printField();

            System.out.println(players.getP2name() + " your turn!");
            subturn2 = scanner.nextByte();
            switch (subturn2) {
                case 1:
                    field.setSQ1toP2();
                    break;
                case 2:
                    field.setSQ2toP2();
                    break;
                case 3:
                    field.setSQ3toP2();
                    break;
                case 4:
                    field.setSQ4toP2();
                    break;
                case 5:
                    field.setSQ5toP2();
                    break;
                case 6:
                    field.setSQ6toP2();
                    break;
                case 7:
                    field.setSQ7toP2();
                    break;
                case 8:
                    field.setSQ8toP2();
                    break;
                case 9:
                    field.setSQ9toP2();
                    break;

            }

            field.printField();

        }
    }
}