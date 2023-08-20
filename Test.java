public class Test {
    public static void main(String [] args){

        /*Account account=new Account("berru","1234","berrusmail","05051234",1234);
        System.out.println(account.getBalance());
        System.out.println(account.getName());

        Account account2=new Account();
        Account account3=new Account("berru","123466","12345696");
        System.out.println(account2.getBalance());
        System.out.println(account3.getBalance());

        account.withdraw(500);
        System.out.println(account.getBalance());
        account.deposit(6000);
        System.out.println(account.getBalance());


        Login log= new Login();
        System.out.println(log.login(account));*/

        ATM atm = new ATM();
        Account acc= new Account("nurbanu","03659","94948569","1589",20000);
        atm.work(acc);

    }
}
