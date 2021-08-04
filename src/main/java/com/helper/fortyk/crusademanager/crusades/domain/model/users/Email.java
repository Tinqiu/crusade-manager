package com.helper.fortyk.crusademanager.crusades.domain.model.users;

import lombok.AccessLevel;
import lombok.Getter;

import java.util.regex.Pattern;

@Getter
public class Email {
    private final String value;
    private final String localpart;
    private final String domain;
    @Getter(AccessLevel.NONE)
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^(?:\\w+.)+@\\w.\\w{2,9}");

    private Email(String emailString) {
        validateEmailPattern(emailString);
        var splitAddress = emailString.split("@");
        this.value = emailString;
        localpart = splitAddress[0];
        domain = splitAddress[1];
    }

    public static Email of(String emailAddress) {
        return new Email(emailAddress);
    }

    private void validateEmailPattern(String emailString) {
        var matcher = EMAIL_PATTERN.matcher(emailString);
        if (!matcher.find())
            throw new IllegalArgumentException("email invalid");
    }
}
