package IO;

import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int Cn = 0;
        int bn;
        while ((bn = inputStream.read()) > -1) {
            Cn = Integer.rotateLeft(Cn, 1) ^ bn;
        }
        return Cn;
    }
}
