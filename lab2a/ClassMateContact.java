/**
 * A program that gathers classmates information
 * @author Hai Nguyen
 *
 * // Designs //
 *
 * // Variables
 * ClassMatesContact.java
 * String name, String address, int age, String phoneNum
 *
 * Contact.java
 * String name, String address, int age, String phoneNum
 *
 * // Input
 * static Scanner scan = new Scanner(System.in);
 *
 *  Contact.java
 * // method createContact(); // Takes in user info to create the Contact obj
 *  public void createContact(){
 *      System.out.printf("What is your name? ");
 *      name = scan.nextString();
 *      System.out.printf("Where do you live? ");
 *      address = scan.nextString();
 *      System.out.printf("How old are you? ");
 *      age = scan.nextInt();
 *      System.out.pritnf("What is your phone number? ");
 *      phoneNum = scan.nextString();
 *  }
 * 
 * THen we will have a method to print out all the information
 *         System.out.printf("Contact Information:\n" +
                        "Name: %s\n" +
                        "Address: %s\n" +
                        "Age: %d\n" +
                        "Phone: %s\n\n",
                this.name, this.address, this.age, this.phoneNum);
 *
 *  ClassMatesContact.java
 *  // method printContact() - Print out the contact information using the Contact getters
 *  public void printContact(){
 *      System.out.printf("% contact is: \n Age: % \tAddress: % \tPhoneNumber: \n"
 *  }
 *
 * // Processing
 * Now that we have a class to create a contact, to create 3 contacts we can use an array
 * We will initialize an array of 3 elements contacts = new contact[3];
 * Then itterate over each and create a contact
 * for (int i = 0; i < contacts.length; i++) 
 * contacts[i] = Contact.createContact();
 *
 * // Output
 * Creating contact #1
What is your name? Hai
Where are you from? California
How old are you? 55
What is your phone number? 000-111-4444 
Information is stored
Creating contact #2
What is your name? Mary
Where are you from? Sunnyvale
How old are you? 30
What is your phone number? 123-456-7890
Information is stored
Creating contact #3
What is your name? Bobby
Where are you from? MountainView
How old are you? 53
What is your phone number? 1800-455-1909
Information is stored

All contacts:
Contact Information:
Name: Hai
Address: California
Age: 55
Phone: 000-111-4444

Contact Information:
Name: Mary
Address: Sunnyvale
Age: 30
Phone: 123-456-7890

Contact Information:
Name: Bobby
Address: MountainView
Age: 53
Phone: 1800-455-1909
 *
 */




public class ClassMateContact {
    public static void main (String [] args){
        // Create an array to hold 3 contact instances
        Contact[] contacts = new Contact[3];
        
        // Create contacts using a loop
        for (int i = 0; i < contacts.length; i++) {
            System.out.printf("Creating contact #%d\n", i + 1);
            contacts[i] = Contact.createContact(); // Create a contact per index
        }
        
        // Print all contacts using the print() method
        System.out.println("\nAll contacts:");
        for (Contact contact : contacts) {
            contact.print();  // Use the print() method instead of manual formatting
        }
    }
}
