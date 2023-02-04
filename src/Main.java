public class Main {
    public static void main(String[] args) {

        // Directions:
        /*
        (This task uses Strings:) A program that prompts the user for their party affiliation
        (Democrat, Republican, or Independent) and responds accordingly with a Donkey, Elephant, Person, or Other.
        (i.e. “You get a Democratic Donkey.”)  Notes: create a menu so the user chooses D, R, or I and assume
        that any other choice will be Other.  Tests: just the four options D, R, I, Other. Use as cascaded
        if structure not separate if statements!

        Test runs:   (insert the output widow copies here for the 4 test runs)
         */

        // Pseudocode:
        /*
        char partyChar

        output "What is your political party?"
        output "Type 'D' for Democrat"
        output "Type 'R' for Republican"
        output "Type 'I' for Independent"
        input partyChar
        output "You entered: " + partyChar

        if partyChar == 'D' then
            output "You get a Democratic Donkey."
        else if partyChar == 'R' then
            output "You get a Republican Elephant."
        else if partyChar == 'I' then
            output "You get an Independent Man."
        else
            output "You get an Other ..... Other."
        endIf
         */

        // Real code begins here

        char partyChar; // to store user input

        System.out.println("What is your political party?\n" +
                "Type 'D' for Democrat\n" +
                "Type 'R' for Republican\n" +
                "Type 'I' for Independent");

        // beginning of test run code
        System.out.println("[Imagine the user inputs a character]");
        partyChar = '☺'; // pretend value
        System.out.println("You entered: '" + partyChar +"'");    // confirms user output (also clarifies tests)
        // end of test run code

        if (partyChar == 'D') {         // cascading if tests for 'D', 'R', and 'I' first
            System.out.println("You get a Democratic Donkey.");
        } else if (partyChar == 'R') {
            System.out.println("You get a Republican Elephant.");
        } else if (partyChar == 'I') {
            System.out.println("You get an Independent Man.");
        } else {                       // "Other" is last
            System.out.println("You get an Other ..... Other.");
        }
    }
}