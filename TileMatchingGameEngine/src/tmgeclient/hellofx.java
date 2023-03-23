package tmgeclient;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.stage.Stage;
import tmge.Coordinate;
import tmge.Tile;
import tmge.TileMatrix;
import tmge.logic.FullSpawn;
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
    TileMatrix tm = new TileMatrix(8,8);

    int tileSize = 80;


    

    public void startGame(TileMatrix matrix, String[] args)
    {
        tm = matrix;
        launch(args);

    }

 
    private Image createImage(Color color) {
        WritableImage image = new WritableImage(1, 1);
        image.getPixelWriter().setColor(0, 0, color);
        return image ;
    }


    @Override
    public void start(Stage primaryStage) throws Exception{
        this.ps = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("hellofx.fxml"));

        this.ps.setTitle("TMGE");
        this.ps.setResizable(false);
        //primaryStage.setScene(new Scene(root, 700, 500));

        GridPane gridPane = new GridPane();

        // for visualizing the different squares:
        gridPane.setHgap(2);
        gridPane.setVgap(2);
        gridPane.setStyle("-fx-background-color: black;");
        //this.ps.setScene(new Scene(initGrid(root)));
        FullSpawn fs = new FullSpawn();
        fs.spawn(tm);

        for (int y = 0 ; y < tm.getRow() ; y++) {
            for (int x = 0 ; x < tm.getColumn() ; x++) {
                Image tc = createImage(Color.BLACK);
                if (tm.getTile(new Coordinate(x,y)).getColor() == "B") {
                    tc = createImage(Color.BLUE);
                } else if (tm.getTile(new Coordinate(x,y)).getColor() == "Y") {
                    tc = createImage(Color.YELLOW);
                } else if (tm.getTile(new Coordinate(x,y)).getColor() == "P") {
                    tc = createImage(Color.PURPLE);
                } else if (tm.getTile(new Coordinate(x,y)).getColor() == "R") {
                    tc = createImage(Color.RED);
                } else if (tm.getTile(new Coordinate(x,y)).getColor() == "G") {
                    tc = createImage(Color.GREEN);
                }
                ImageView imageView = new ImageView(tc);
                imageView.setFitWidth(tileSize);
                imageView.setFitHeight(tileSize);
                gridPane.add(imageView, x, y);
            }
        }
        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.show();
        
      
    }

  


    /* 
    public static void main(String[] args) {
        launch(args);
    }

    */
}
