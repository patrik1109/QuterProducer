package utils;

import model.Quote;
import model.Status;

import java.util.List;
import java.util.function.Supplier;

public class QuoteFactory {

    public static Quote createRandomQuote(int id) {
       String text = RandomUtil.getRandomItem();
       Status status = Status.findByDbCode(text.length());
       Quote quote = new Quote(id,text,status);
       return quote;
    }
}
