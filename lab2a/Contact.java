import java.util.Scanner;

/**
 * A class that hold personal data
 * @author Hai Nguyen
 */

public class Contact {
    /**
     * Static/Class Variables
     */
    private static int countPerson; // Shared counter of all Contact instances

    /**
     * Instance Variables
     */

    private String name;
    private String address;
    private int age;
    private String phoneNum;

    /**
     * Static Variable
     */
    static Scanner scan = new Scanner(System.in);

    /**
     * Constructors
     */

    // Default Constructor
    Contact(String name, String address, int age, String phoneNum) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phoneNum = phoneNum;
        countPerson++;
    }

    // Alternative Constructor # 2
    Contact(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
        countPerson++;
        }

    /**
     * Getters
     */

    // Get name
    public String getName() {return name;} // Return instance's name

    // Get Address
    public  String getAddress() {return address;} // Return instance's address

    // Get age
    public int getAge() {return age;} // Return instance's age

    // Get phoneNum
    public String getPhoneNum() {return phoneNum;} // Return phone number

    // Get total number of contacts
    public int getCount (){return countPerson;}

    /**
     * Setters
     */

    // Set address
    public void setAddress(String address) {
        this.address = address;
    }

    // Set age
    public void setAge(int age) {
        this.age = age;
    }

    // Set phoneNum
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    /**
     * Create Contact method
     * Take in person inputs and return a Contact object
     */

    public static Contact createContact(){
        System.out.printf("What is your name? ");
        String name = scan.nextLine();
        System.out.printf("Where are you from? ");
        String address = scan.nextLine();
        System.out.printf("How old are you? ");
        int age = scan.nextInt();
        scan.nextLine();  // Consume the leftover newline
        System.out.printf("What is your phone number? ");
        String phoneNum = scan.nextLine();
        System.out.printf("Information is stored\n");

        return new Contact(name, address, age, phoneNum);
    }

    /**
     * Print method to display contact information
     */
    public void print() {
        System.out.printf("""
            Contact Information:
            Name: %s
            Address: %s
            Age: %d
            Phone: %s
            
            """, this.name, this.address, this.age, this.phoneNum);
    }
}
