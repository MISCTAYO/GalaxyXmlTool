package metaiodao;

public class ToolHelp {
	public ToolHelp() {
		super();
		this.helpauthorsnames = "helpauthorsnames";
		this.helpauthorsemails = "helpauthorsemails";
		this.helpcitation = "helpcitation";
		this.helptoolname = "helptoolname";
		this.helpdescription = "helpdescription";
		this.helpupstreamtools = "helpupstreamtools";
		this.helpdownstreamtools = "helpdownstreamtools";
		this.helpinputfiles = "helpinputfiles";
		this.helpinputfilesparameters =  "helpinputfilesparameters";
		this.helpoutputfiles =  "helpoutputfiles";
		this.helpinputfilesexample =  "helpinputfilesexample";
		this.helpinputfilesexampleparameters =  "helpinputfilesexampleparameters";
		this.helpoutputfilesexample =  "helpoutputfilesexample";
		this.helpmoreinformations =  "helpmoreinformations";
	}
	public ToolHelp(String helpauthorsnames, String helpauthorsemails, String helpcitation, String helptoolname,
			String helpdescription, String helpupstreamtools, String helpdownstreamtools, String helpinputfiles,
			String helpinputfilesparameters, String helpoutputfiles, String helpinputfilesexample,
			String helpinputfilesexampleparameters, String helpoutputfilesexample, String helpmoreinformations) {
		super();
		this.helpauthorsnames = helpauthorsnames;
		this.helpauthorsemails = helpauthorsemails;
		this.helpcitation = helpcitation;
		this.helptoolname = helptoolname;
		this.helpdescription = helpdescription;
		this.helpupstreamtools = helpupstreamtools;
		this.helpdownstreamtools = helpdownstreamtools;
		this.helpinputfiles = helpinputfiles;
		this.helpinputfilesparameters = helpinputfilesparameters;
		this.helpoutputfiles = helpoutputfiles;
		this.helpinputfilesexample = helpinputfilesexample;
		this.helpinputfilesexampleparameters = helpinputfilesexampleparameters;
		this.helpoutputfilesexample = helpoutputfilesexample;
		this.helpmoreinformations = helpmoreinformations;
	}
	public void setFromInstance(ToolHelp th) {
		this.helpauthorsnames = th.getHelpauthorsnames();
		this.helpauthorsemails = th.getHelpauthorsemails();
		this.helpcitation = th.getHelpcitation();
		this.helptoolname = th.getHelptoolname();
		this.helpdescription = th.getHelpdescription();
		this.helpupstreamtools =th.getHelpupstreamtools();
		this.helpdownstreamtools =th.getHelpdownstreamtools();
		this.helpinputfiles = th.getHelpinputfiles();
		this.helpinputfilesparameters = th.getHelpinputfilesparameters();
		this.helpoutputfiles = th.getHelpoutputfiles();
		this.helpinputfilesexample =th.getHelpinputfilesexample();
		this.helpinputfilesexampleparameters = th.getHelpinputfilesexampleparameters();
		this.helpoutputfilesexample = th.getHelpoutputfilesexample();
		this.helpmoreinformations = th.getHelpmoreinformations();
	}
	private String helpauthorsnames;
	private String helpauthorsemails;
	private String helpcitation;
	private String helptoolname;
	private String helpdescription;
	private String helpupstreamtools;
	private String helpdownstreamtools;
	private String helpinputfiles;
	private String helpinputfilesparameters;
	private String helpoutputfiles;
	private String helpinputfilesexample;
	private String helpinputfilesexampleparameters;
	private String helpoutputfilesexample;
	private String helpmoreinformations;
	public String getHelpauthorsnames() {
		return helpauthorsnames;
	}
	public void setHelpauthorsnames(String helpauthorsnames) {
		this.helpauthorsnames = helpauthorsnames;
	}
	public String getHelpauthorsemails() {
		return helpauthorsemails;
	}
	public void setHelpauthorsemails(String helpauthorsemails) {
		this.helpauthorsemails = helpauthorsemails;
	}
	public String getHelpcitation() {
		return helpcitation;
	}
	public void setHelpcitation(String helpcitation) {
		this.helpcitation = helpcitation;
	}
	public String getHelptoolname() {
		return helptoolname;
	}
	public void setHelptoolname(String helptoolname) {
		this.helptoolname = helptoolname;
	}
	public String getHelpdescription() {
		return helpdescription;
	}
	public void setHelpdescription(String helpdescription) {
		this.helpdescription = helpdescription;
	}
	public String getHelpupstreamtools() {
		return helpupstreamtools;
	}
	public void setHelpupstreamtools(String helpupstreamtools) {
		this.helpupstreamtools = helpupstreamtools;
	}
	public String getHelpdownstreamtools() {
		return helpdownstreamtools;
	}
	public void setHelpdownstreamtools(String helpdownstreamtools) {
		this.helpdownstreamtools = helpdownstreamtools;
	}
	public String getHelpinputfiles() {
		return helpinputfiles;
	}
	public void setHelpinputfiles(String helpinputfiles) {
		this.helpinputfiles = helpinputfiles;
	}
	public String getHelpinputfilesparameters() {
		return helpinputfilesparameters;
	}
	public void setHelpinputfilesparameters(String helpinputfilesparameters) {
		this.helpinputfilesparameters = helpinputfilesparameters;
	}
	public String getHelpoutputfiles() {
		return helpoutputfiles;
	}
	public void setHelpoutputfiles(String helpoutputfiles) {
		this.helpoutputfiles = helpoutputfiles;
	}
	public String getHelpinputfilesexample() {
		return helpinputfilesexample;
	}
	public void setHelpinputfilesexample(String helpinputfilesexample) {
		this.helpinputfilesexample = helpinputfilesexample;
	}
	public String getHelpinputfilesexampleparameters() {
		return helpinputfilesexampleparameters;
	}
	public void setHelpinputfilesexampleparameters(String helpinputfilesexampleparameters) {
		this.helpinputfilesexampleparameters = helpinputfilesexampleparameters;
	}
	public String getHelpoutputfilesexample() {
		return helpoutputfilesexample;
	}
	public void setHelpoutputfilesexample(String helpoutputfilesexample) {
		this.helpoutputfilesexample = helpoutputfilesexample;
	}
	public String getHelpmoreinformations() {
		return helpmoreinformations;
	}
	public void setHelpmoreinformations(String helpmoreinformations) {
		this.helpmoreinformations = helpmoreinformations;
	}

}
