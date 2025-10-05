/*
 * Zachary Anderson
 * M12 Assignment
 */


public class AutoService {

    // Standard service charge (no parameters)
    public static double yearlyService() {
        double standardCharge = 100.0; // Example base cost
        return standardCharge;
    }

    // Service with oil change (one parameter: oil change fee)
    public static double yearlyService(double oilChangeFee) {
        double standardCharge = 100.0;
        return standardCharge + oilChangeFee;
    }

    // Service with oil change and tire rotation (two parameters)
    public static double yearlyService(double oilChangeFee, double tireRotationFee) {
        double standardCharge = 100.0;
        return standardCharge + oilChangeFee + tireRotationFee;
    }

    // Service with oil change, tire rotation, and coupon (three parameters)
    public static double yearlyService(double oilChangeFee, double tireRotationFee, double coupon) {
        double standardCharge = 100.0;
        return standardCharge + oilChangeFee + tireRotationFee - coupon;
    }

    public static void main(String[] args) {
        // Testing each method twice

        // Test 1: No parameters
        System.out.println("Standard service cost 1: $" + yearlyService());
        System.out.println("Standard service cost 2: $" + yearlyService());

        // Test 2: One parameter (oil change)
        System.out.println("Service with oil change 1: $" + yearlyService(30.0));
        System.out.println("Service with oil change 2: $" + yearlyService(25.0));

        // Test 3: Two parameters (oil change + tire rotation)
        System.out.println("Service with oil + tire 1: $" + yearlyService(30.0, 20.0));
        System.out.println("Service with oil + tire 2: $" + yearlyService(25.0, 15.0));

        // Test 4: Three parameters (oil change + tire rotation - coupon)
        System.out.println("Service with oil + tire - coupon 1: $" + yearlyService(30.0, 20.0, 10.0));
        System.out.println("Service with oil + tire - coupon 2: $" + yearlyService(25.0, 15.0, 5.0));
    }
}
