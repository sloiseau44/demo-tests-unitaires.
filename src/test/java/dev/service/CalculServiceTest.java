package dev.service;

import static org.assertj.core.api.Assertions.assertThat;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.service.CalculService;

import dev.exception.*;

public class CalculServiceTest {
	private static final Logger LOG = LoggerFactory.getLogger(CalculServiceTest.class);
		

	@Test
	public void testAdditionner() throws Exception {
		LOG.info("Etant donné, une instance de la classe CalculService"); 
		CalculService calculService = new CalculService();
		
		LOG.info("Lorsque j'évalue l'addition de l'expression 1+3+4"); 
		int resultat = calculService.additionner("1+3+4");

		int somme = 8;
		LOG.info("Alors j'obtiens le résultat 8");
		assertThat(somme).isEqualTo(resultat);
		
		
	}
	
	@Test (expected = CalculException.class)
	public void testAdditionnerMauvaiseExpression() throws Exception {
		LOG.info("Etant donné, une instance de la classe CalculService"); 
		CalculService calculService = new CalculService();
		
		LOG.info("Lorsque j'évalue l'addition de l'expression 1-3+4"); 
		calculService.additionner("1-3+4");
	}
	
}
