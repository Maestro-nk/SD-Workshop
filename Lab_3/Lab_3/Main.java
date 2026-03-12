public class Main {
    public static void main(String[] args) {
        Applicant[] applicants = {
                new Applicant(1, "Torgoniy", "Kyiv", "+3801234567", new int[]{5, 4, 5, 5}),
                new Applicant(2, "Shevchenko", "Lviv", "+3807654321", new int[]{2, 3, 3, 4}), // Кандидат на отчисление
                new Applicant(3, "Kovalenko", "Odesa", "+3801111111", new int[]{5, 5, 5, 5}),
                new Applicant(4, "Boyko", "Dnipro", "+3802222222", new int[]{2, 2, 3, 3}), // Еще один двоечник
                new Applicant(5, "Tkachenko", "Kharkiv", "+3803333333", new int[]{4, 4, 3, 5})
        };

        System.out.println("List of all applicants");

        for (int i = 0; i < applicants.length; i++) {
            System.out.println(applicants[i]);
        }

        System.out.println("\nApplicants with bad grades");
        for (int i = 0; i < applicants.length; i++) {

            if (applicants[i].hasBadGrades()) {
                System.out.println(applicants[i]);
            }
        }

        System.out.println("\n Filtering by average grade ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the target average grade (e.g. 4,0): ");

        try {
            double target = scanner.nextDouble();
            System.out.println("Applicants with average grade higher than " + target + ":");

            boolean found = false;
            for (int i = 0; i < applicants.length; i++) {
                if (applicants[i].getAverageGrade() > target) {
                    System.out.println(applicants[i] + " (Average: " + applicants[i].getAverageGrade() + ")");
                    found = true;
                }
            }

            if (!found) {
                System.out.println("No applicants found.");
            }

        } catch (java.util.InputMismatchException e){
            System.out.println("Error: Invalid input! Please enter a number.");
        }
    }
}