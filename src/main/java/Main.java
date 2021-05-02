import lombok.SneakyThrows;
import model.Quote;
import model.Status;
import utils.QuoteFactory;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.List;
import java.util.Locale;

public class Main {

    @SneakyThrows
    public static void main(String[] args) {
        final String string = "Si vis pacem para belum";
        for (int i = 1; i < 6; i++) {
            LocalDateTime now = LocalDateTime.now();
            String fileName = now.format(DateTimeFormatter.ofPattern("yyyy.MM.dd.hh.mm.ss"));
            File file = new File("d:\\tmp\\" + fileName);
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            //Quote quote = new Quote(i, string, Status.findByDbCode(string.length()));
               Quote quote = QuoteFactory.createRandomQuote(i);
                   FileOutputStream fos = new FileOutputStream(file);
                   ObjectOutputStream oos = new ObjectOutputStream(fos);
                        oos.writeObject(quote);
                        try {
                            oos.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
            Thread.sleep(1000);
        }
    }
}
