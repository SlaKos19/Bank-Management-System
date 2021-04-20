import java.util.ArrayList;
import java.util.List;

public abstract class Bank {

    private int id_bank;
    private String address;
    protected String name;


    protected int account_id;
    protected float account_balance;
    protected int account_description;
    Customer customer;
    protected List<Account> Account_list = new ArrayList<>();


//    public int customer_id;
//    public String customer_name;
//    public String customer_email;
//    public boolean customer_card;



    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }
}
