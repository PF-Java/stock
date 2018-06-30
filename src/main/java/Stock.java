public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public double getChangePercent(double previousClosingPrice, double currentPrice) {
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
        return (currentPrice - previousClosingPrice) / previousClosingPrice * 100;
    }

}
