public class StringWorkshop {
    public static void main(String[] args) {
    String firstName = "Mia";
    String lastName = "Persson";
    String city = "Göteborg";
    String profession = "Mjukvarutestare";

    String fullName = firstName + " " + lastName; 

    // Namn och antal tecken
    System.out.println("Hej! Jag heter " + fullName + ".");
    System.out.println("Mitt namn innehåller " + fullName.length() + " tecken.");

    // Stad och yrke (hela meningen)
    System.out.println(fullName + " bor i " + city + " och utbildar sig till " + profession + ".");
    }
}