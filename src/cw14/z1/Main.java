package cw14.z1;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Kalkulator");

        // LAYOUT

        BorderPane root = new BorderPane();
        FlowPane numsPane = new FlowPane();
        FlowPane resPane = new FlowPane();

        // INPUTY

        TextField num1 = new TextField("0");
        Label plus = new Label("+");
        plus.setPadding(new Insets(5));
        TextField num2 = new TextField("0");

        numsPane.setAlignment(Pos.CENTER);
        numsPane.setPadding(new Insets(10));
        numsPane.getChildren().addAll(num1,plus,num2);

        // OUTPUTY

        Label res = new Label("0");
        res.setFont(Font.font(res.getFont().getName(), 30));

        resPane.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        resPane.setPadding(new Insets(10));
        resPane.setAlignment(Pos.CENTER);
        resPane.setBorder(new Border(new BorderStroke(Color.BLUE,BorderStrokeStyle.SOLID,CornerRadii.EMPTY,new BorderWidths(2))));
        resPane.getChildren().add(res);

        // BINDY

        res.textProperty().bind(
                Bindings.createIntegerBinding(
                        ()->{
                            try {
                                return Integer.parseInt(num1.getText())+Integer.parseInt(num2.getText());
                            } catch (NumberFormatException e) {
                                return 0;
                            }
                        },
                        num1.textProperty(),
                        num2.textProperty()
                ).asString()
        );
        root.widthProperty().addListener((e)->{
            num1.setMaxWidth(
                    (root.getWidth() - plus.getWidth()-100)/2
            );
            num2.setMaxWidth(
                    (root.getWidth() - plus.getWidth()-100)/2
            );
        });

        // DISPLAY

        root.setTop(numsPane);
        root.setCenter(resPane);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
