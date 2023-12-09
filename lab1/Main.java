package com.greatlearning.lab1;


import java.util.Random;

class Employee {
    String firstName;
    String lastName;
    String department;

    
    public Employee(String firstName, String lastName, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }
}

class CredentialService {
    
    static String generatePassword() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+";
        StringBuilder password = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < 10; i++) {  
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }

        return password.toString();
    }

    
    static String generateEmailAddress(Employee employee) {
        return employee.firstName.toLowerCase() + employee.lastName.toLowerCase() +
                "@" + employee.department.toLowerCase() + ".company.com";
    }

   
    static void showCredentials(Employee employee, String password) {
        System.out.println("Employee: " + employee.firstName + " " + employee.lastName);
        System.out.println("Email: " + generateEmailAddress(employee));
        System.out.println("Password: " + password);
    }
}




public class Main {

	public static void main(String[] args) {
		
		Employee newEmployee = new Employee("Harshit", "Chaudhary", "Technical");

        
        String password = CredentialService.generatePassword();
        CredentialService.showCredentials(newEmployee, password);

	}

}
