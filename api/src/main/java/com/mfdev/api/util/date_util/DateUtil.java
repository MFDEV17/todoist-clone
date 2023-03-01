package com.mfdev.api.util.date_util;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateUtil {

    public static LocalDateTime setDeadlineDate(DefaultDeadline deadline) {
        LocalDateTime now = LocalDateTime.now();

        switch (deadline) {
            case TODAY -> {
                return now.plusSeconds(
                        LocalTime.MAX
                                .minusSeconds(
                                        now.toLocalTime().toSecondOfDay()
                                )
                                .toSecondOfDay()
                );
            }

            case TOMORROW -> {
                return now.plusSeconds(
                        LocalTime.MAX
                                .minusSeconds(
                                        now.toLocalTime().toSecondOfDay()
                                )
                                .toSecondOfDay()
                ).plusDays(1L);
            }

            case WEEKEND -> {
                while (now.getDayOfWeek() != DayOfWeek.SATURDAY) {
                    now = now.plusDays(1L);
                }

                return now.plusSeconds(
                        LocalTime.MAX
                                .minusSeconds(
                                        now.toLocalTime().toSecondOfDay()
                                )
                                .toSecondOfDay()
                );
            }

            case NEXT_WEEK -> {
                while (now.getDayOfWeek() != DayOfWeek.SUNDAY) {
                    now = now.plusDays(1L);
                }

                return now.plusSeconds(
                        LocalTime.MAX
                                .minusSeconds(
                                        now.toLocalTime().toSecondOfDay()
                                )
                                .toSecondOfDay()
                ).plusDays(1L);
            }

            default -> {
                return null;
            }
        }
    }

    public static LocalDateTime setDeadlineDate(LocalDateTime date) {
        return date.plusSeconds(
                LocalTime.MAX.minusSeconds(date.toLocalTime().toSecondOfDay()).toSecondOfDay()
        );
    }
}