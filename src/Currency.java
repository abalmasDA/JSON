import com.fasterxml.jackson.annotation.JsonProperty;

public class Currency {
    @JsonProperty("currencyCodeA")
    private int currencyCodeA;
    @JsonProperty("currencyCodeB")
    private int currencyCodeB;
    @JsonProperty("date")
    private int date;
    @JsonProperty("rateSell")
    private float rateSell;
    @JsonProperty("rateBuy")
    private float rateBuy;
    @JsonProperty("rateCross")
    private float rateCross;

    public Currency() {
    }

    public Currency(int currencyCodeA, int currencyCodeB, int date, float rateSell, float rateBuy, float rateCross) {
        this.currencyCodeA = currencyCodeA;
        this.currencyCodeB = currencyCodeB;
        this.date = date;
        this.rateSell = rateSell;
        this.rateBuy = rateBuy;
        this.rateCross = rateCross;
    }

    public int getCurrencyCodeA() {
        return currencyCodeA;
    }

    public int getCurrencyCodeB() {
        return currencyCodeB;
    }

    public int getDate() {
        return date;
    }

    public float getRateSell() {
        return rateSell;
    }

    public float getRateBuy() {
        return rateBuy;
    }

    public float getRateCross() {
        return rateCross;
    }

    public void setCurrencyCodeA(int currencyCodeA) {
        this.currencyCodeA = currencyCodeA;
    }

    public void setCurrencyCodeB(int currencyCodeB) {
        this.currencyCodeB = currencyCodeB;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setRateSell(float rateSell) {
        this.rateSell = rateSell;
    }

    public void setRateBuy(float rateBuy) {
        this.rateBuy = rateBuy;
    }

    public void setRateCross(float rateCross) {
        this.rateCross = rateCross;
    }
    @Override
    public String toString() {
        return "Currency{" +
                "currencyCodeA=" + currencyCodeA +
                ", currencyCodeB=" + currencyCodeB +
                ", date=" + date +
                ", rateSell=" + rateSell +
                ", rateBuy=" + rateBuy +
                ", rateCross=" + rateCross +
                '}';
    }

}
