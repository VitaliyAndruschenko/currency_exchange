package ru.skillbox.currency.exchange.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyDtoAbbreviated {
    private String name;
    private Double value;
}
