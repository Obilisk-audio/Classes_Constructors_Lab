public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private double heldMoney;

    public Customer(String firstName, String lastName, double heldMoney) {
        this.id = (int) (Math.random()*1000 + 1);                   // Random id generator
        this.firstName = firstName;
        this.lastName = lastName;
        this.heldMoney = heldMoney;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFullName() {
        return firstName + " " + lastName;
    }
    public double getHeldMoney() {
        return heldMoney;
    }
    public void setHeldMoney(double heldMoney) {
        this.heldMoney = heldMoney;
    }

    public void subtractHeldMoney(double deduction) {
        setHeldMoney(heldMoney - deduction);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", heldMoney=" + heldMoney +
                '}';
    }
}

