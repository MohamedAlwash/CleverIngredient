import java.util.Scanner;

public class Checker {
    final private static Scanner scanner = new Scanner(System.in);

    public static boolean checkInputString(String tekst)
    {
//            String input = scanner.nextLine();
        Scanner result = new Scanner(tekst);
        //                System.out.println("Accepteer geen leeg regel");
        if (result.hasNextInt() || result.hasNextLong() || result.hasNextDouble() || result.hasNextFloat()) {
//                System.out.println("Voer geen cijfer in!");
            return false;
        }else return !tekst.equals("");
    }

    public static int checkInputInt()
    {
        while(true)
        {
            String input = scanner.nextLine();
            Scanner result = new Scanner(input);
            if(!result.hasNextInt()){
                System.out.println("Voer een cijfer in!");
            }else {
                return Integer.parseInt(input);
            }
        }
    }
}
