package org.clyze.persistent.model.doop;

import java.util.Map;
import java.util.Objects;

import org.clyze.persistent.model.Position;
import org.clyze.persistent.model.SymbolWithDoopId;

public class Variable extends SymbolWithDoopId {

	private String name;

	private String type;

	private boolean isLocal;

	private boolean isParameter;

	private String declaringMethodDoopId;	

	/** is inside an instance initializer block */
	private boolean inIIB = false;

	public Variable() {}

    public Variable(String id) {
        this.id = id;
    }

	public Variable(Position position, 
					String sourceFileName, 
					String name, 
					String doopId, 
					String type, 
					String declaringMethodDoopId,
					boolean isLocal, 
					boolean isParameter, 
					boolean inIIB) {
		super(position, sourceFileName, doopId);
		this.name = name;		
		this.type = type;
		this.declaringMethodDoopId = declaringMethodDoopId;
		this.isLocal = isLocal;
		this.isParameter = isParameter;
		this.inIIB = inIIB;
	}    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public boolean isLocal() {
        return isLocal;
    }

    public void setIsLocal(boolean local) {
        isLocal = local;
    }

    public boolean getIsParameter() {
        return isParameter;
    }

    public void setIsParameter(boolean parameter) {
        isParameter = parameter;
    }

    public String getDeclaringMethodDoopId() {
        return declaringMethodDoopId;
    }

    public void setDeclaringMethodDoopId(String declaringMethodDoopId) {
        this.declaringMethodDoopId = declaringMethodDoopId;
    }

    public boolean getInIIB() {
        return inIIB;
    }

    public void setInIIB(boolean inIIB) {
        this.inIIB = inIIB;
    }

    protected void saveTo(Map<String, Object> map) {
		super.saveTo(map);
		map.put("name", this.name);
		map.put("type", this.type);
		map.put("isLocal", this.isLocal);
		map.put("isParameter", this.isParameter);
		map.put("declaringMethodDoopId", this.declaringMethodDoopId);		
		map.put("inIIB", this.inIIB);
	}

	protected void loadFrom(Map<String, Object> map){
		super.loadFrom(map);
		this.name                  = (String) map.get("name");
		this.type                  = (String) map.get("type");
		this.isLocal               = (Boolean) map.get("isLocal");
		this.isParameter           = (Boolean) map.get("isParameter");
		this.declaringMethodDoopId = (String) map.get("declaringMethodDoopId");		
		this.inIIB                 = (Boolean) map.get("inIIB");
	}

	public String getDoopId() {
		return doopId;
	}

	public void setType(String type) {
		this.type = type;
	}
}
