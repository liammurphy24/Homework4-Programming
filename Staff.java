//Liam Murphy
public class Staff {
    
    StaffMember[] staffList; // Array to store staff members

    // Constructor
    public Staff() {
        staffList = new StaffMember[8]; // Increase the size to 8 to accommodate additional employees
        staffList[0] = new Executive("Sam", "123 Main Line", "555-0469", "123-45-6789", 2423.07); // Create an Executive object
        staffList[1] = new Employee("Carla", "456 Off Line", "555-0101", "987-65-4321", 1246.15); // Create an Employee object
        staffList[2] = new Employee("Woody", "789 Off Rocker", "555-0000", "010-20-3040", 1169.23); // Create an Employee object
        staffList[3] = new Hourly("Diane", "678 Fifth Ave.", "555-0690", "958-47-3625", 10.55); // Create an Hourly object
        staffList[4] = new Volunteer("Norm", "987 Suds Blvd.", "555-8374"); // Create a Volunteer object
        staffList[5] = new Volunteer("Cliff", "321 Duds Lane", "555-7282"); // Create a Volunteer object
        ((Executive) staffList[0]).awardBonus(500.00); // Award bonus to Executive
        ((Hourly) staffList[3]).addHours(40); // Add hours worked to Hourly employee
        
        // Add two Commission employees
        staffList[6] = new Commission("John", "101 Elm St", "555-1234", "123-45-6789", 6.25, 0.20); // Create a Commission object
        ((Hourly) staffList[6]).addHours(35); // Add hours worked to Commission employee
        ((Commission) staffList[6]).addSales(400); // Add total sales to Commission employee
        
        staffList[7] = new Commission("Jane", "202 Oak St", "555-5678", "987-65-4321", 9.75, 0.15); // Create a Commission object
        ((Hourly) staffList[7]).addHours(40); // Add hours worked to Commission employee
        ((Commission) staffList[7]).addSales(950); // Add total sales to Commission employee
    }

    // Method to pay all staff members
    public void payday() {
        double amount;
        for (int count = 0; count < staffList.length; count++) {
            System.out.println(staffList[count]); // Print employee information
            amount = staffList[count].pay(); // Calculate and retrieve payment for the employee
            if (amount == 0.0)
                System.out.println("Thanks!"); // Print a message if payment is 0
            else
                System.out.println("Paid: " + amount); // Print the payment amount
            System.out.println("-----------------------------------");
        }
    }
}
