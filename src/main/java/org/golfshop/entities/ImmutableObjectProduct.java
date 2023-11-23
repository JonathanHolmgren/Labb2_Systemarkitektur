package org.golfshop.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public record ImmutableObjectProduct(
        int id,
        String name,
        double rating,
        double price,
        Category category,
       String createdDate,
        String lastmodified
) {



}
