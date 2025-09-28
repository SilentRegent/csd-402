/*
 * Zachary Anderson
 * Mod10.2
 * 9-27-25
 */
public class InternationalDivision extends Division {
    private String country;
    private String language;

    // Constructor
    public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    // Display
    @Override
    public void display() {
        System.out.println("International Division: " + divisionName +
                " | Account: " + accountNumber +
                " | Country: " + country +
                " | Language: " + language);
    }
}
