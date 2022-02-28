package edu.wctc;

public class DriversLicense {
    private String soundexCode;
    private String firstNameMiddleInitial;
    private String birthYear;
    private String birthMonthDayGender;
    private String overflow;

    public String getSoundexCode() {
        return soundexCode;
    }

    public void setSoundexCode(String soundexCode) {
        this.soundexCode = soundexCode;
    }

    public String getFirstNameMiddleInitial() {
        return firstNameMiddleInitial;
    }

    public void setFirstNameMiddleInitial(String firstNameMiddleInitial) {
        this.firstNameMiddleInitial = firstNameMiddleInitial;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getBirthMonthDayGender() {
        return birthMonthDayGender;
    }

    public void setBirthMonthDayGender(String birthMonthDayGender) {
        this.birthMonthDayGender = birthMonthDayGender;
    }

    public String getOverflow() {
        return overflow;
    }

    public void setOverflow(String overflow) {
        this.overflow = overflow;
    }
}
