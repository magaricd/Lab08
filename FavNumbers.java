import java.util.Scanner;
public class FavNumbers {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int favoriteInt;//creates a variable to store the method result
        double favoriteDouble;//creates a variable to store the method result
        favoriteInt = SafeInput.GetInt(in, "What is your favorite integer?");//variable calls on the SafeInput file and uses the GetInt method
        favoriteDouble = SafeInput.GetDouble(in, "What is your favorite double");//variable calls on the SafeInput file and uses the GetDouble method
        System.out.println("\nYour favorite integer is " +favoriteInt+ " and you favorite double is  "+ favoriteDouble);
    
}
public static int GetInt(Scanner pipe, String prompt){
    int favInt = 0;
    System.out.println("\n" +prompt +": ");
        if(pipe.hasNextInt()){//runs if user inputs a valid value
            favInt = pipe.nextInt();
            return favInt;
        }
        else{//runs if user inputs an invalid value
            System.out.print("Invalid value");
            return favInt;//I'm not sure how to display an invalid value into the variable
        }
    
        

}

public static double GetDouble(Scanner pipe, String prompt){
    double favDouble = 0;
    System.out.println("\n" +prompt +": ");
        if(pipe.hasNextDouble()){//runs if user inputs a valid value
            favDouble = pipe.nextDouble();
            return favDouble;
        }
        else{
            System.out.print("Invalid value");
            return favDouble;//I'm not sure how to display an invalid value into the variable
        }
    
        

}
}
