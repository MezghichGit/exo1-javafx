package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application implements EventHandler<ActionEvent>{
	Button btnInscription = new Button("Inscription");
	Label lblnom = new Label("Votre nom : ");
	TextField txtFnom = new TextField();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			//1-Création du premier HBox
			
			//1.1)Composition
	
			HBox hboxNom = new HBox(lblnom, txtFnom);
			//1.2)Marge et mise en page
			hboxNom.setMargin(lblnom, new Insets(5,0,10,60));
			hboxNom.setMargin(txtFnom, new Insets(0,0,10,20));
			//1.3)CSS et styling
			// consulter fichier application.css
			//1.4)Les evenements
			
			
			//2-Création du deuxième HBox
			
			
			//3-Création du troisième HBox
			btnInscription.setOnAction(this);
			VBox root = new VBox(hboxNom,btnInscription);
			root.setMargin(hboxNom, new Insets(30,0,0,0));
			root.setMargin(btnInscription, new Insets(20,0,0,150));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Formulaire d'inscription");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void handle(ActionEvent event) {
		if(event.getSource() == btnInscription) {
			String nom = txtFnom.getText();
            System.out.println("Nom : " + nom);
        }
		
	}
}
