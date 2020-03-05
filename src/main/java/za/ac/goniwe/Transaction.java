package za.ac.goniwe;

import java.util.Objects;

public class Transaction {
    private String sourceName;
    private String destinationName;
    private Long sum;

    public Transaction(String sourceName, String destinationName, Long sum) {
        this.sourceName = sourceName;
        this.destinationName = destinationName;
        this.sum = sum;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public Long getSum() {
        return sum;
    }

    public void setSum(Long sum) {
        this.sum = sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return Objects.equals(sourceName, that.sourceName) &&
                Objects.equals(destinationName, that.destinationName) &&
                Objects.equals(sum, that.sum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceName, destinationName, sum);
    }
}
