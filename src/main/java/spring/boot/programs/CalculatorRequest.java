package spring.boot.programs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CalculatorRequest {

	private float operand1;
	private float operand2;
	private String operator;
	private float answer;

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public float getOperand1() {
		return operand1;
	}

	public void setOperand1(float operand1) {
		this.operand1 = operand1;
	}

	public float getOperand2() {
		return operand2;
	}

	public void setOperand2(float operand2) {
		this.operand2 = operand2;
	}

	public float getAnswer() {
		return answer;
	}

	public void setAnswer(float answer) {
		this.answer = answer;
	}

}
