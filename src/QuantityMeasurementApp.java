public class QuantityMeasurementApp {

    public boolean areEqual(double value1, double value2) {

        if (Double.isNaN(value1) || Double.isNaN(value2)) {
            throw new IllegalArgumentException("Invalid input: Not a number");
        }

        return Double.compare(value1, value2) == 0;
    }

    public static void main(String[] args) {

        QuantityMeasurementApp app = new QuantityMeasurementApp();

        double feet1 = 5.0;
        double feet2 = 5.0;

        boolean result = app.areEqual(feet1, feet2);

        System.out.println("Are both measurements equal? " + result);
    }
}