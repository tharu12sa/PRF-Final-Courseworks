import java.time.LocalDate;
import java.util.Scanner;

class Finaltest {
    public static String[] conId = new String[0];
    public static String[] conName = new String[0];
    public static String[] conPhoneNumber = new String[0];
    public static String[] conCompany = new String[0];
    public static String[] conBirthday = new String[0];

    public static int contactID = 0;
    public static Scanner input = new Scanner(System.in);

    public static String ContactID() {
        return String.format("C%04d", contactID);
    }

    public static String birthDay() {
        while (true) {
            System.out.print("Enter Birthday (YYYY-MM-DD): ");
            String birthday = input.nextLine();

            try {
                LocalDate bday = LocalDate.parse(birthday);

                if (bday.isAfter(LocalDate.now())) {
                    System.out.println("\t\tInvalid Birthday!");
                    System.out.print("Do you want Birthday again (Y/N) : ");
                    char answer = input.nextLine().charAt(0);
                    input.nextLine(); // clear buffer

                    if (answer == 'y' || answer == 'Y') {
                        continue;
                    } else if (answer == 'n' || answer == 'N') {
                        return null;
                    }
                } else {
                    return birthday;
                }

            } catch (Exception e) {
                System.out.println("\t\tInvalid Birthday Format!");
                System.out.print("Do you want Birthday again (Y/N) : ");
                char answer = input.nextLine().charAt(0);
                input.nextLine(); // clear buffer

                if (answer == 'y' || answer == 'Y') {
                    continue;
                } else {
                    return null;
                }
            }
        }
    }

    public static String PhoneNumber() {
        while (true) {
            System.out.print("number :");
            String phonenumber = input.nextLine();
            String regex = "^07[01245678]\\d{7}$";

            if (phonenumber.matches(regex)) {
                return phonenumber;
            }
            System.out.println("\t\tInValid Phone Number");
            System.out.print("Do you want add phone number again (Y/N) : ");
            char answer = input.nextLine().charAt(0);
            if (answer == 'y' || answer == 'Y') {
                continue;
            } else if (answer == 'n' || answer == 'N') {
                printMenu();
                return null;
            }
        }
    }

    public static void addContact(String id, String name, String phone, String company, String birthday) {
        String[] tempConId = new String[conId.length + 1];
        String[] tempConName = new String[conName.length + 1];
        String[] tempConPhoneNumber = new String[conPhoneNumber.length + 1];
        String[] tempConCompany = new String[conCompany.length + 1];
        String[] tempConBirthday = new String[conBirthday.length + 1];

        for (int i = 0; i < conId.length; i++) {
            tempConId[i] = conId[i];
            tempConName[i] = conName[i];
            tempConPhoneNumber[i] = conPhoneNumber[i];
            tempConCompany[i] = conCompany[i];
            tempConBirthday[i] = conBirthday[i];
        }

        int lastIndex = conId.length;
        tempConId[lastIndex] = id;
        tempConName[lastIndex] = name;
        tempConPhoneNumber[lastIndex] = phone;
        tempConCompany[lastIndex] = company;
        tempConBirthday[lastIndex] = birthday;

        conId = tempConId;
        conName = tempConName;
        conPhoneNumber = tempConPhoneNumber;
        conCompany = tempConCompany;
        conBirthday = tempConBirthday;
    }

    public static void printContact() {
        contactID++;
        String id = ContactID();

        System.out.println("+---------------------------------------------------------------+");
        System.out.println("|                   Add Contact to the list                     |");
        System.out.println("+---------------------------------------------------------------+");
        System.out.println("ContactID : " + id);
        System.out.println("=================\n");

        System.out.print("Name :");
        String name = input.nextLine();

        String phonenumber = PhoneNumber();
        if (phonenumber == null) {
            contactID--;
            return;
        }

        System.out.print("Company Name :");
        String comName = input.nextLine();

        String birthday = birthDay();
        if (birthday == null) {
            contactID--;
            return;
        }

        addContact(id, name, phonenumber, comName, birthday);
        System.out.println("\nContact has been added successfully!\n");
    }

    public static void updateContact() {
        System.out.println("+---------------------------------------------------------------+");
        System.out.println("|                   Update Contacts                     |");
        System.out.println("+---------------------------------------------------------------+");
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
        case 2 :{
                updateContact();
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        printMenu();
        // System.out.println(conId[0]);

    }
}
