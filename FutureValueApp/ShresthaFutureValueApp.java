package FutureValueApp;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ShresthaFutureValueApp extends Application{

    private TextField textField1 = new TextField();
    private TextField textField2 = new TextField();
    private TextArea textArea = new TextArea();
    private Label lblMonthlyPayment = new Label("Monthly Payment:");
    private Label lblInterestRate = new Label("Interest Rate:");
    private Label lblInterestRateFormat = new Label("Enter 11.1% as 11.1");
    private Label lblYears = new Label("Years:");
    private Label label5 = new Label();
    private ComboBox<Integer> yearsComboBox = new ComboBox<Integer>();
    private Button btnCalculate = new Button("Calculate");
    private Button btnClear = new Button("Clear");

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
//      //Setting title to the Stage 
        primaryStage.setTitle("Shrestha Future Value App");
      
        // add a new GridPane object and set its alignment to Pos.CENTER, set its padding to 11.5, 12.5, 13.5, and 14.5. Next, set the panes Hgap to 5.5 and its Vgap to 5.5
        GridPane gridPane = new GridPane();  
        gridPane.setAlignment(Pos.CENTER);   
        gridPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5)); 
        gridPane.setVgap(5.5); 
        gridPane.setHgap(5.5); 

        //Add the controls to the GridPane.
        gridPane.add(lblMonthlyPayment, 0, 0); 
        gridPane.add(textField1, 1, 0); 

        gridPane.add(lblInterestRate, 0, 1);       
        gridPane.add(textField2, 1, 1);

        gridPane.add(lblYears, 0, 3);
        yearsComboBox.setMaxWidth(Double.MAX_VALUE);
        gridPane.add(yearsComboBox, 1,3); 

        gridPane.add(btnCalculate, 0, 4); 
        gridPane.add(btnClear, 1, 4);

        lblInterestRateFormat.setTextFill(Color.RED);
        gridPane.add(lblInterestRateFormat,1,2);
        GridPane.setHalignment(lblInterestRateFormat, HPos.RIGHT);

        HBox actionBtnContainer = new HBox();
        actionBtnContainer.setPadding(new Insets(15,0,15,30));
        actionBtnContainer.setSpacing(10);
        actionBtnContainer.getChildren().add(btnClear);
        actionBtnContainer.getChildren().add(btnCalculate);
        gridPane.add(actionBtnContainer,1,4);

        GridPane.setColumnSpan(textArea, GridPane.REMAINING);
        gridPane.add(textArea, 0, 5);

        Scene scene = new Scene(gridPane);  
         
      //Adding scene to the stage 
      primaryStage.setScene(scene); 
         
      //Displaying the contents of the stage 
      primaryStage.show();       
    } 
}