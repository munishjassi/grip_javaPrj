package generativeGrammar.utils;

import java.util.ArrayList;
import java.util.List;

public class AdHocConnection {

	private List<InternalPortRef> internalPortRef = new ArrayList<InternalPortRef>();

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<InternalPortRef> getInternalPortRef() {
		return internalPortRef;
	}

	public void setInternalPortRef(List<InternalPortRef> internalPortRef) {
		this.internalPortRef = internalPortRef;
		}
	
	public void addInternalPortRef(InternalPortRef aPortRef) {
		this.internalPortRef.add(aPortRef);
	}
	
} // Class ends here