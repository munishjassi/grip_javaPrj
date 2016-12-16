package generativeGrammar.utils;

import java.math.BigInteger;

public class ConnectedPort {

	private String port;
	private String name;
	private Boolean isConnected;
	private BigInteger left = BigInteger.valueOf(0);  
	private BigInteger right = BigInteger.valueOf(0);
	private String direction = "";//null;
	private String driver = null;
	
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
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
	
	
	public void setPair(String aPort, Boolean isConnected) {
		this.port = aPort;
		this.isConnected = isConnected;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public Boolean isConnected() {
		return isConnected;
	}

	public void setIsConnected(Boolean isConnected) {
		this.isConnected = isConnected;
	}

	public ConnectedPort() {
		super();
	}

	public ConnectedPort(String aPort, Boolean isConnected) {
		this.port = aPort;
		this.isConnected = isConnected;
		}
}