//Name: Sabina Shrestha
//Assignment: 11.2


package GradeBookApp;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ShresthaGradeBookApp extends Application {

    private Label lblFirstName = new Label("First Name:");
    private Label lblLastName= new Label("Last Name:");
    private Label lblCourse = new Label("Course");
    private Label lblGrade = new Label("Years:");

    private ComboBox<String> cbGrade= new ComboBox<String>();
    private TextField txtFirstName = new TextField();
    private TextField txtLastName= new TextField();
    private TextField txtCourseName= new TextField();

    private Button btnClear = new Button("Clear");
    private Button btnView = new Button("View");
    private Button btnSave = new Button("Save");

    private TextArea txtResults = new TextArea();


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
         //Setting title to the Stage 
        primaryStage.setTitle("Grade Book App");
      
         // add a new GridPane object and set its alignment to Pos.CENTER, set its padding to 11.5, 12.5, 13.5, and 14.5. Next, set the panes Hgap to 5.5 and its Vgap to 5.5
        GridPane gridPane = new GridPane();  
        gridPane.setAlignment(Pos.CENTER);   
        gridPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5)); 
        gridPane.setVgap(5.5); 
        gridPane.setHgap(5.5); 

           //Add the controls to the GridPane.
        gridPane.add(lblFirstName, 0, 0); 
        gridPane.add(txtFirstName, 1, 0); 

        gridPane.add(lblLastName, 0, 1);       
        gridPane.add(txtLastName, 1, 1);

        gridPane.add(lblCourse, 0, 2);       
        gridPane.add(txtCourseName, 1, 2);

        gridPane.add(lblGrade, 0, 3);
        cbGrade.getItems().addAll("A", "B", "C", "D", "E", "F");
        cbGrade.setMaxWidth(Double.MAX_VALUE);
        gridPane.add(cbGrade, 1,3);
        
        gridPane.add(btnClear, 0, 4); 
        gridPane.add(btnView, 1, 4);
        gridPane.add(btnSave, 2, 4);

        GridPane.setColumnSpan(txtResults, GridPane.REMAINING);
        gridPane.add(txtResults, 0, 5); 

        btnSave.setOnAction(e -> {
            try {
                writeCSV();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }); 

        btnView.setOnAction(e -> {
            try {
                readCSV();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }); 

        btnClear.setOnAction(e -> clearFormFields());

        Scene scene = new Scene(gridPane);  
         
        //Adding scene to the stage 
        primaryStage.setScene(scene); 
         
        //Displaying the contents of the stage 
        primaryStage.show();      
    }

    private void writeCSV() throws Exception {
        
        String firstName = txtFirstName.getText();
		String lastName = txtLastName.getText();
		String course = txtCourseName.getText();
		String grade = cbGrade.getValue();
        
        List<String[]> students = new ArrayList<>();
        students.add(new String [] {firstName,lastName,course,grade});

        //This class allows us to write the data to a CSV file.
        CSVWriter writer = new CSVWriter(new FileWriter("output.csv"));
        String[] header="firstName,lastName,course,grade".split(",");
        writer.writeNext(header);
        writer.writeAll(students);
        writer.close();
    }


    private void readCSV() throws Exception {
        
        FileReader filereader = new FileReader("output.csv");

        // create csvReader object and skip first Line
        CSVReader csvReader = new CSVReader(filereader);
		List<String[]> records = csvReader.readAll();

		Iterator<String[]> iterator = records.iterator();

		while (iterator.hasNext()) {
			String[] record = iterator.next();
			Student student = new Student();
			student.setFirstName(record[0]);
			student.setLastName(record[1]);
			student.setCourseName(record[2]);
            student.setGrade(record[3]);
            txtResults.setText(student.toString());
			
		}
        // close readers
        csvReader.close();
        filereader.close();
    }

   //This method set all the text values and areas to empty string
    private void clearFormFields() {
        
        txtFirstName.setText("");
        txtLastName.setText("");
        txtCourseName.setText("");
        cbGrade.setValue("");
        txtResults.setText("");
    }
    
}

