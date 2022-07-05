package model;

import java.math.BigDecimal;

public class Fine {
    private Client client;
    private BigDecimal fineValue;
    private int finesApplieds;

    public Fine(Client client, BigDecimal fineValue){
        this.client = client;
        this.fineValue = fineValue;
        this.finesApplieds++;
    }

    public Client getClient() {
        return client;
    }

    public int getFinesApplieds() {
        return finesApplieds;
    }

    public BigDecimal getFineValue() {
        return fineValue;
    }
}
