import java.util.Scanner;

public class Email_Validation {
    void email() {
        String[] Array = {"neha@knoldus.com", "adesh@knoldus.com", "shubham@knoldus.com", "udit@knoldus.com", "sachin@knoldus.com", "arunesh@knoldus.com"};


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mail to search:");
        String mail = sc.next();
        boolean flag = false;
        for (int i = 0; i < 5; i++) {
            if (Array[i].equals(mail)) {

                flag = true;
                break;
            }

        }
        if (flag) {
            System.out.println("Email Exist in DB");
        } else System.out.println("Email Does Not Exist in DB");
    }
}
