package org.example;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class BankAcc {
    private BigDecimal value;
    private String currency;
    private String entryTime;

    public BankAcc(BigDecimal value, String currency) {
        this.entryTime = LocalTime.now().truncatedTo(ChronoUnit.SECONDS).format(DateTimeFormatter.ISO_LOCAL_TIME);
        this.value = value;
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "BankAcc{" +
                "value=" + value +
                ", currency='" + currency + '\'' +
                ", entryTime='" + entryTime + '\'' +
                '}';
    }
}
