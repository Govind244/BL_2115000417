import java.util.Scanner;
class ZaraEmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int numEmployees = 10;
        double[] salary = new double[numEmployees];
        double[] yearsOfService = new double[numEmployees];
        double[] bonus = new double[numEmployees];
        double[] newSalary = new double[numEmployees];
        double totalBonus = 0.0, totalOldSalary = 0.0, totalNewSalary = 0.0;

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            while (true) {
                System.out.print("Salary: ");
                salary[i] = sc.nextDouble();
                if (salary[i] > 0) break;
                System.out.println("Invalid salary! enter a valid number.");
            }
            while (true) {
                System.out.print("Years of service: ");
                yearsOfService[i] = sc.nextDouble();
                if (yearsOfService[i] >= 0) break;
                System.out.println("Invalid years of service! enter again.");
            }
        }

        for (int i = 0; i < numEmployees; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        
        System.out.println("\n");
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Employee " + (i + 1) + ": Old Salary = " + salary[i] + ", Bonus = " + bonus[i] + ", New Salary = " + newSalary[i]);
        }

         System.out.println("\n");
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}
