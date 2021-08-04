package com.helper.fortyk.crusademanager.crusades.domain.users;

import com.helper.fortyk.crusademanager.crusades.domain.users.model.Email;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class EmailTest {

    @ParameterizedTest
    @MethodSource(value = "validEmails")
    void testConstructionWithValidAddresses(String emailAddress) {
        try{
            var email = Email.of(emailAddress);

        } catch (IllegalArgumentException e){
            var message = emailAddress + "is not a valid email";
            Assertions.fail(message);
        }

    }

    private static Stream<Arguments> validEmails() {
        return Stream.of(
                Arguments.of("email@example.com"),
                Arguments.of("firstname.lastname@example.com"),
                Arguments.of("email@subdomain.example.com"),
                Arguments.of("firstname+lastname@example.com"),
                Arguments.of("email@example-one.com"),
                Arguments.of("email@example.name"),
                Arguments.of("email@example.museum"),
                Arguments.of("email@example.co.jp"),
                Arguments.of("firstname-lastname@example.com")
        );
    }
}
