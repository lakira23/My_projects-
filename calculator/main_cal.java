package calculator;
import java.util.Scanner;
import java.util.Arrays;

public class main_cal {

    public static int calculate (String[] user_request) {
        
        //System.out.println(Arrays.toString(user_request));
        int num1 = Integer.parseInt(user_request[0]);
        String operation = user_request[1];
        int num2 = Integer.parseInt(user_request[2]);
        
        int answer = 0;

        if (operation.equals("*")){
            answer = num1 * num2;
        } else if (operation.equals("/")){
            answer =  num1 / num2;
        } else if (operation.equals("+")){
            answer = num1 + num2; 
        } else if (operation.equals("-")){
            answer = num1 - num2;
        }

        return answer;
    }

    public static void main(String[] args) {

        String[] operators = {"*","/","+","-"};
        Scanner scanner = new Scanner (System.in);

        while (true) {

            System.out.println("\nPlease enter problem and enter empty to quit, Here are the options: " + Arrays.deepToString(operators));
            String user_request = scanner.nextLine();
                    
            if (user_request.isBlank()) {
                System.out.println("Thank you!");
                break;
                
            } else {
                
                try {
                String [] user_request_list = user_request.split(" ");

                int answer = main_cal.calculate(user_request_list);
                System.out.println("The answer is " + answer);

                } catch (ArrayIndexOutOfBoundsException e){
                    System.out.println(" \nWARNING: Please input the correct form!");
                
                } catch (ArithmeticException e) {
                    System.out.println("\nWARNING!: Cannot divide by zero!");

                } catch (NumberFormatException e) {
                    System.out.println("\nWARNING!: Please enter valid numbers!"); 
                }

            }
        }
        
        scanner.close();
            
        
    }

}