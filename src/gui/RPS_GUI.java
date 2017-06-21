package gui;

import java.util.ArrayList;

import game.RockPaperScissors;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import opponents.*;

public class RPS_GUI extends BorderPane{

	RockPaperScissors game;
	ArrayList<Opponent> oppList = new ArrayList<Opponent>();
	
	public RPS_GUI() {
		this.oppList = defaultList();
		Opponent opp = pickOpponent();
	}
	private Opponent pickOpponent() {
		Stage stage = new Stage();
		GridPane gp = new GridPane();
		Scene sc = new Scene(gp);
		
		for(int i = 0; i < this.oppList.size(); i++){
			Label name = new Label(oppList.get(i).getName());
			gp.add(name, i, 0);
		}
		
		
		return null;
	}
	private ArrayList<Opponent> defaultList(){
		ArrayList<Opponent> oppList = new ArrayList<Opponent>();
		oppList.add(new Rock("Stone"));
		oppList.add(new Paper("Sheet"));
		oppList.add(new Scissors("Cutman"));
		oppList.add(new Impossible("Copycat"));
		
		return oppList;
	}

}
