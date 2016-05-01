package metaiodao;

public class ToolCommand {
	public ToolCommand(String version_command, String interpreter, String detect_errors,String cdata) {
		super();
		this.version_command = version_command;
		this.interpreter = interpreter;
		this.detect_errors = detect_errors;
		this.cdata=cdata;
	}
	public ToolCommand() {
		super();
		this.version_command = "version_command";
		this.interpreter = "interpreter";
		this.detect_errors ="detect_errors";
		this.cdata="cdata";
	}
	public void setFromInstance(ToolCommand tc){
		this.version_command = tc.getVersion_command();
		this.interpreter = tc.getInterpreter();
		this.detect_errors = tc.getDetect_errors();
		this.cdata=tc.getCdata();
    }
	private String version_command;
	private String interpreter;
	private String detect_errors;
	private String cdata;
	public String getVersion_command() {
		return version_command;
	}
	public void setVersion_command(String version_command) {
		this.version_command = version_command;
	}
	public String getInterpreter() {
		return interpreter;
	}
	public void setInterpreter(String interpreter) {
		this.interpreter = interpreter;
	}
	public String getDetect_errors() {
		return detect_errors;
	}
	public void setDetect_errors(String detect_errors) {
		this.detect_errors = detect_errors;
	}
	public String getCdata() {
		return cdata;
	}
	public void setCdata(String cdata) {
		this.cdata = cdata;
	}

}
