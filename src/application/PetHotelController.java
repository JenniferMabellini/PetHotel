

/**
 * Sample Skeleton for 'PetHotel' Controller Class
 */

package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class PetHotelController {
	List<PetClient> clientList = new ArrayList<PetClient>();


	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML // fx:id="outputField"
	private TextArea outputField; // Value injected by FXMLLoader

	@FXML // fx:id="ownerTextField"
	private TextField ownerTextField; // Value injected by FXMLLoader

	@FXML // fx:id="petTextField"
	private TextField petTextField; // Value injected by FXMLLoader

	@FXML // fx:id="daysTextField"
	private TextField daysTextField; // Value injected by FXMLLoader

	@FXML
	void insertClient(MouseEvent event) {
		
		String owner = ownerTextField.getText();
		String pet = petTextField.getText();
		int days = Integer.parseInt(daysTextField.getText());
		//trasformo il contenuto in un intero. se al posto del numero metto una stringa non funge 
		//in quanto non ho ancora gestito le eccezioni

		outputField.appendText(owner + "\t" + pet + "\t" + "\t" + days + "\n");
		
		PetClient petClient= new PetClient(owner, pet, days);
		clientList.add(petClient);
	}

	@FXML
	void printClient(MouseEvent event) {
		
		outputField.clear();
		Iterator<PetClient> it= clientList.iterator();
		//iterator ci permette di andare solo avanti ma siccome è una lista 
		//implemento listIteretaror che ci permette di andare avanti che indietro
		//nel caso di list iterator ho specificato come indice l'ultimo che è clientList size-1
		
		while(it.hasNext()){
		PetClient pt= it.next();
		if(pt.getDays()>20)
			it.remove();}
		for( PetClient p: clientList)
			outputField.appendText(p.toString()+"\n");
		
		
	}

	@FXML // This method is called by the FXMLLoader when initialization is
			// complete
	void initialize() {
		assert outputField != null : "fx:id=\"outputField\" was not injected: check your FXML file 'Untitled'.";
		assert ownerTextField != null : "fx:id=\"ownerTextField\" was not injected: check your FXML file 'Untitled'.";
		assert petTextField != null : "fx:id=\"petTextField\" was not injected: check your FXML file 'Untitled'.";
		assert daysTextField != null : "fx:id=\"daysTextField\" was not injected: check your FXML file 'Untitled'.";

	}
}
