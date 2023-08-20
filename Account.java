public class Account {
    private double balance;
    private String name;
    private String accountNo;
    private String password;
    private String telNo;

    public Account() {
        //we write the default values will be assigned to the attributes when an account object is created.

        this("no info","no info","no info","no info",0.0);

        /*or in a more bothersome way
        this.balance=0.0;
        this.accountNo="no info";
        this.telNo="no info";
        this.password="no info";
        this.name="no info";
         */
    }

    public Account(String name, String accountNo, String password){
        this(name,accountNo,password, "no info",0.0);
    }


    public Account(String name, String accountNo, String password, String telNo, double balance) {
        this.accountNo=accountNo;
        this.balance=balance;
        this.telNo=telNo;
        this.password=password;
        this.name=name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String email) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public double deposit(double amount){
        balance+=amount;
        return balance;
    }

    public double withdraw(double amount){

        if(balance>amount){
            balance-=amount;

        }
        else{
            System.out.println("no enough balance");
        }
        return balance;
    }
}
