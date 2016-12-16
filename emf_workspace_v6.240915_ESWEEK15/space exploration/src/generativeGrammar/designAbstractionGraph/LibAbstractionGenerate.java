package generativeGrammar.designAbstractionGraph;

import java.util.List;

import org.eclipse.emf.ecore.EObject;



public interface LibAbstractionGenerate extends EObject {

	public List<LibCompAbstraction> GenerateLibAbstraction(String dirPath);

	public LibCompAbstraction AbstractLib(String file);
	
	public void PrintLibraryGenSummary (List<LibCompAbstraction> abstractionLib);

	
}
