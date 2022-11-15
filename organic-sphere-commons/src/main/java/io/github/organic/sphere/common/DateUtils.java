package io.github.organic.sphere.common;

import java.time.LocalDate;

/**
 * commons date utils
 *
 * @author <a href="mailto:maimengzzz@gmail.com">韩超</a>
 * @since 1.0.0
 */
public abstract class DateUtils {

    public static LocalDate addDays(LocalDate localDate, int days) {
        return localDate.plusDays(days);
    }

}
