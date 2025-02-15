package org.future.lkapp.Solutions.lengthoflongestsubstring;

import java.util.Arrays;
import java.text.MessageFormat;

public enum DayOfWeek {
    MONDAY("Mon"),
    TUESDAY("Tue"),
    WENESDAY("Wed"),
    THURSDAY("Thu"),
    FRIDAY("Fr"),
    SATURDAY("Sa"),
    SUNDAY("Su");

    private final String label;

    DayOfWeek(String string) {
        this.label = string;
    }

    public static DayOfWeek findByLabel(String label) {

        return Arrays.stream(values())
                .filter(dayOfWeek -> dayOfWeek.label.equals(label)).findFirst()
                .orElseThrow(
                        () -> new IllegalArgumentException(MessageFormat.format("Unknown enum label: {0}", label)));
    }

}
