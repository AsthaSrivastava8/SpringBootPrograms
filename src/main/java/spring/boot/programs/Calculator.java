package spring.boot.programs;

import org.springframework.boot.SpringApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.boot.programs.Calculator;
import spring.boot.programs.CalculatorRequest;

public class Calculator {
	
	public static void main(String[] args) {
		SpringApplication.run(Calculator.class, args);
	}

	@RequestMapping(value = "/evaluate", method = RequestMethod.POST)
	ResponseEntity<Float> calculator(@RequestBody CalculatorRequest calcBody) {

		switch (calcBody.getOperator()) {
		case "+":
			calcBody.setAnswer(calcBody.getOperand1() + calcBody.getOperand2());
			break;
		case "-":
			calcBody.setAnswer(calcBody.getOperand1() - calcBody.getOperand2());
			break;
		case "*":
			calcBody.setAnswer(calcBody.getOperand1() * calcBody.getOperand2());
			break;
		case "/":
			calcBody.setAnswer(calcBody.getOperand1() / calcBody.getOperand2());
			break;
		case "%":
			calcBody.setAnswer(calcBody.getOperand1() % calcBody.getOperand2());
			break;
		}
		return new ResponseEntity<>(calcBody.getAnswer(), HttpStatus.OK);
	}

}
