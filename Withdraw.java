//import java.util.Scanner;

class Withdraw{

    // final int minBalance = 20;
    public static void main(String[] args){
        int withdraw=20;
        int currBalance =50;
        while (true){
            
            if (withdraw<currBalance){ 
                System.out.println("You have enough balance. Withdraw transaction is valid");
                assertionExample(withdraw, currBalance);
                break;
            }
            
            assert false : "Your account dont have enough balance. Withdraw transaction is invalid";
            break;
        }

    }

    public static void assertionExample (int withdraw, int currBalance){
        assert withdraw > 10 && withdraw <= 100;

        int newBalance = currBalance - withdraw; //method logic

        assert newBalance < currBalance ;

        System.out.println(newBalance);
    }
}