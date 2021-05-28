package parser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import entity.GetStockActualOverviewResult;
import entity.Root;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class Parser {
    public static List<GetStockActualOverviewResult> parser(String s) {
        ObjectMapper mapper = new ObjectMapper();
        Root root = null;
        try {
            root = mapper.readValue(s, Root.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<GetStockActualOverviewResult> list = root.getStockActualOverviewResult;
        return list;
    }
}




