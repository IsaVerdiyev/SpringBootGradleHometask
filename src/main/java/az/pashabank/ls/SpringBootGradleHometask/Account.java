package az.pashabank.ls.SpringBootGradleHometask;

public class Account {
    private Customer customer;

    public Account(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
