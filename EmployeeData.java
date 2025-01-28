import java.util.*;
public class EmployeeData{
    public static int[][] generateEmployeeData(int numEmployees) {
        Random random = new Random();
        int[][] employeeData = new int[numEmployees][2]; 
        for (int i = 0; i < numEmployees; i++) {
            employeeData[i][0] = 10000 + random.nextInt(90000); 
            employeeData[i][1] = 1 + random.nextInt(20);
        }
        return employeeData;
    }

    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        double[][] updatedData = new double[employeeData.length][3]; 
        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonusPercentage = (yearsOfService > 5) ? 0.05 : 0.02; 
            double bonus = oldSalary * bonusPercentage;
            double newSalary = oldSalary + bonus;
            
            updatedData[i][0] = oldSalary;  
            updatedData[i][1] = newSalary;  
            updatedData[i][2] = bonus;    
        }
        return updatedData;
    }

    
    public static void displayResults(double[][] updatedData) {
        double sumOldSalary = 0, sumNewSalary = 0, totalBonus = 0;
        
        System.out.println("Employee #\tOld Salary\tNew Salary\tBonus");
        
        for (int i = 0; i < updatedData.length; i++) {
            double oldSalary = updatedData[i][0];
            double newSalary = updatedData[i][1];
            double bonus = updatedData[i][2];
            
            System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\n", i + 1, oldSalary, newSalary, bonus);
            
            sumOldSalary += oldSalary;
            sumNewSalary += newSalary;
            totalBonus += bonus;
        }
        
        System.out.println("\nTotal Sum of Old Salaries: " + sumOldSalary);
        System.out.println("Total Sum of New Salaries: " + sumNewSalary);
        System.out.println("Total Bonus Amount: " + totalBonus);
    }

    public static void main(String[] args) {
        int numEmployees = 10; 
        int[][] employeeData = generateEmployeeData(numEmployees);
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);
        displayResults(updatedData);
    }
}
