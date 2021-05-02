package utils;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Random;

public class RandomUtil {

        private static Random random = new Random();

        public static String getRandomItem() {
            int leftLimit = 97; // letter 'a'
            int rightLimit = 122; // letter 'z'


            int targetStringLength = getNumberBetween(0,50);
            StringBuilder buffer = new StringBuilder(targetStringLength);
            for (int i = 0; i < targetStringLength; i++) {
                int randomLimitedInt = getNumberBetween(leftLimit,rightLimit);
                buffer.append((char) randomLimitedInt);
            }
            String generatedString = buffer.toString();
            return  generatedString;

        }
        public static int getNumberBetween(int leftLimit, int rightLimit) {
            return  leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));

        }
}
