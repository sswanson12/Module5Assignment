package edu.wctc.Utilities;

import edu.wctc.Exceptions.MissingNameException;
import org.apache.commons.codec.language.Soundex;

public class LastNameUtility {
    private Soundex soundex = new Soundex();

    public String encodeLastName(String lastName) throws MissingNameException {
        if (lastName.isBlank() || lastName.isEmpty()){
            throw new MissingNameException("last name");
        } else {
            return soundex.encode(lastName);
        }
    }
}
