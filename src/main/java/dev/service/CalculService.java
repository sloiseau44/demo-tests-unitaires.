package dev.service;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.exception.CalculException;


public class CalculService{
	 private static final Logger LOG = LoggerFactory.getLogger(CalculService.class);
	public int additionner(String expression) throws CalculException{
		int resultat=0;
		if(expression.contains("-")||expression.contains("*")||expression.contains("/")||!expression.contains("+")){
			throw new CalculException(expression);
		}else{
		
			LOG.debug("Evaluation de l'expression "+expression);    
			List<String> numéros = Arrays.asList(expression.split("\\+"));
			
			
			for(String num : numéros){
				resultat += Integer.parseInt(num);
			}
		}
		
		return resultat;
	}
}
