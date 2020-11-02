package io.lizbank.transactionapi.utils;

public final class Constants {

    private Constants() {
    }

    public static final int TODAY = 0;
    public static final int BEFORE_TODAY = -1;
    public static final int AFTER_TODAY = 1;

    /**
     * Channel
     * **/
    public static final String INVALID = "INVALID";
    public static final String PENDING = "PENDING";
    public static final String FUTURE = "FUTURE";
    public static final String SETTLED = "SETTLED";


    /**
     * Channel
     * **/
    public static final String CLIENT = "CLIENT";
    public static final String ATM = "ATM";
    public static final String INTERNAL = "INTERNAL";

    /**
     * SORT
     * **/
    public static final String ASC = "ASC";
    public static final String DESC = "DESC";

}
