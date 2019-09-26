package com.dmytrobilokha.nullablevscheckfornull;

import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class App {

    public static void main(@Nonnull String[] args) {
        checkLength(args[0]);
        checkLengthNullable(args[0]);
        checkLengthCheckForNull(args[0]);
    }

    private static void checkLength(String argument) {
        System.out.println("Non-annotated got length: " + argument.length());
    }

    private static void checkLengthNullable(@Nullable String argument) {
        System.out.println("Nullable got length: " + argument.length());
    }

    private static void checkLengthCheckForNull(@CheckForNull String argument) {
        System.out.println("CheckForNull got length: " + argument.length());
    }

    private void hello(@CheckForNull String argument) {

    }

}
