package tmgeclient;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import tmge.TileMatrix;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.shape.Circle;



//method that takes in board 
public class hellofx extends Application {

    Stage ps;
    GridPane pane;


    @Override
    public void start(Stage primaryStage) throws Exception{
        this.ps = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("hellofx.fxml"));
        this.ps.setScene(new Scene(initGrid(root)));
        this.ps.show();
    }

    private Parent initGrid(Parent root)
    {

        int rows = 5;
        int columns = 5;
        this.ps.setTitle("TMGE");
        this.ps.setResizable(false);
        pane = new GridPane();

         
        for(int i = 0; i < columns; i++) {
            pane.getColumnConstraints().add(new ColumnConstraints(100));
        }

        for(int i = 0; i < rows; i++) {
            pane.getRowConstraints().add(new RowConstraints(100));
        }

        pane.setGridLinesVisible(true);
        //Shape sh = makeGrid();
        //grid.getChildren().add(sh);
        return pane;
    }



    /* 
    public Shape makeGrid()
    {
        Shape shape = new Circle();
        return shape;
    }
    */

    public static void main(String[] args) {
        launch(args);
    }
}
