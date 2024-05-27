import com.google.gson.*;

import java.net.URI;
import  java.net.http.HttpRequest;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.io.IOException;

public class Main {


    public Conversor conversor  (String baseCurrency, String targetCurrency, Double value)  {
        Gson gson = new Gson();

        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/c78f2b4ed7b94cf2485135b9/pair/" + baseCurrency +  "/"  + targetCurrency  + "/"  + value);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(),Conversor.class);

        } catch (Exception e) {
            throw new RuntimeException("Não foi possível converter essa opção.");
        }

    }
}