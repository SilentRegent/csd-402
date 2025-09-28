
/*
 * Zachary Anderson
 * Mod10.2
 * 9-27-25
 */
public class DomesticDivision extends Division {
    private String state;

    
    public DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    // Display
    @Override
    public void display() {
        System.out.println("Domestic Division: " + divisionName +
                " | Account: " + accountNumber +
                " | State: " + state);
    }
}
