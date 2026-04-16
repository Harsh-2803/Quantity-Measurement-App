class QuantityLength {

    private double value;
    private String unit;

    private static final double FEET_TO_INCH = 12.0;

    public QuantityLength(double value, String unit) {

        if (Double.isNaN(value)) {
            throw new IllegalArgumentException("Invalid value");
        }

        if (!unit.equalsIgnoreCase("feet") && !unit.equalsIgnoreCase("inches")) {
            throw new IllegalArgumentException("Unsupported unit");
        }

        this.value = value;
        this.unit = unit.toLowerCase();
    }

    private double toFeet() {
        if (unit.equals("feet")) {
            return value;
        } else if (unit.equals("inches")) {
            return value / FEET_TO_INCH;
        }
        return 0;
    }

    public boolean equals(QuantityLength other) {
        return Double.compare(this.toFeet(), other.toFeet()) == 0;
    }
}

public class QuantityMeasurementApp {

    public static void main(String[] args) {

        QuantityLength q1 = new QuantityLength(5.0, "feet");
        QuantityLength q2 = new QuantityLength(60.0, "inches");

        boolean result = q1.equals(q2);

        System.out.println("Are both measurements equal? " + result);
    }
}