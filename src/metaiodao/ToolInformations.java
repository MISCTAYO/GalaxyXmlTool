package metaiodao;

public class ToolInformations {
	public ToolInformations(String tid, String tname, String tversion, String thidden, String ttype, String turlmethod,
			String tworkflowcompatible, String tdescription) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tversion = tversion;
		this.thidden = thidden;
		this.ttype = ttype;
		this.turlmethod = turlmethod;
		this.tworkflowcompatible = tworkflowcompatible;
		this.tdescription = tdescription;
	}
	public ToolInformations() {
		super();
		this.tid = "id";
		this.tname = "name";
		this.tversion = "version";
		this.thidden = "false";
		this.ttype = "none";
		this.turlmethod = "get";
		this.tworkflowcompatible ="true";
		this.tdescription = "description";
	}
	private String tid;
    private String tname;
    private String tversion;
    private String thidden;
    private String ttype;
    private String turlmethod;
    private String tworkflowcompatible;
    private String tdescription;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTversion() {
		return tversion;
	}
	public void setTversion(String tversion) {
		this.tversion = tversion;
	}
	public String getThidden() {
		return thidden;
	}
	public void setThidden(String thidden) {
		this.thidden = thidden;
	}
	public String getTtype() {
		return ttype;
	}
	public void setTtype(String ttype) {
		this.ttype = ttype;
	}
	public String getTurlmethod() {
		return turlmethod;
	}
	public void setTurlmethod(String turlmethod) {
		this.turlmethod = turlmethod;
	}
	public String getTworkflowcompatible() {
		return tworkflowcompatible;
	}
	public void setTworkflowcompatible(String tworkflowcompatible) {
		this.tworkflowcompatible = tworkflowcompatible;
	}
	public String getTdescription() {
		return tdescription;
	}
	public void setTdescription(String tdescription) {
		this.tdescription = tdescription;
	}
    public void setFromInstance(ToolInformations ti){
    	this.setTid(ti.getTid());
    	this.setTname(ti.getTname());
    	this.setTversion(ti.getTversion());
    	this.setTdescription(ti.getTdescription());
    	this.setTtype(ti.getTtype());
    	this.setTurlmethod(ti.getTurlmethod());
    	this.setTworkflowcompatible(ti.getTworkflowcompatible());
    	this.setThidden(ti.getThidden());
    }
}
