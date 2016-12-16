package generativeGrammar.utils;
import java.math.BigInteger;

public class InternalPortRef {
	
	private String RefComponent = new String();
	private String RefPort = new String();
	private BigInteger left = null;  
	private BigInteger right = null;
	
	
	public BigInteger getLeft() {
		return left;
	}
	public void setLeft(BigInteger left) {
		this.left = left;
	}
	public BigInteger getRight() {
		return right;
	}
	public void setRight(BigInteger right) {
		this.right = right;
	}
	
	public String getRefComponent() {
		return RefComponent;
	}
	public void setRefComponent(String refComponent) {
		RefComponent = refComponent;
	}
	public String getRefPort() {
		return RefPort;
	}
	public void setRefPort(String refPort) {
		RefPort = refPort;
	}
	
	public InternalPortRef(String aRefComp, String aRefPort) {
		RefComponent = aRefComp;
		RefPort = aRefPort;
	}
	
	public InternalPortRef() {
	}
	
} // Class finish here
