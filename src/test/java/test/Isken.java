package test;

import org.junit.Test;

import java.util.Scanner;

public class Isken {

    public static String reverse(String str){

        String result = "";

        for (int i = str.length()-1; i >= 0; i--){
            result += str.charAt(i);
        }
        return result;
    }

    public static int multiply(int num1, int num2){



        return num1*num2;
    }

    public static int substract(int num1, int num2){
        return num1-num2;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String login = "";
        String password = "";
        boolean b = true;

//        do{
//            System.out.println("Login:");
//            login = input.nextLine();
//            System.out.println("Password:");
//            password = input.nextLine();
//        } while(b);
//


        while (b){
            System.out.println("Login:");
            login = input.nextLine();
            System.out.println("Password:");
            password = input.nextLine();

            if (login.equalsIgnoreCase(password)){
                System.out.println("Fuck you!!!!");
                System.out.println("Come again!!!");
                b = true;
            }
            else {
                System.out.println("Login: " + login);
                System.out.println("Password: " + password);
                break;

            }
        }

        }







    @Test
    public void reverse(){
        System.out.println(reverse("Parraleliped"));
    }

}
