//https://ideone.com/ZKMPZf
import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
class Ideone {
        public static void main(String[] args) {
            Student[] students = new Student[] {
                new Student("Morgan", "Freeman"),
                new Student("Brad", "Pitt"),
                new Student("Kevin", "Spacey"),
            };
            for (Student s : students) {
                s.printFullName();
            }
        }
    }
 
/*					*/
class Student {
        private String firstName;
        private String lastName;
        public Student(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public void printFullName() {
        	System.out.print(firstName);
        	System.out.print(" ");
            System.out.println(lastName);
        }
    }
