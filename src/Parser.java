import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Parser {
    public static void parseJson(String url) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        Currency[] currencies = objectMapper.readValue(new URL(url), Currency[].class);

        for (Currency currency : currencies) {
            System.out.println(currency);
        }

        String jsonString = objectMapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(currencies);

        Files.write(Paths.get("C:\\Users\\abalm\\odrive\\Google Drive IT\\IteaJavaPro\\JSON\\src\\creditDetails.json"),
                jsonString.getBytes(), StandardOpenOption.CREATE);
    }
}

