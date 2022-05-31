package IO;

import java.io.IOException;
import java.io.InputStream;

public class Main {

        public static int checkSumOfStream(InputStream inputStream) throws IOException {
            int controlSumma;
            int n;
            int Cn = 0;
            int bn = 0;
            for (int i = 0;((bn = inputStream.read()) > 0) && (i <= n-1);i++) {
                Cn = Cn + bn;
                if (i == n-1){

                }
            }
            while ((bn = inputStream.read()) > 0){
                int i = 1;
                if (i <= n) {
                    i = i+1;
                   Cn = Cn + bn;
                }
                else {
                    if (i == n+1) {
                        bn = inputStream.read();              // bn + 1
                    }
                }
            }
            controlSumma = Integer.rotateLeft(Cn,1) ^ bn;
            return controlSumma;
        }
}
