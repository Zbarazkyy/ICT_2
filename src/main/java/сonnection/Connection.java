package сonnection;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Connection {

    public Connection() {
    }

    public static String connection() {

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api-joch.brickx.software/api/apiservice.svc/stockactualoverview?apikey=7ed20066-a436-4999-88c0-cec6f17f51fd"))
                .GET()
                .build();

        HttpResponse<String> response = null;
        try {

            response = client.send(request,
                    HttpResponse.BodyHandlers.ofString());
        } catch (
                IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String stringJSON = response.body();

        return stringJSON;
    }
}
