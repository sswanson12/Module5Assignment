package edu.wctc;

import edu.wctc.Exceptions.InvalidBirthdayException;
import edu.wctc.Exceptions.MissingNameException;
import edu.wctc.Exceptions.UnknownGenderCodeException;
import edu.wctc.Formatters.FloridaFormatter;
import edu.wctc.Formatters.WisconsinFormatter;
import edu.wctc.Utilities.FirstNameUtility;
import edu.wctc.Utilities.LastNameUtility;
import edu.wctc.Utilities.MonthDayGenderUtility;

import java.time.Month;
import java.time.MonthDay;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        FirstNameUtility fnu = new FirstNameUtility();
        LastNameUtility lnu = new LastNameUtility();
        MonthDayGenderUtility mdgu = new MonthDayGenderUtility();
        FloridaFormatter floridaFormatter = new FloridaFormatter();
        WisconsinFormatter wisconsinFormatter = new WisconsinFormatter();

        System.out.print("Welcome to my driver's license formatter!\n" +
                "Please start by entering your first name: ");
        String firstName = scan.nextLine();

        System.out.print("Middle initial: ");
        String middleInitial = scan.nextLine();

        System.out.print("Last name: ");
        String lastName = scan.nextLine();

        System.out.print("Please enter your birthday - \nYear: ");
        int birthYear = scan.nextInt();

        System.out.print("Month (number): ");
        int birthMonth = scan.nextInt();

        System.out.print("Day: ");
        int birthDay = scan.nextInt();

        String genderCodeString;
        do {
            System.out.print("Gender ('M' or 'F'): ");
            genderCodeString = scan.nextLine();
        } while (genderCodeString.isEmpty());

        char genderCode = genderCodeString.charAt(0);

        try {
            DriversLicense license = new DriversLicense();

            license.setSoundexCode(lnu.encodeLastName(lastName));

            license.setFirstNameMiddleInitial(String.valueOf(fnu.encodeFirstName(firstName, middleInitial)));

            license.setBirthYear(String.valueOf(birthYear));

            license.setBirthMonthDayGender(String.valueOf(mdgu.encodeMonthDayGender(birthYear, birthMonth, birthDay, genderCode)));

            license.setOverflow("00");

            System.out.printf("Wisconsin License: %s\nFlorida License: %s", wisconsinFormatter.formatLicenseNumber(license), floridaFormatter.formatLicenseNumber(license));

        } catch (MissingNameException | UnknownGenderCodeException | InvalidBirthdayException e) {
            e.printStackTrace();
        }
    }
}
