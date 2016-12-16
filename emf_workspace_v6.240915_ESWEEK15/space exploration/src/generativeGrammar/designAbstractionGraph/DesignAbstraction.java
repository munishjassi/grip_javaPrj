package generativeGrammar.designAbstractionGraph;


//import generativeGrammar.designAbstractionGraph.impl.ComponentType;

import generativeGrammar.utils.AdHocConnection;
import generativeGrammar.utils.ConnectedPort;
import generativeGrammar.utils.Parameter;
import generativeGrammar.utils.PortCompPair;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.spiritconsortium.xml.schema.spirit.spirit.ComponentType;
import org.spiritconsortium.xml.schema.spirit.spirit.DesignType;

public interface DesignAbstraction extends EObject{

	public DesignType getDesign();

	public void setDesign(DesignType design);

//	public List<ComponentType> getComponents();
//
//	public void setComponents(List<ComponentType> components);
	

	public List<Parameter> getParameters();

	public void setParameters(List<Parameter> parameters);
	
	public void addParameter(Parameter parameter);
	
	public List<ConnectedPort> getAllPins();
	
	public void setAllPins(List<ConnectedPort> allPins);
	
	public void addPin(ConnectedPort aPin);
	
	public List<AdHocConnection> getAdHocConnections();
	
	public void setAdHocConnections(List<AdHocConnection> adHocConnections);
	
	public List<PortCompPair> getPinToRefComponentPair();
	
	public void setPinToRefComponentPair(List<PortCompPair> pinToRefComponentPair);

	public void addPinToRefComponentPair(PortCompPair pintoref);
	
	public void genDesignGraph(String designFile);
	
	public void genCompDesignGraph(String designFile);

	public void SetLibAbstractionReference();

	public boolean MatchPattern (DesignAbstraction pattern, boolean strict);
	
	public List<BusAbstraction> getBuses();

	public void setBuses(List<BusAbstraction> buses);

	public List<PeriAbstraction> getPeripherals();

	public void setPeripherals(List<PeriAbstraction> peripherals);

	public List<CompAbstraction> getDesComponents();

	public void setDesComponents(List<CompAbstraction> desComponents);
	
	public void addDesComponent(CompAbstraction desComponent);
	
	public void RefineAdHocConnections();
	
	public void SetAdHocConnectionNames();
	
	public void SetInterconnectionNames();

	public void PrintDesignSummary();

	public void UniquifyInstanceNames();
	
	public void DesignDelineation();

	public void ResetMapped();
	
}
