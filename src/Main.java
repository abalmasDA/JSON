import java.io.IOException;


/**
 * взяти будь яку api будь якого банку та розпарсити за допомогою json
 */


public class Main {
    public static void main(String[] args) throws IOException {
        Parser.parseJson("https://api.monobank.ua/bank/currency");
    }
}