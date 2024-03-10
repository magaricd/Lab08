import java.util.Scanner;

public class GetUserName {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
        lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");
        System.out.println("\nYour full name is " +firstName+ " "+ lastName);
    }
    public static String getNonZeroLeString(Scanner pipe, String prompt){
        String retString = "";// Set this to zero length. Loop run until it isnt
            do{
                System.out.print("\n" +prompt +": ");//show prompt add space
                retString=pipe.nextLine();
            }while(retString.length()==0);
            return retString;
    }
    
}
