package edu.wctc.Formatters;

import edu.wctc.DriversLicense;
import edu.wctc.Interfaces.IDriversLicenseFormatter;

public class FloridaFormatter implements IDriversLicenseFormatter {
    @Override
    public String formatLicenseNumber(DriversLicense driversLicense) {
        //Returns them in a String in the format of SSSS-FFF-YY-DDD-N
        String soundexCode = driversLicense.getSoundexCode();
        String firstNameMiddleInitial = driversLicense.getFirstNameMiddleInitial();
        String birthYear = driversLicense.getBirthYear();
        String birthMonthDayGender = driversLicense.getBirthMonthDayGender();
        String overflow = driversLicense.getOverflow();

        return soundexCode + "-" + firstNameMiddleInitial + "-" + birthYear + "-" + birthMonthDayGender + "-" + overflow.charAt(0);
    }
}
