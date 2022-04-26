public class Account {
    private String AccountName;
    private String AccountSurname;
    private String AccountNumber;
    private long balance;

    public String getAccountName(){
        return AccountName;
    }
    public void setAccountName(String AccountName){
        this.AccountName = AccountName;
    }
    public String getAccountSurname() {
        return AccountSurname;
    }
    public void setAccountSurname(String AccountSurname) {
        this.AccountSurname = AccountSurname;
    }
    public String getAccountNumber() {
        return AccountNumber;
    }
    public void setAccountNumber(String AccountNumber) {
        this.AccountNumber = AccountNumber;
    }
}
