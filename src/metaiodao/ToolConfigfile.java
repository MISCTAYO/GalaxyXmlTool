package metaiodao;

public class ToolConfigfile {
public ToolConfigfile(String name, String filename, String codecontent, String configtype) {
		super();
		this.name = name;
		this.filename = filename;
		this.codecontent = codecontent;
		this.configtype = configtype;
	}
public ToolConfigfile() {
	name="name";
	filename="filename";
	codecontent="you code here";
	configtype="file";
}
private String name="name";
private String filename="filename";
private String codecontent="you code here";
private String configtype="file";
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getFilename() {
	return filename;
}
public void setFilename(String filename) {
	this.filename = filename;
}
public String getCodecontent() {
	return codecontent;
}
public void setCodecontent(String codecontent) {
	this.codecontent = codecontent;
}
public String getConfigtype() {
	return configtype;
}
public void setConfigtype(String configtype) {
	this.configtype = configtype;
}
}
