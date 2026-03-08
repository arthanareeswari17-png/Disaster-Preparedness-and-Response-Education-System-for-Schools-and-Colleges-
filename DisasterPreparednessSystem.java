import java.util.Scanner;

public class DisasterPreparednessSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Disaster Preparedness and Response System =====");
        System.out.println("Select the Disaster Type:");
        System.out.println("1. Fire");
        System.out.println("2. Earthquake");
        System.out.println("3. Flood");
        System.out.println("4. Cyclone");
        System.out.println("5. Medical Emergency");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch(choice) {

            case 1:
                System.out.println("\n--- Fire Emergency Instructions ---");
                System.out.println("1. Stay calm and alert others.");
                System.out.println("2. Use the nearest fire exit.");
                System.out.println("3. Do not use elevators.");
                System.out.println("4. Move to the assembly point.");
                break;

            case 2:
                System.out.println("\n--- Earthquake Safety Instructions ---");
                System.out.println("1. Drop, Cover, and Hold.");
                System.out.println("2. Stay away from windows.");
                System.out.println("3. Move to open area after shaking stops.");
                break;

            case 3:
                System.out.println("\n--- Flood Safety Instructions ---");
                System.out.println("1. Move to higher ground.");
                System.out.println("2. Avoid walking through flood water.");
                System.out.println("3. Follow official warnings.");
                break;

            case 4:
                System.out.println("\n--- Cyclone Safety Instructions ---");
                System.out.println("1. Stay indoors.");
                System.out.println("2. Keep emergency supplies ready.");
                System.out.println("3. Follow government alerts.");
                break;

            case 5:
                System.out.println("\n--- Medical Emergency ---");
                System.out.println("1. Call ambulance immediately.");
                System.out.println("2. Inform college authorities.");
                System.out.println("3. Provide first aid if trained.");
                break;

            default:
                System.out.println("Invalid choice. Please select a valid disaster type.");
        }

        sc.close();
    }
}
