package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static boolean fNameValidate(String fName) throws CustomException{
        String pattern = "^[A-Z][a-zA-Z]+$";
        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(fName);
        if(matcher.matches()){
            return true;
        } else {
            throw new CustomException("Invalid First name");
        }
    }

    public static boolean lNameValidate(String lName) throws CustomException{
        String pattern = "^[A-Z][a-zA-Z]+$";
        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(lName);
        if(matcher.matches()){
            return true;
        } else {
            throw new CustomException("Invalid last name");
        }
    }

    public static boolean emailValidate(String email) throws CustomException{
        String pattern2 = "^[a-zA-Z0-9.%+-]+\\.[a-zA-Z0-9.%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}(\\.[a-zA-Z]{2,6})?$";
        Pattern compiledPattern2 = Pattern.compile(pattern2);
        Matcher matcher3 = compiledPattern2.matcher(email);
        if(matcher3.matches()){
            return true;
        } else {
            throw new CustomException("Invalid email");
        }
    }

    public static boolean phoneNumberValidate(String phoneNumber) throws CustomException{
        String mobileRegex = "^\\d{2} \\d{10}$";
        Pattern CompiledMobile = Pattern.compile(mobileRegex);
        Matcher matcherPhone =CompiledMobile.matcher(phoneNumber);
        if(matcherPhone.matches()){
            return true;
        } else {
            throw new CustomException("Invalid Phone number");
        }
    }

    public static boolean passwordValidate(String password) throws CustomException{
        String pass = "^(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+{}\\[\\]:;\"'<>,.?~`]).{8,}$";
        Pattern compiledPassword=Pattern.compile(pass);
        Matcher matchPassword=compiledPassword.matcher(password);
        if(matchPassword.matches()){
            return true;
        } else {
            throw new CustomException("Invalid Phone number");
        }
    }

    public static void main(String[] args) throws CustomException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name:");
        String fName = sc.next();
        System.out.println(fNameValidate(fName));

        System.out.println("Enter last name:");
        String lName = sc.next();
        System.out.println(lNameValidate(lName));

        System.out.println("Enter the number of emails: ");
        int n=sc.nextInt();
        for (int i=0;i<n;i++) {
            System.out.println("Enter email-id no"+(i+1)+": ");
            String email = sc.next();
            System.out.println(emailValidate(email));
        }

        System.out.println("Enter mobile number with country code, space followed by 10 digit number: ");
        sc.nextLine();
        String phoneNumber=sc.nextLine();
        System.out.println(phoneNumberValidate(phoneNumber));

        System.out.println("Enter password minimum 8 characters, at least 1 uppercase and 1 number and exactly 1 special character: ");
        String password=sc.nextLine();
        System.out.println(passwordValidate(password));
    }
}
