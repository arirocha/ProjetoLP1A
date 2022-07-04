package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class ControleTelaAlterar implements Initializable{

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
	@FXML
	protected void ClickAddPage(ActionEvent event) {
		Main.switchMudaTelas(1);
		System.out.println("Clicou add");
	}
	
	@FXML
	protected void ClickRemovePage(ActionEvent event) {
		Main.switchMudaTelas(2);
		System.out.println("Clicou remover");
	}
	
	@FXML
	protected void ClickAlterarPage(ActionEvent event) {
		Main.switchMudaTelas(3);
		System.out.println("Clicou Alterar");
	}

}
