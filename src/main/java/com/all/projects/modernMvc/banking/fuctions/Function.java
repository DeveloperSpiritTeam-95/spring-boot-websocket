package com.all.projects.modernMvc.banking.fuctions;

import java.util.Random;

public class Function {

    // Function to generate a random account number
    public static String generateAccountNumber() {
        StringBuilder accountNumber = new StringBuilder();
        Random random = new Random();

        // Ensure the first digit is not zero to avoid leading zeros in the account number
        accountNumber.append(random.nextInt(9) + 1);

        // Generate the remaining digits
        for (int i = 1; i < 10; i++) {
            accountNumber.append(random.nextInt(10)); // Generate a random digit (0-9)
        }

        return accountNumber.toString();
    }


}
