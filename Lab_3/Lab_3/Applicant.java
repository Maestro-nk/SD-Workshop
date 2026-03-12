import java.util.Arrays;

public class Applicant {
        int id;
        String lastName;
        String address;
        String phone;
        int[] grades;

            public Applicant(int id, String lastName, String address, String phone, int[] grades) {
                    this.id = id;
                    this.lastName = lastName;
                    this.address = address;
                    this.phone = phone;
                    this.grades = grades;
            }

        @Override
        public String toString() {
                return "Applicant{" +
                        "id=" + id +
                        ", lastName='" + lastName + '\'' +
                        ", address='" + address + '\'' +
                        ", phone='" + phone + '\'' +
                        ", grades=" + Arrays.toString(grades) +
                        '}';
        }

        public boolean hasBadGrades() {
                for (int i = 0; i < this.grades.length; i++) {
                        if (this.grades[i] <= 2) {
                                return true;
                        }
                }
                return false;
        }

        public double getAverageGrade() {
                double sum = 0;
                for (int i = 0; i < this.grades.length; i++) {
                        sum += this.grades[i];
                }
                return sum / this.grades.length;
        }
}
