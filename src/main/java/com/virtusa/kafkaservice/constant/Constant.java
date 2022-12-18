package com.virtusa.kafkaservice.constant;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Constant {

    public static final String TWO_VALUES = "{} -> {}";
    public static final String THREE_VALUES = "{} -> {} -> {}";
    public static final String FOUR_VALUES = "{} -> {} -> {} -> {}";
    public static final String FIVE_VALUES = "{} -> {} -> {} -> {} -> {}";

    /**
     * StatuCode
     */
    public static final int SUCCESS_CODE = 1000;
    public static final int FAILED_CODE = 1001;
    public static final int ERROR_CODE = 1002;
    public static final int FORBIDDEN_CODE = 1003;

    public static final String SUCCESS = "SUCCESS";
    public static final String FAILED = "FAILED";
    public static final String STATUS = "STATUS";
    public static final String DATA = "DATA";
    public static final String MESSAGE = "MESSAGE";
    public static final String ERROR = "ERROR";
}
