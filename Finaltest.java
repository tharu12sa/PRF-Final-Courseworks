import java.util.*;

class Finaltest {
    public static int contactID = 0;

    public static String ContactID() {
        // System.out.printf("C%04d",contactID);
        return String.format("C%04d", contactID);
    }

    public static void PhoneNumber() {
        Scanner input = new Scanner(System.in);

        while (true) {

        }
    }

    public static void printContact() {
        Scanner input = new Scanner(System.in);
        contactID++;
        System.out.println("+---------------------------------------------------------------+");
        System.out.println("|                   Add Contact to the list                     |");
        System.out.println("+---------------------------------------------------------------+");
        System.out.println("\n\n");
        System.out.println("ContactID : " + ContactID());
        System.out.println("=================");
        System.out.println("\n\n");
        System.out.print("Name :");
        String name = input.nextLine();
        PhoneNumber();

    }

    public static void printMenu() {
        Scanner input = new Scanner(System.in);
        // iFRIEND Header
        System.out.println(" /$$ /$$$$$$$$ /$$$$$$$  /$$$$$$ /$$$$$$$$ /$$   /$$ /$$$$$$$ ");
        System.out.println("|__/| $$_____/| $$__  $$|_  $$_/| $$_____/| $$$ | $$| $$__  $$");
        System.out.println(" /$$| $$      | $$  \\ $$  | $$  | $$      | $$$$| $$| $$  \\ $$");
        System.out.println("| $$| $$$$$   | $$$$$$$/  | $$  | $$$$$   | $$ $$ $$| $$  | $$");
        System.out.println("| $$| $$__/   | $$__  $$  | $$  | $$__/   | $$  $$$$| $$  | $$");
        System.out.println("| $$| $$      | $$  \\ $$  | $$  | $$      | $$\\  $$$| $$  | $$");
        System.out.println("| $$| $$$$$$$$| $$  | $$ /$$$$$$| $$$$$$$$| $$ \\  $$| $$$$$$$/");
        System.out.println("|__/|________/|__/  |__/|______/|________/|__/  \\__/|_______/ ");

        System.out.println();

        // Contacts Organizer Text
        System.out.println("  ___                  _                     ()");
        System.out.println(" / __|___ _ _  ___  __| |_ ___              /  \\ _ _  __ _ _ _  _ _____ ___ _ _ ");
        System.out.println("| (__/ _ \\ ' \\/ _ \\/ _` |  _(_-<  ___ ___   | () | '_/ _` | '  \\| |_  // -_) '_|");
        System.out.println(" \\___\\___/_||_\\___/\\__,_|\\__|/__/           \\__/|_| \\__,_|_|_|_|_/__/\\___|_|  ");
        System.out.println("                                                    |___/                       ");

        // Bottom Line
        System.out.println(
                "====================================================================================================");
        System.out.println();
        System.out.println();
        System.out.println("[01] ADD contacts");
        System.out.println("[02] UPDATE contacts");
        System.out.println("[03] DELETE contacts");
        System.out.println("[04] SEARCH contacts");
        System.out.println("[05] LIST contacts");
        System.out.println("[06] EXIT");
        System.out.println();
        System.out.print("ENTER Menu :");
        int num = input.nextInt();

        switch (num) {
            case 1: {
                printContact();
                // printMenu();
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        printMenu();

    }
}
