package com.db.msApp.services.charts;

import java.util.Date;
import java.util.Random;

public final class RandomDateTimeGenerator {
    public static final Random RANDOM = new Random();

    public static Date getRandomDate(Date startDate, Date endDate) {
        long startMillis = startDate.getTime();
        long endMillis = endDate.getTime();
        long randomMillis = startMillis + (long) (RANDOM.nextDouble() * (endMillis - startMillis));
        return new Date(randomMillis);
    }

}
