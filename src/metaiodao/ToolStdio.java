package metaiodao;

public class ToolStdio {
public ToolStdio(String type, String range, String match, String level, String source, String description) {
		super();
		this.type = type;
		this.range = range;
		this.match = match;
		this.level = level;
		this.source = source;
		this.description = description;
	}
public ToolStdio() {
	type="regex";
	range=":";
	match="";
	level="warning";
	source="";
	description="";
}
private String type="regex";
private String range=":";
private String match="";
private String level="warning";
private String source="";
private String description="";
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getRange() {
	return range;
}
public void setRange(String range) {
	this.range = range;
}
public String getMatch() {
	return match;
}
public void setMatch(String match) {
	this.match = match;
}
public String getLevel() {
	return level;
}
public void setLevel(String level) {
	this.level = level;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

}
