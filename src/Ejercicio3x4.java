public class Ejercicio3x4 {
    public static void main(String[] args) {
        float piValue = 3.14159f;
        System.out.println("The value of pi is approximately: " + piValue);

        float radius = 2.5f;
        float circleArea = piValue * radius * radius;
        System.out.println("The area of a circle with radius " + radius + " is: " + circleArea);

        float limit = 5.0f;
        float currentNumber = 1.0f;
        while (currentNumber <= limit) {
            System.out.println("Current number: " + currentNumber);
            currentNumber += 0.5f;
        }
    }
}

