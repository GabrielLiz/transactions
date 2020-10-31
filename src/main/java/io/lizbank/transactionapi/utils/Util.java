package io.lizbank.transactionapi.utils;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;


public class Util {

    private Util() {
    }

    public static int managementDate(String tr) {

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date transactionDate = sdf.parse(tr);
            Date today = sdf.parse(LocalDateTime.now().toString());

            if (transactionDate.compareTo(today) > 0) {
                return Constants.AFTER_TODAY;
            } else if (transactionDate.compareTo(today) < 0) {
                return Constants.BEFORE_TODAY;
            } else if (transactionDate.compareTo(today) == 0) {
                return Constants.TODAY;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return 0;
    }
}
