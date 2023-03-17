package tmge;

import java.util.Scanner;

public class InputHandlerLogic {
    Scanner in;


    InputHandlerLogic() {
        in = new Scanner(System.in);
    }
    
    public Coordinate makeMove() {
        String result = in.nextLine().strip();
        if (!result.isBlank()) {
            result.split(result, 0)
        }
        return null;
    }
}
