// Liam Murphy
public class Commission extends Hourly {
    private double totalSales; // Total sales made by the employee
    private double commissionRate; // Commission rate earned by the employee

    // Constructor
    public Commission(String name, String address, String phone, String socialSecurityNumber, double hourlyPayRate, double commissionRate) {
        super(name, address, phone, socialSecurityNumber, hourlyPayRate); // Call constructor of the parent class
        this.commissionRate = commissionRate; // Set the commission rate
    }

    // Method to add total sales
    public void addSales(double totalSales) {
        this.totalSales += totalSales; // Add to total sales
    }

    // Override the pay method
    public double pay() {
        double hourlyPayment = super.pay(); // Calculate hourly payment using parent's pay method
        double commissionPayment = totalSales * commissionRate; // Calculate commission payment
        totalSales = 0; // Reset total sales for next pay period
        return hourlyPayment + commissionPayment; // Return total payment
    }

    // Override toString method to include total sales
    public String toString() {
        return super.toString() + "\nTotal Sales: " + totalSales; // Return employee info along with total sales
    }
}
