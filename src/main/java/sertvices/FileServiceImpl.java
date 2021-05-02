package sertvices;

import model.Quote;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileServiceImpl implements FileService{
    private  final String path ="d:\\tmp\\";
    @Override
    public  boolean saveQuote( Quote quote) throws IOException {
        File file = createFile();
        if (file == null) {
            return false;
        }
        file.createNewFile();
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(quote);
                oos.close();
        return true;

    }
    private  File createFile(){
        LocalDateTime now = LocalDateTime.now();
        String fileName = now.format(DateTimeFormatter.ofPattern("yyyy.MM.dd.hh.mm.ss"));
            try {
                File file = new File(path + fileName);
                return file;
            }
            catch (Exception e){
                System.out.println(e.getStackTrace());
            }
        return null;
    }
}
