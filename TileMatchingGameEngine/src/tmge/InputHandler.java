package tmge;

import java.util.Scanner;

public class InputHandler {
    TMGE tmge;
    Scanner in;

    InputHandler(TMGE tmge, Scanner in) {
        this.tmge = tmge;
        this.in = in;
    }
    
    public Coordinate makeMove() {
        Coordinate result = null;
        do {
            String line = in.nextLine().strip();
            if (!line.isBlank()) {
                if (line.matches("\\d \\d")) {
                    Coordinate parsedInput = new Coordinate(Character.getNumericValue(line.charAt(0)), Character.getNumericValue(line.charAt(2)));
                    if (tmge.getMatrix().checkRange(parsedInput)) return parsedInput;
                }
            } 
            /* For GUI implementation
            else {
                return null;
            }
            */
        } while (result == null);
        return null;
    }
}
