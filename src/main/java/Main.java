import entity.GetStockActualOverviewResult;
import parser.Parser;
import сonnection.Connection;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<GetStockActualOverviewResult> list = Parser.parser(Connection.connection());

        for (GetStockActualOverviewResult temp : list) {
            System.out.println(" Active = " + temp.isActive()
                               + ", Attribute Combination = " + temp.getAttributeCombination()
                               + ", AvailableStock = " + temp.getAvailableStock()
                               + ", Code = " + temp.getCode() +
                               ", Current Purchased = " + temp.getCurrentPurchased() +
                               ", Current Reservations =" + temp.getCurrentPurchased() +
                               ", CurrentStock = " + temp.getCurrentStock() +
                               ", Name =" + temp.getName() +
                               ", ProductId = " + temp.getProductId());
        }

    }
}
