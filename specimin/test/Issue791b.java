package com.uber;

import org.jspecify.annotations.Nullable;

class Issue791b {
    static class B<T> {
        String build() {
            return "x";
        }
    }

    static String testNegative() {
        return new B<>().build();
    }
}
