package com.all.projects.modernMvc.employeetracking.fuctions;

import com.all.projects.modernMvc.employeetracking.employee.wrappers.EmployeeDto;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class ValidateField {

    public static boolean validateEmployeeDetails(@NotNull EmployeeDto employeeDto){
        if (!employeeDto.getFirstName().isEmpty() &&
                !employeeDto.getLastName().isEmpty() &&
                !employeeDto.getEmpCode().isEmpty() &&
                !employeeDto.getEmailId().isEmpty() &&
                !employeeDto.getCompanyEmailId().isEmpty() &&
                !employeeDto.getPhoneNumber().isEmpty() &&
                !employeeDto.getAadhaarNumber().isEmpty() &&
                !employeeDto.getPanCard().isEmpty() &&
                employeeDto.getCreatePassword().equals(employeeDto.getConfirmPassword()) &&
                !employeeDto.getSalary().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validateEmail(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }

    public static boolean validatePassword(String password){
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#\\$%^&+=]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        if (matcher.matches()) {
            System.out.println("Password is valid");
            return true;
        } else {
            System.out.println("Password is invalid");
            return false;
        }
    }


    public static boolean validatePhoneNumber(String number) {
        String regex = "^\\d{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(number);

        return matcher.matches();
    }
}
