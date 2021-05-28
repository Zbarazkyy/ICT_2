package entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetStockActualOverviewResult {
    @JsonProperty("Active")
    public boolean active;
    @JsonProperty("AttributeCombination")
    public String attributeCombination;
    @JsonProperty("AvailableStock")
    public double availableStock;
    @JsonProperty("Code")
    public String code;
    @JsonProperty("CurrentPurchased")
    public double currentPurchased;
    @JsonProperty("CurrentReservations")
    public double currentReservations;
    @JsonProperty("CurrentStock")
    public double currentStock;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("ProductId")
    public int productId;

    public GetStockActualOverviewResult() {
    }

    public GetStockActualOverviewResult(boolean active, String attributeCombination, double availableStock, String code, double currentPurchased, double currentReservations, double currentStock, String name, int productId) {
        this.active = active;
        this.attributeCombination = attributeCombination;
        this.availableStock = availableStock;
        this.code = code;
        this.currentPurchased = currentPurchased;
        this.currentReservations = currentReservations;
        this.currentStock = currentStock;
        this.name = name;
        this.productId = productId;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getAttributeCombination() {
        return attributeCombination;
    }

    public void setAttributeCombination(String attributeCombination) {
        this.attributeCombination = attributeCombination;
    }

    public double getAvailableStock() {
        return availableStock;
    }

    public void setAvailableStock(double availableStock) {
        this.availableStock = availableStock;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getCurrentPurchased() {
        return currentPurchased;
    }

    public void setCurrentPurchased(double currentPurchased) {
        this.currentPurchased = currentPurchased;
    }

    public double getCurrentReservations() {
        return currentReservations;
    }

    public void setCurrentReservations(double currentReservations) {
        this.currentReservations = currentReservations;
    }

    public double getCurrentStock() {
        return currentStock;
    }

    public void setCurrentStock(double currentStock) {
        this.currentStock = currentStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "GetStockActualOverviewResult{" +
               "active=" + active +
               ", attributeCombination='" + attributeCombination + '\'' +
               ", availableStock=" + availableStock +
               ", code='" + code + '\'' +
               ", currentPurchased=" + currentPurchased +
               ", currentReservations=" + currentReservations +
               ", currentStock=" + currentStock +
               ", name='" + name + '\'' +
               ", productId=" + productId +
               '}';
    }
}
