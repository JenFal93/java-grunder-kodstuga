public class PersonCard {
    public static void main(String[] args) {
        // Del 1: Variabler och utskrift
        String firstName = "Mia";
        String lastName = "Persson";
        int age = 34;
        double height = 1.70;
        char grade = 'C';
        boolean likesJava = true;

        System.out.println("Namn: " + firstName + " " + lastName);
        System.out.println("Ålder: " + age);
        System.out.println("Längd: " + height);
        System.out.println("Betyg: " + grade);
        System.out.println("Gillar Java: " + likesJava);

        // Del 2: Beräkna nästa års ålder
        int ageNextYear = age + 1;
        System.out.println("Nästa år är " + firstName + " " + ageNextYear + " år. ");

        // Del 3 – Förbättra variabelnamnen
        String carBrand = "Volvo";
        int modelYear = 2022;
        int price = 185000;
        boolean isElectric = true;

        System.out.println("Bil: " + carBrand + ", År: " + modelYear + ", Pris: " + price + " kr, Elbil: " + isElectric);

    }
}
