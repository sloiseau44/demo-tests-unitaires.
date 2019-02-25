package dev.console;

import dev.exception.CalculException;
import dev.service.*;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

	private Scanner scanner;
	private CalculService calculatrice;
	private static final Logger LOG = LoggerFactory.getLogger(App.class);

	public App(Scanner scanner, CalculService calculatrice) {
		this.scanner = scanner;
		this.calculatrice = calculatrice;
	}

	protected void afficherTitre() {
		LOG.info("**** Application Calculatrice ****"); 
	}
	
	public void demarrer() {
		afficherTitre();
	}
	
	protected void evaluer(String expression) throws CalculException {
		int resultat = calculatrice.additionner(expression);
		LOG.info(expression+" = "+resultat); 
		
	}

}
