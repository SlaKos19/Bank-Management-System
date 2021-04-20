public class Main {
    public static void main(String[] args) {

        Account a1 = new Account(1,3100, 100, new Customer(1,"Kowalski", "Kowalski@kowalksi", true));
        Account a2 = new Account(2,10000,97, new Customer(2,"Benedyczak", "Benedyczak@beni", false));
        Account a3 = new Account(310,15764,15, new Customer(15,"Morycko", "Morycko@mor", false));
        Account a4 = new Account(5,790000,7, new Customer(3,"Dziekonski", "Dziekonski@dzieko", false));

        System.out.println("To konto jest Pana/Pani: "+a1.getName());
        System.out.println("To konto jest Pana/Pani: "+a2.getName());
        System.out.println("To konto jest Pana/Pani: "+a3.getName());

        a1.view_account(a1);
        a1.edit_account(3000,101);
        a1.view_account(a1);
        //a1.delete_account(a1);
        a1.view_account(a1);

        Customer c1 = new Customer();
        c1.addCustomer(1,"Eugeniusz", "Eugeniusz@eugeniusz", true);
        c1.viewCustomer(c1);
        c1.editCustomer("modry@modry",false);
        c1.viewCustomer(c1);
        //c1.deleteCustomer(c1);
        c1.viewCustomer(c1);
        c1.addpayCustomer(300);
        a1.view_account(a1);
        c1.deletepayCustomer(500);
        a1.view_account(a1);

    }
}
