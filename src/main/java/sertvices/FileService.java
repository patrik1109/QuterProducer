package sertvices;

import model.Quote;

import java.io.File;
import java.io.IOException;

public interface FileService {
        public  boolean saveQuote( Quote quote) throws IOException;
}
