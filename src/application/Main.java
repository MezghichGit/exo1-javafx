package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application implements EventHandler<ActionEvent>{
	Button btnInscription = new Button("Inscription");
	
	Label lblnom = new Label("Votre nom : ");
	TextField txtFnom = new TextField();
	
	
	Label lbltel = new Label("Votre téléphone : ");
	TextField txtFtel = new TextField();
	
	
	Label lblemail = new Label("Votre email : ");
	TextField txtFemail = new TextField();
	
	Label titre = new Label("Formulaire d'inscription");
	
	Label recap = new Label("Vos contacts : ");
	
	Button button = new Button("Submit");
	
    CheckBox etudiant = new CheckBox("Etudiant");
    CheckBox employe = new CheckBox("Employé");
	@Override
	public void start(Stage primaryStage) throws Exception { 
	VBox layout = new VBox();
    Scene scene = new Scene(layout, 250, 150);  
     
    RadioButton radio1 = new RadioButton("Option 1");
    RadioButton radio2 = new RadioButton("Option 2");
     
    ToggleGroup radioGroup = new ToggleGroup();
    radio1.setToggleGroup(radioGroup);
    radio2.setToggleGroup(radioGroup);
     
    Button button = new Button("Submit");
    button.setOnAction(e -> {
        RadioButton temp = (RadioButton) radioGroup.getSelectedToggle();
        System.out.println(temp.getText());
    });
         
    layout.getChildren().addAll(radio1, radio2, button);
 
    primaryStage.setTitle("CodersLegacy");
    primaryStage.setScene(scene);   
    primaryStage.show();
	}
	/*
	public void start(Stage primaryStage) throws Exception { 
        
        VBox layout = new VBox();
        Scene scene = new Scene(layout, 250, 150);  
         
    
             
        
        
        button.setOnAction(this);
              
        layout.getChildren().addAll(etudiant, employe, button);
     
        primaryStage.setTitle("CodersLegacy");
        primaryStage.setScene(scene);   
        primaryStage.show();
    }*/
	/*
	public void start(Stage primaryStage) {
		try {
			
			//1-Création du premier HBox
			
			//1.1)Composition
	
			HBox hboxNom = new HBox(lblnom, txtFnom);
			//1.2)Marge et mise en page
			hboxNom.setMargin(lblnom, new Insets(5,0,10,60));
			hboxNom.setMargin(txtFnom, new Insets(0,0,10,55));
			//1.3)CSS et styling
			// consulter fichier application.css
			//1.4)Les evenements
			
			
			//2-Création du deuxième HBox
			HBox hboxTel = new HBox(lbltel, txtFtel);
			hboxNom.setMargin(lbltel, new Insets(5,0,10,60));
			hboxNom.setMargin(txtFtel, new Insets(0,0,10,20));
			
			//3-Création du troisième HBox
			
			HBox hboxEmail = new HBox(lblemail, txtFemail);
			hboxNom.setMargin(lblemail, new Insets(5,0,10,60));
			hboxNom.setMargin(txtFemail, new Insets(0,0,10,48));
			
			btnInscription.setOnAction(this);
			VBox root = new VBox(titre,hboxNom,hboxTel,hboxEmail,btnInscription,recap);
			
			root.setMargin(hboxNom, new Insets(30,0,0,0));
			root.setMargin(btnInscription, new Insets(20,0,0,150));
			root.setMargin(titre, new Insets(20,0,0,120));
			Scene scene = new Scene(root,400,300);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Formulaire d'inscription");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}*/
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void handle(ActionEvent event) {
		if(event.getSource() == btnInscription) {
			String nom = txtFnom.getText();
			String tel = txtFtel.getText();
			String email = txtFemail.getText();
            System.out.println("Nom : " + nom);
            System.out.println("Tel : " + tel);
            System.out.println("Email : " + email);
            ///
            
            recap.setText(recap.getText()+" "+nom+" "+tel+" "+email);
        }
		
		if(event.getSource()==button)
		{
			boolean estEtudiant = etudiant.isSelected();
			boolean estEmploye = employe.isSelected();
			
			if(estEtudiant == true )
			{
				System.out.println("Vous êtes un étudiant");
			}
			
			if(estEmploye == true )
			{
				System.out.println("Vous êtes un employé");
			}
		}
	}
}
