package exceptions;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        ReadingFile.readFile("");
        System.out.println("Code after exception");
    }
}
