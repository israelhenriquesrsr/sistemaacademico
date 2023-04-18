package modelo;

import javafx.application.Application;
import javafx.stage.Stage;

public class Testando extends Application {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
			aluno.setNome("Fagner");
			System.out.println(aluno);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
