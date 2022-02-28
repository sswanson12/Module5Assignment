package edu.wctc.Utilities;

import edu.wctc.Exceptions.InvalidBirthdayException;
import edu.wctc.Exceptions.UnknownGenderCodeException;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;

public class MonthDayGenderUtility {
    private final int MOD_MALE = 0;
    private final int MOD_FEMALE = 500;
    private final char CODE_MALE = 'M';
    private final char CODE_FEMALE = 'F';

    public int encodeMonthDayGender(int year, int month, int day, char genderCode) throws UnknownGenderCodeException, InvalidBirthdayException {
        if (!(genderCode == CODE_MALE || genderCode == CODE_FEMALE)){
            throw new UnknownGenderCodeException(genderCode);
        } else if (!dateChecker(year, month, day)) {
            throw new InvalidBirthdayException(year, month, day);
        } else {
            if (genderCode == CODE_FEMALE){
                return ((month - 1) * 40 + day + MOD_FEMALE);
            } else {
                return (month - 1) * 40 + day + MOD_MALE;
            }
        }
    }

    private boolean dateChecker(int year, int month, int day) {
        try {
            LocalDate dateCreationAttempt = LocalDate.of(year, month, day);
            return true;
        } catch(DateTimeException e) {
            return false;
        }
    }
}
