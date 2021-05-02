import lombok.SneakyThrows;
import model.Quote;
import model.Status;
import sertvices.FileService;
import sertvices.FileServiceImpl;
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
            FileService fileService = new FileServiceImpl();
                fileService.saveQuote(QuoteFactory.createRandomQuote(i));
            Thread.sleep(1000);
        }
    }
}
