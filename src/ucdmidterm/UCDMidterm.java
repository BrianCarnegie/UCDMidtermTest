package ucdmidterm;

import java.util.Scanner;


public class UCDMidterm {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String myFavoriteGame = "league of legends";
        String userInput;
        System.out.print("Enter in your favorite game >> ");
        userInput = input.nextLine().toLowerCase();
        
        if(userInput.equals(myFavoriteGame)){
            System.out.println("We actaully agree on something");
            
        }
        else{
            System.out.println("Cya bye kiddo!");
        }
    }
    
}
