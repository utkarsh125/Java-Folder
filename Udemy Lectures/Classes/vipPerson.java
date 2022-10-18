package Classes;
/**
 * 
 */
public class vipPerson {
    private String name;
    private double creditLimit;
    private String emailAddress;

    //THIRD or DEFAULT CONSTRUCTOR

    public vipPerson(){
        this("Default name", 50000.00, "default@mail.com");
    }

    //SECOND CONSTRUCTOR
    public vipPerson(String name, double creditLimit) {
        //We want to call another constructor instead of saving it so
        this(name, creditLimit,"unknown@mail.com");
    }
    
     //FIRST CONSTRUCTOR
     public vipPerson(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    //GETTERS and SETTERS
    /**
     *
     */
    public String getName() {
        return name;
    }

    /**
     * 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     */
    public double getCreditLimit() {
        return creditLimit;
    }

    /**
     * 
     */
    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    /**
     *
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * 
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

}
