package edu.wctc.Formatters;

import edu.wctc.DriversLicense;
import edu.wctc.Interfaces.IDriversLicenseFormatter;

public class WisconsinFormatter implements IDriversLicenseFormatter {
    @Override
    public String formatLicenseNumber(DriversLicense driversLicense) {
        //Returns them in a String in the format of SSSS-FFFY-YDDD-NN
        String soundexCode = driversLicense.getSoundexCode();
        String firstNameMiddleInitial = driversLicense.getFirstNameMiddleInitial();
        String birthYear = driversLicense.getBirthYear();
        String birthMonthDayGender = driversLicense.getBirthMonthDayGender();
        String overflow = driversLicense.getOverflow();

        return soundexCode + "-" + firstNameMiddleInitial + birthYear.charAt(2) + "-" + birthYear.charAt(3) + birthMonthDayGender + "-" + overflow;
    }
}
