package oop.secure;

import java.util.Arrays;

public class SslSecure {

    private final String DOMAIN = ".com";
    private final int DOMAIN_LENGTH = DOMAIN.length();
    private final String PROTOCOL = "http";
    private final int PROTOCOL_LENGTH = PROTOCOL.length();
    private final String PROTOCOL_SECURE = "https";

    public String[] urlWebSites(String[] urls) {
        String[] urlsModified = new String[urls.length];
        for (int i = 0; i < urls.length; i++) {
            StringBuilder stringBuilder = new StringBuilder(urls[i]);
            int index = stringBuilder.indexOf(PROTOCOL);
            stringBuilder.replace(index, index + PROTOCOL_LENGTH, PROTOCOL_SECURE);
            index = stringBuilder.indexOf(DOMAIN);
            urlsModified[i] = stringBuilder.substring(0, index + DOMAIN_LENGTH +1);
        }

        return urlsModified;
    }
}