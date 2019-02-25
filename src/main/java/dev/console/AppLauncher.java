package dev.console;

import java.util.Scanner;

import dev.exception.CalculException;
import dev.service.CalculService;

public class AppLauncher {
	public static void main(String[] args) throws CalculException {
		try (Scanner scanner = new Scanner(System.in)) {
			App app = new App(scanner, new CalculService());
			app.demarrer();
			
			app.evaluer(scanner.next());
			
		}
	}
}
