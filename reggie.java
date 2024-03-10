import java.util.Scanner;
public class reggie{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
            String socialNum = "";
            String mNum = "";
            String menuChoice = "";

            socialNum = SafeInput.getRegExString(in,"What is your social security number?", "\\d{3}-\\d{2}-\\d{4}" );
            mNum = SafeInput.getRegExString(in, "What is your m number?", "(M|m)\\d{5}");
            menuChoice = SafeInput.getRegExString(in, "What is your menu choice?","OoSsVvQq");
    }

}