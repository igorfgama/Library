package enums;

import java.math.BigDecimal;

public enum TypeBook {
    THRILLER(new BigDecimal("1.00")),
    DRAMA(new BigDecimal("1.10")),
    ROMANCE(new BigDecimal("1.20")),
    BIOGRAFY(new BigDecimal("0.90")),
    ANIME(new BigDecimal("0.80")),
    KID(new BigDecimal("1.30"));

    private BigDecimal bookDailyValue;

    TypeBook(BigDecimal bookDailyValue){
        this.bookDailyValue = bookDailyValue;
    }

    public BigDecimal getBookDailyValue(TypeBook typeBook){
        switch (typeBook){
            case ANIME -> { return ANIME.bookDailyValue; }
            case KID -> { return KID.bookDailyValue; }
            case BIOGRAFY -> { return BIOGRAFY.bookDailyValue; }
            case DRAMA -> { return DRAMA.bookDailyValue; }
            case ROMANCE -> { return ROMANCE.bookDailyValue; }
            case THRILLER -> { return THRILLER.bookDailyValue; }
        }
        return null;
    }
}
