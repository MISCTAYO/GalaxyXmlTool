package metaiodao;

public class ToolRequirement {
public ToolRequirement(String type, String version, String requirement) {
		super();
		this.type = type;
		this.version = version;
		this.requirement = requirement;
	}
private String type;
private String version;
private String requirement;
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getVersion() {
	return version;
}
public void setVersion(String version) {
	this.version = version;
}
public String getRequirement() {
	return requirement;
}
public void setRequirement(String requirement) {
	this.requirement = requirement;
}

}
