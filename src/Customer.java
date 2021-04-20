public class Customer extends CustomerAbstract{



    public Customer() {

    }

    public Customer(int customer_id, String customer_name, String customer_email, boolean customer_card) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.customer_email = customer_email;
        this.customer_card = customer_card;
    }

}
