package com.api.lapwing.security;

public class Credentials {
    private static String aws_key = "";
    private static String aws_secret = "";

    public static String getAws_key() {
        return aws_key;
    }

    public static String getAws_secret() {
        return aws_secret;
    }
}
