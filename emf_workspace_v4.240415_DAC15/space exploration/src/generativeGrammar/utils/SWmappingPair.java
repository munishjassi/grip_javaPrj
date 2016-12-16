package generativeGrammar.utils;

public class SWmappingPair {
	
	protected String swTask;

	protected String hwModule;
	
	
	public String getHwModule() {
		return hwModule;
	}

	public void setHwModule(String hwModule) {
		this.hwModule = hwModule;
	}

	public String getSwTask() {
		return swTask;
	}

	public void setSwTask(String swTask) {
		this.swTask = swTask;
	}

	public void setSWruleMapping(String swTask, String hwModule) {
		this.swTask = swTask;
		this.hwModule = hwModule;
	}
	
}
