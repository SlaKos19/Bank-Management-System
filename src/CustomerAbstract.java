public abstract class CustomerAbstract extends Bank {

    public int customer_id;
    public String customer_name;
    public String customer_email;
    public boolean customer_card;
    public float addPay;

    public void addCustomer(int customer_id, String customer_name, String customer_email, boolean customer_card){
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.customer_email = customer_email;
        this.customer_card = customer_card;
    }

    public void viewCustomer(Customer customer) {
        if (customer_id == 0) {
            System.out.println("Nie ma takiego klienta");
        }

        else
            System.out.println("Nr:" + " " + getCustomer_id() + " " + "Imie:" + getCustomer_name() + " " + "Adres email:" + getCustomer_email() + " " + "Czy posiada kartę:" + isCustomer_card());
        }


    public void editCustomer(String customer_email, boolean customer_card){
        this.customer_email = customer_email;
        this.customer_card = customer_card;
    }

    public void deleteCustomer(Customer customer){
        customer.customer_id = 0;
        customer.customer_name = " ";
        customer.customer_email = " ";
        customer.customer_card = false;
    }

    public void addpayCustomer(float addPay){
        account_balance += addPay;

    }

    public void deletepayCustomer(float addPay){
        account_balance -= addPay;

    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.name = customer_name;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public boolean isCustomer_card() {
        return customer_card;
    }

    public void setCustomer_card(boolean customer_card) {
        this.customer_card = customer_card;
    }

}
