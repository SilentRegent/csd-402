/*
 * Zachary Anderson
 * Mod10.2
 * 9-27-25
 */
public class UseDivision {
    public static void main(String[] args) {
        // Create two InternationalDivisions
        InternationalDivision intDiv1 = new InternationalDivision("Global Tech", 101, "Japan", "Japanese");
        InternationalDivision intDiv2 = new InternationalDivision("Euro Systems", 102, "Germany", "German");

        // Create two DomesticDivisions
        DomesticDivision domDiv1 = new DomesticDivision("East Coast Sales", 201, "New York");
        DomesticDivision domDiv2 = new DomesticDivision("West Coast Marketing", 202, "California");

        // Display details
        intDiv1.display();
        intDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}
