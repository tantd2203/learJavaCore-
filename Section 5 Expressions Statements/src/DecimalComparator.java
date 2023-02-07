public class DecimalComparator {
    public static void main(String[] args) {

    }

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {

        return (int) (a * 1000) == (int) (b * 1000);
    }
}
