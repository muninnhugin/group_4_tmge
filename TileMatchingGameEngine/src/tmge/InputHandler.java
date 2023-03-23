package tmge;

import java.util.Scanner;

class InputHandler {
    TMGE tmge;
    Scanner in;

    InputHandler(TMGE tmge) {
        this.tmge = tmge;
        in = new Scanner(System.in);
    }
    
    public Coordinate makeMove() {
        Coordinate result = null;
        do {
            String line = in.nextLine().strip();
            if (!line.isBlank()) {
                if (line.matches("\\d \\d")) {
                    Coordinate parsedInput = new Coordinate(line.charAt(0), line.charAt(2));
                    if (tmge.getMatrix().checkRange(parsedInput)) return parsedInput;
                }
            } 
            /* For GUI implementation
            else {
                return null;
            }
            */
        } while (result != null);
        return null;
    }
}
