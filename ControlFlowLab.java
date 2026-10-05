public class ControlFlowLab {
    public static void main(String[] args) {
        // Uppgift 1: Scope
        {
            int blockVariable = 42;
            System.out.println("Inne i blocket: " + blockVariable);
        }
        // Här utanför blocket är blockVariable inte längre tillgänglig 

        // Uppgift 2: If 
        int number = 15;
        if (number > 10) {
            System.out.println("Talet är större än 10");
        }

        // Uppgift 3: If/Else
        int age = 20;
        if (age >= 18) {
            System.out.println("Du är myndig");
        } else {
            System.out.println("Du är inte myndig");
        }

        // Uppgift 4: Else/If 
        int score = 45;
        if (score < 20) {
            System.out.println("Talet är litet");
        } else if (score <= 50) {
            System.out.println("Talet är mellan");
        } else {
            System.out.println("Talet är stort");
        }

        // Uppgift 5: Switch
        int choice = 2; // Ändra mellan 1, 2 och 3 för att testa olika fall

        switch (choice) {
            case 1:
                System.out.println("Du valde alternativ 1");
                break;
            case 2:
                System.out.println("Du valde alternativ 2");
                break;
            case 3:
                System.out.println("Du valde alternativ 3");
                break;
            default:
                System.out.println("Ogiltigt val");
                break;
        }

        // Uppgift 6: While-loop (Skriv ut talen 1 till 5)
        int count = 1;
        while (count <= 5) {
            System.out.println("While: " + count);
            count++; // Ökar count med 1
        }
       
        // Uppgift 7: Do-While-loop (Körs Alltid minst en gång) 
        int doCount = 1;
        do {
            System.out.println("Do-While: Detta meddelande visas minst en gång!" + doCount);
            doCount++;
        } while (doCount < 1); // Villkoret är falskt, men loopen körs ändå en gång

        // Uppgift 8: For-loop (Skriv ut talen 1 till 10)
        for (int i = 1; i <= 10; i++) {
            System.out.println("For: " + i);
        }

        // Uppgift 9: Break (Avbryter loopen när i är lika med 5)
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Break: Avbryter loopen vid " + i);
                break; // Avbryter loopen när i är lika med 5
            }
            System.out.println("Break-loop: " + i);
        }

        // Uppgift 10: Continue (Hoppa över talet 3)
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Hoppar över iterationen när i är lika med 3
            }
            System.out.println("Continue-loop: " + i);
        }
    }
}
