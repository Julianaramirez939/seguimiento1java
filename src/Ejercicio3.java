public class Ejercicio3 {
    public static void main(String[] args) {

        boolean isSunny = true;
        System.out.println("Is it sunny? " + isSunny);

        int rainIntensity = 2;

        if (rainIntensity > 0) {
            System.out.println("It's raining!");

            int count = 0;
            while (count < rainIntensity) {
                System.out.println("I'm getting wet!");
                count++;
            }
        } else {
            System.out.println("It's not raining.");
        }


        int bananas = 3;
        int grapes = 5;
        boolean hasMoreGrapes = grapes > bananas;
        System.out.println("Are there more grapes than bananas? " + hasMoreGrapes);
    }
}
