import java.util.Scanner;

public class Login {
    public boolean login(Account account){
        Scanner scan= new Scanner(System.in);

        System.out.println("enter user name");
        String userName= scan.nextLine();

        System.out.println("enter password");
        String pass= scan.nextLine();

        if(userName.equals(account.getName()) && pass.equals(account.getPassword())){
            return true;
        }
        return false;
    }
}
