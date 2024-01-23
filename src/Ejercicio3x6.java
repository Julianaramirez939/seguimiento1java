public class Ejercicio3x6 {
    public static void main(String[] args) {

        float scientificNotationFloat = 1.25e2f;
        System.out.println("Scientific notation value for float: " + scientificNotationFloat);

        float floatNumber = 10.5f;
        double doubleNumber = 20.75;
        double sumResult = floatNumber + doubleNumber;
        System.out.println("Sum of float and double: " + sumResult);

        float floatValue = 123.456f;
        int intValue = (int) floatValue;
        System.out.println("Converted int value with loss of precision: " + intValue);
    }
}
