public class OperatorLab {
    public static void main(String[] args) {
        // Övning 3 del 1
        int a = 10; 
        int b = 3; 

        System.out.println( a + b ); //13
        System.out.println( a - b ); //7
        System.out.println( a * b ); //30
        System.out.println( a / b ); //3
        System.out.println( a % b ); //1

        // Övning 3 del 2 
        int number = 17;

        System.out.println(number % 2); //Vad blir resultatet för 17? Det blir 1 
        //Vad händer om numbers ändras till 18? Om number ändras till 18, blir resultatet 0 
        //Vad kan %2 användas till? Det kan användas för att avgöra om ett tal är jämnt eller ojämnt.

        // Övning 3 del 3
        int age = 20;

        boolean test1 = age >18;
        boolean test2 = age < 18;
        boolean test3 = age == 20;
        boolean test4 = age != 20;

        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);
        
        // Logiska operatorer: && (OCH)
        boolean hasTicket = false; 
        boolean isAdult = true;
        boolean allowed = hasTicket && isAdult;

        System.out.println("Insläppt med &&: " + allowed);

        // Testa med || (ELLER)
        boolean allowedWithOr = hasTicket || isAdult;
        System.out.println("Insläppt med ||: " + allowedWithOr);
    }
}