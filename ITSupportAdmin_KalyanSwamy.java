import java.util.Random;
import java.util.Scanner;

public class ITSupportAdmin_KalyanSwamy {
    static String fn;
    static String ln;
    static String dept = null;
    static String company;
        static void Employee(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Hi user, Please enter your first name");
            fn = sc.nextLine();
            System.out.println("Please enter your last name");
            ln = sc.nextLine();
        }
        static void cred() {
            String email;
            email = (fn+ln+"@"+dept+"."+company+".com");
            String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String lower = "abcdefghijklmnopqrstuvwxyz";
            String spchar = "!@#$%^&*()_+";
            String num = "1234567890";
            String combi = upper + lower + spchar + num;
            int len = 8;
            char password[] = new char[len];
            Random r = new Random();
            for (int i = 0; i < len; i++) {
                password[i] = combi.charAt(r.nextInt(combi.length()));
            }
            System.out.println("Dear "+fn+" "+ln+", your generated credentials are:");
            System.out.println("Email --------> "+ email);
            System.out.println("Password --------> " + new String(password));
        }

    public static void main(String[] args) {
        Employee();
        Scanner sc = new Scanner(System.in);
        int dep;
        System.out.println("Enter the name of the company");
        company= sc.nextLine();
        System.out.println("Please enter a number from the following departments:\n" +
                "1. Technical\n" +
                "2. Admin\n" +
                "3. Human Resource\n" +
                "4. Legal");
        dep = sc.nextInt();
        switch (dep) {
            case 1:
                System.out.println("Your department is Technical");
                dept = "Technical";
                break;
            case 2:
                System.out.println("your department is Admin");
                dept = "Admin";
                break;
            case 3:
                System.out.println("your department is Human Resource");
                dept = "Human Resource";
                break;
            case 4:
                System.out.println("Your department is Legal");
                dept = "Legal";
                break;
            default:
                System.out.println("Enter a valid department");
                dept = "invalid";
                break;
        }
        cred();
    }
}
