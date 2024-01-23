public class Ejercicio7 {
    public static void main(String[] args) {

        int number3 = -7;
        String result3 = (number3 > 0) ? "Positive" : (number3 < 0) ? "Negative" : "Zero";
        System.out.println("Program 3 - The number " + number3 + " is: " + result3);


        int number4 = 25;
        String result4 = (number4 % 5 == 0) ? "Multiple of 5" : "Not a multiple of 5";
        System.out.println("Program 4 - The number " + number4 + " is: " + result4);


        char character5 = 'E';
        String result5 = (character5 == 'A' || character5 == 'E' || character5 == 'I' || character5 == 'O' || character5 == 'U')
                ? "Vowel"
                : "Not a vowel";
        System.out.println("Program 5 - The character '" + character5 + "' is: " + result5);


        int number6 = 14;
        String result6 = (number6 % 2 == 0) ? "Even" : "Odd";
        System.out.println("Program 6 - The number " + number6 + " is: " + result6);


        int year7 = 2021;
        String result7 = (year7 % 4 == 0 && (year7 % 100 != 0 || year7 % 400 == 0))
                ? "Leap year"
                : "Not a leap year";
        System.out.println("Program 7 - The year " + year7 + " is: " + result7);
    }
}

