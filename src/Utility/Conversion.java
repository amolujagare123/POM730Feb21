package Utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversion {

    public static String convertCountry(String shortCountry) {
        String countryFullForm = "";

        switch (shortCountry) {
            case "IN":
                countryFullForm = "India";
                break;
            case "AF":
                countryFullForm = "Afghanistan";
                break;
            case "AO":
                countryFullForm = "Angola";
                break;
            case "DZ":
                countryFullForm = "Algeria";
                break;
            case "AS":
                countryFullForm = "American Samoa";
                break;
        }

        return countryFullForm;
    }

    public static String genderFullForm(String genderId) {
        String genderLong = "";

        switch (genderId) {
            case "0":
                genderLong = "Male";
                break;
            case "1":
                genderLong = "Female";
                break;
            case "2":
                genderLong = "Other";
                break;
        }

        return genderLong;
    }


    public static String convertDate(String dateDB) throws ParseException // 1985-09-24
    {
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateDB);

        // FDS - FORMAT --> DATE TO STRING
        // PSD - PARSE --> STRING TO DATE

       return new SimpleDateFormat("MM/dd/yyyy").format(date);   // string
        // --> 09/24/1985
    }
}
