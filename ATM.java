import java.util.Scanner;

public class ATM {
    public void work(Account account){

        int maxTrys=3;

        Login log= new Login();

        Scanner scanner = new Scanner(System.in);

        System.out.println("welcome to our bank");
        System.out.println("****");

        while(true){
            if(log.login(account)){
                System.out.println("successful");
                break;
            }
            else{
                System.out.println("you failed to enter the system, please try again");
                maxTrys--;
                System.out.println("you have " + maxTrys + " more rights to enter the system");
            }
            if(maxTrys==0){
                System.out.println("you ran out of tryings, come again later");
                return;
            }
        }

        String operations= "1-view balance\n" +
                "2-deposit money\n"+
                "3-withdraw money\n"+
                "4-exit when q is pressed\n";

        while(true){
            System.out.println("pick your operation");
            String op= scanner.nextLine();

            if(op.equals("1")){
                System.out.println(account.getBalance());
            }
            else if(op.equals("2")){
                System.out.println("enter the amount you'd like to deposit");
                int amount= scanner.nextInt();
                scanner.nextLine();
                account.deposit(amount);
            }
            else if(op.equals("3")){
                System.out.println("enter th amount you'd like to withdraw");
                int amount= scanner.nextInt();
                scanner.nextLine();
                account.withdraw(amount);
            }
            else if(op.equals("q")){
                System.out.println("you are exiting the system");
                break;
            }
            else{
                System.out.println("choose a valid operation");
            }
        }
    }
}
