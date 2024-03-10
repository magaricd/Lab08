import java.util.Scanner;
public class BirthDateTime {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
    int birthMonth = 0;
    int birthDay = 0;
    double birthTime = 0;
    boolean done = true;

    birthMonth = SafeInput.getRangedInt(in, "What is your birth month? ", 1, 12);
    birthDay = SafeInput.getRangedInt(in, "When is your birthday? ", 1, 31);
    do{//loops until we get the value we want from the user
        if(birthMonth == 1 || birthMonth == 3 || birthMonth == 5 || birthMonth == 7 || birthMonth == 8 || birthMonth == 10 || birthMonth == 12){
            if(birthDay >= 1 && birthDay <= 31){// checks to see if users birthmonth has the correct number of days
                done = true;
                birthTime = SafeInput.getRangedDouble(in, "What time were you born? ", 0000, 2359);
                System.out.print("Your birth month is " +birthMonth+ " ");
                System.out.print("Your birthday is "+ birthDay+ " ");
                System.out.print("You were born at "+birthTime+ " ") ;
            }
            else{
                System.out.println("Your birthday is not in range");//loops back to the question
            }
            
        }
        else if (birthMonth == 4 || birthMonth == 6 || birthMonth == 9 || birthMonth == 11){
            if(birthDay >=1 && birthDay<= 30){// checks to see if users birthmonth has the correct number of days
                done = true;
                birthTime = SafeInput.getRangedDouble(in, "What time were you born? ", 0000, 2359);
                System.out.print("Your birth month is " +birthMonth+ " ");
                System.out.print("Your birthday is "+ birthDay+ " ");
                System.out.print("You were born at "+birthTime+ " ");
            }
            else{
                System.out.println("Your birthday is not in range");//loops back to the question
            }
        }
        else{
            if(birthDay >=1 && birthDay<= 28){// checks to see if users birthmonth has the correct number of days
                done = true;
                birthTime = SafeInput.getRangedDouble(in, "What time were you born? ", 0000, 2359);
                System.out.print("Your birth month is " +birthMonth+ " ");
                System.out.print("Your birthday is "+ birthDay+ " ");
                System.out.print("You were born at "+birthTime+ " ") ;
            }
            else{
                System.out.println("Your birthday is not in range");//loops back to the question
            }
        }
    }while(!done);

    
}
public static int getRangedInt(Scanner pipe, String prompt, int low, int high){
    int result = 0;
    boolean done = false;
        do{//loops until parameters are met
            System.out.print(prompt + "[" + low + "-" + high + "] ");
            if(pipe.hasNextInt()){//checks if initial value is valid
                result = pipe.nextInt();
                pipe.nextLine();
                if(result >= low && result <= high){//checks if initial value is also within range
                    done = true;
                }
                else{//runs if initial value is valid but out of range
                    System.out.println("value is out of range");
                }
            
            }
            else{//runs if initial value is invalid
                System.out.println("You must enter an integer value");
            }
        }while(!done);
        return result;   
}

public static double getRangedDouble(Scanner pipe, String prompt, double low, double high){
    double result = 0;
    boolean done = false;
        do{//loops until parameters are met
            System.out.print(prompt + "[" + low + "-" + high + "] ");
            if(pipe.hasNextDouble()){//checks if initial value is valid
                result = pipe.nextInt();
                pipe.nextLine();
                if(result >= low && result <= high){//checks if initial value is also within range
                    done = true;
                }
                else{//runs if initial value is valid but out of range
                    System.out.println("value is out of range");
                }
            
            }
            else{//runs if initial value is invalid
                System.out.println("You must enter an integer value");
            }
        }while(!done);
        return result;   
}
}
