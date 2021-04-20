import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class Account extends Bank {


//    public void add_account(int account_id, float account_balance, int account_description, (){
//        this.account_id = account_id;
//        this.account_balance = account_balance;
//        this.account_description = account_description;
//        this.name = name;
//    }


    public Account(int account_id, float account_balance, int account_description, Customer customer) {
        this.account_id = account_id;
        this.account_balance = account_balance;
        this.account_description = account_description;
        this.customer = customer;
    }
    public void add_accountToList(Account account){
        Account_list.add(account);
    }

    public void view_account(Account account) {
        if (account_id == 0) {
            System.out.println("Nie ma takiego konta");
        } else {
            this.account_id = getAccount_id();
            this.account_balance = getAccount_balance();
            this.account_description = getAccount_description();
            System.out.println("Numer konta:" + account_id + " " + "Saldo:" + " " + account_balance + " " + "Opis:" + " " + account_description);
        }
    }
    public void edit_account(float account_balance, int account_description){
        this.account_balance = account_balance;
        this.account_description = account_description;
    }

    public void delete_account(Account account){
        account.account_id = 0;
        account.account_balance = 0;
        account.account_description = 0;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public float getAccount_balance() {
        return account_balance;
    }

    public void setAccount_balance(float account_balance) {
        this.account_balance = account_balance;
    }

    public int getAccount_description() {
        return account_description;
    }

    public void setAccount_description(int account_description) {
        this.account_description = account_description;
    }
}
