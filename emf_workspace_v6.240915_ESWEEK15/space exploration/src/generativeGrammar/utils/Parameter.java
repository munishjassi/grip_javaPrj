package generativeGrammar.utils;

import org.spiritconsortium.xml.schema.spirit.spirit.ValueType2;


public class Parameter {

	private String parameter;

	public String getParameter() {
		return parameter;
	}

	public void setParameter(String parameter) {
		this.parameter = parameter;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	private String value;

	
	public void setPair(String aParameter, String aValue) {
		parameter = aParameter;
		value = aValue;
	}

	public Parameter() {
		super();
	}

	public Parameter(String aParameter, String aValue) {
		parameter = aParameter;
		value = aValue;
	}
}