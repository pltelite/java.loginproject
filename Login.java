package login;

import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JDialog;

public class Login{
    public static void main(String[] args) {
    
    JDialog window = new JDialog();
    
    
   //PART 1 OF POE
   
   Scanner input = new Scanner(System.in);
   
   String name;
   String surname;
   String usernameReg;
   String passwordReg;
   String usernameLog;
   String passwordLog;
   
   System.out.println("Greetings!,in order to register an account follow the instructions below");
   System.out.println("Step 1: Enter your First name>>");
   name = input.next();
   
   
   System.out.println("\n"+"+Step 2:Enter your surname>>");
   surname=input.next();
   TaskObject taskObj= new taskObject();
   taskObj.setSurname(surname);
   
   System.out.println("\n"+"Step 3: Create a username"
           +"\n*Understand that your username must not:"
           +"\n-must not exceed 5 characters and"
           +"\n-must contain an underscore (_)."
           +"\nEnter a username>>");
   usernameReg=input.next();
   taskObj.setUsername_Reg(usernameReg);
   
   taskObj.registerUser();//calling to validate username
   
   System.out.println("Step 4:Create a password"
           +"\n*Understand that your password must:"
           +"\n-contain at least 8 characters,"
           +"\n-contain a capital letter,"
           +"\n-contain a number and"
           +"\n-contain a special character."
           +"\nEnter a password>>");
   passwordReg = input.next();
   taskObj.setPassword_Reg(passwordReg);//calling to validate password
   
   System.out.print("\nTo login,enter your username and password below:"
           +"\nPlease enter your username>>");
   usernameLog = input.next();
   taskObj.setPassword_Login(usernameLog);
   
  System.out.println("\nPlease enter your password>>");
  passwordLog =input.next();
  taskObj.setPassword_Login(passwordLog);
  
  taskObj.returnLoginstatus();{
  
    }
    }
}//end of part 1



