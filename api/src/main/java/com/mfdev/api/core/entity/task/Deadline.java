package com.mfdev.api.core.entity.task;

import com.mfdev.api.util.date_util.DefaultDeadline;

import java.time.LocalDateTime;

import static com.mfdev.api.util.date_util.DateUtil.setDeadlineDate;

public enum Deadline {
    NEXT_WEEK(setDeadlineDate(DefaultDeadline.NEXT_WEEK)),
    NO_DEADLINE(setDeadlineDate(DefaultDeadline.NO_DEADLINE)),
    TODAY(setDeadlineDate(DefaultDeadline.TODAY)),
    TOMORROW(setDeadlineDate(DefaultDeadline.TOMORROW)),
    WEEKEND(setDeadlineDate(DefaultDeadline.WEEKEND));

    private final LocalDateTime date;

    Deadline(LocalDateTime dateTime) {
        this.date = dateTime;
    }

    public LocalDateTime getDate() {
        return this.date;
    }
}
