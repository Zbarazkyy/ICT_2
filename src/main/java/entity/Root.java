package entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Root {
    @JsonProperty("GetStockActualOverviewResult")
    public List<GetStockActualOverviewResult> getStockActualOverviewResult;

    public Root() {
    }

    public Root(List<GetStockActualOverviewResult> getStockActualOverviewResult) {
        this.getStockActualOverviewResult = getStockActualOverviewResult;
    }

    public List<GetStockActualOverviewResult> getGetStockActualOverviewResult() {
        return getStockActualOverviewResult;
    }

    public void setGetStockActualOverviewResult(List<GetStockActualOverviewResult> getStockActualOverviewResult) {
        this.getStockActualOverviewResult = getStockActualOverviewResult;
    }
}

