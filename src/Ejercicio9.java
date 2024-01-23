public class Ejercicio9 {
    public static void main(String[] args) {

        int dayOfWeek = 3;
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
        }


        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Pass");
                break;
            case 'D':
                System.out.println("Sufficient");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid Grade");
        }


        enum Season { WINTER, SPRING, SUMMER, AUTUMN }
        Season currentSeason = Season.SUMMER;
        switch (currentSeason) {
            case WINTER:
                System.out.println("Winter");
                break;
            case SPRING:
                System.out.println("Spring");
                break;
            case SUMMER:
                System.out.println("Summer");
                break;
            case AUTUMN:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Invalid Season");
        }
    }
}
