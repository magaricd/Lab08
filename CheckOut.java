import java.util.Scanner;
public class CheckOut {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        double checkoutTotal = 0;
        double checkoutItem = 0;
        boolean itemsAnswer; 
        boolean done = false;

        checkoutItem = SafeInput.getRangedDouble(in, "What is the price of your item? ", 0.50, 9.99);
        checkoutTotal = checkoutTotal + checkoutItem;
        itemsAnswer = SafeInput.getYNConfirm(in, "Do you have more items?");
            if(itemsAnswer = true ){
                do{
                checkoutTotal = SafeInput.getRangedDouble(in, "What is the price of your item? ", 0.50, 9.99);
                checkoutTotal = checkoutTotal + checkoutItem;
                done = true;
            
                }while(!done);
            }
            else if(itemsAnswer = false){
                System.out.print("Thank you! Your total is " + checkoutTotal);
            }
    }
    
}
