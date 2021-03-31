import java.util.Scanner;

public class Checker {
    final private static Scanner scanner = new Scanner(System.in);

    public static String checkInputString()
    {
        while(true)
        {
            String input = scanner.nextLine();
            Scanner result = new Scanner(input);
            if (result.hasNextInt() || result.hasNextLong() || result.hasNextDouble() || result.hasNextFloat()) {
                System.out.println("Voer geen cijfer in!");
            }else if(input.equals("")){
                System.out.println("Accepteer geen leeg regel");
            }else {
                return input;
            }
        }
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
