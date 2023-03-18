package tmge;

import java.util.Scanner;

public class InputHandlerLogic {
    Scanner in;


    InputHandlerLogic() {
        in = new Scanner(System.in);
    }
    
    public Coordinate makeMove() {
        Coordinate result = null;
        do {
            String line = in.nextLine().strip();
            if (!line.isBlank()) {
                if (line.matches("\\d \\d")) {
                    return new Coordinate(line.charAt(0), line.charAt(2));
                }
            } else {
                return null;
            }
        } while (result != null);
        return null;
    }
}
