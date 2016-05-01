package toolxmlio;


import metaio.MetaRead;
import metaio.StaticHelp;
import metaiodao.*;
import xmltoolgui.GalaxyToolMain;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

public class Writetooltags {
   public String processhelptemplate(){
	   String out="";
	   return out;
   }
	public String formattoolinput(ToolParam tp){
		String tempo="name=\""+tp.getName()+"\" type=\""+tp.getTypeparam()+"\" optional=\""+tp.getOptional()+"\" label=\""+tp.getLabel()+"\" help=\""+tp.getHelp()+"\" ";
        Map<String, String> listapara=tp.getTypelistparam();
		for (Map.Entry<String, String> entry : listapara.entrySet())
		{
			tempo=tempo+entry.getKey()+"=\""+entry.getValue()+"\" ";
		}
        if(tp.getTypeparam()=="select"){
			tempo="<param "+tempo+" >\n";
			List<ToolParam.optionita> listaloca =tp.getListaoptions();
			for (ToolParam.optionita t : listaloca) {
				tempo=tempo+"<option value=\""+t.getValue()+"\" selected=\""+t.getSelected()+"\" >"+t.getValue()+"</option>\n";
			}
			tempo=tempo+"</param>";
		}else{
			tempo="<param "+tempo+" />";
		}
		return tempo;
	}
	public String formattoolinputs(List<ToolParam> ltp){
        String tempo="";
		for (ToolParam t : ltp) {
			tempo=tempo+"\n"+formattoolinput(t);
		}
		tempo="<inputs>\n"+tempo+"\n</inputs>";
		return tempo;
	}
   public String formattooloutput(List<ToolOutput> top){
	   String tempo="";
	   for (ToolOutput t : top) {
			   tempo=tempo+"\n<data name=\""+t.getName()+"\" format=\""+t.getFormat()+"\" format_source=\""+t.getFormat_source()+"\" metadata_source=\""+t.getMetadata_source()+"\" label=\""+t.getLabel()+"\" from_work_dir=\""+t.getFrom_work_dir()+"\" hidden=\""+t.getHidden()+"\" />";
		   }
	   tempo="<outputs>"+tempo+"\n</outputs>";
	   return tempo;
   }
   public String formattoolstdio(List<ToolStdio> tst){
	   String tempo="";
	   for (ToolStdio temp : tst) {
		   if(temp.getType()=="regex"){
			   
			   tempo=tempo+"\n<regex match=\""+temp.getMatch()+"\" source=\""+temp.getSource()+"\" level=\""+temp.getLevel()+"\" description=\""+temp.getDescription()+"\" />";
		   }else{
			   tempo=tempo+"\n<regex range=\""+temp.getRange()+"\" level=\""+temp.getLevel()+"\" description=\""+temp.getDescription()+"\" />";
		   }
		   }
	   tempo="<stdio>"+tempo+"\n</stdio>";
	   return tempo;
   }
   public String formattoolconfigfiles(List<ToolConfigfile> tcf){
	   String tempo="";
	   for (ToolConfigfile temp : tcf) {
		   if(temp.getConfigtype()=="File"){
			   tempo=tempo+"\n<configfile name=\""+temp.getName()+"\" filename=\""+temp.getFilename()+"\" ></configfile>";
		   }else{
			   tempo=tempo+"\n<configfile name=\""+temp.getName()+"\" >\n"+temp.getCodecontent()+"\n</configfile>";
		   }
		   }
	   tempo="<configfiles>"+tempo+"\n</configfiles>";
	   return tempo;
   }
   public String formattoolrequirements(List<ToolRequirement> tr){
	   String tempo="";
	   for (ToolRequirement temp : tr) {
		   tempo=tempo+"\n<requirement type=\""+temp.getType()+"\" version=\""+temp.getVersion()+"\" >"+temp.getRequirement()+"</requirement>";
		   }
	   tempo="<requirements>"+tempo+"\n</requirements>";
	   return tempo;
   }
   public String formattoolinfos(ToolInformations ti){
	   return "<tool id=\""+ti.getTid()+"\" name=\""+ti.getTname()+"\" version=\""+ti.getTversion()+"\" hidden=\""+ti.getThidden()+"\" tool_type=\""+ti.getTtype()+"\" URL_method=\""+ti.getTurlmethod()+"\">"+"\n<description>"+ti.getTdescription()+"</description>";
   }
   public String formattoolhelp(ToolHelp th){
	   String out="";
	   //out=new MetaRead().getFile("ext/helptemplate.txt");
	   out= StaticHelp.getHelpxml();
	   out=out.replace("helpauthorsnames",th.getHelpauthorsnames());
	   out=out.replace("helpauthorsemails",th.getHelpauthorsemails());
	   out=out.replace("helpcitation",th.getHelpcitation());
	   out=out.replace("helptoolname",th.getHelptoolname());
	   out=out.replace("helpdescription",th.getHelpdescription());
	   out=out.replace("helpupstreamtools",th.getHelpupstreamtools());
	   out=out.replace("helpdownstreamtools",th.getHelpdownstreamtools());
	   out=out.replace("helpinputfiles",th.getHelpinputfiles());
	   out=out.replace("helpinputfilesparameters",th.getHelpinputfilesparameters());
	   out=out.replace("helpoutputfiles",th.getHelpoutputfiles());
	   out=out.replace("helpinputfilesexample",th.getHelpinputfilesexample());
	   out=out.replace("helpinputfilesexampleparameters",th.getHelpinputfilesexampleparameters());
	   out=out.replace("helpoutputfilesexample",th.getHelpoutputfilesexample());
	   out=out.replace("helpmoreinformations",th.getHelpmoreinformations());
	   return out;
   }
   public String formattoolcommand(ToolCommand tc,String arginputs){
	   String out="";
	   if(tc.getInterpreter()=="CDATA"){
		   out="<command detect_errors=\""+tc.getDetect_errors()+"\" > <![CDATA["+tc.getCdata()+"]]> </command>";
	   }else{
		   out="<command interpreter=\""+tc.getInterpreter()+"\" detect_errors=\""+tc.getDetect_errors()+"\" >"+tc.getCdata()+""+arginputs+"</command>";
	   }
	   if(tc.getVersion_command()=="yes"){
		   out="<version_command>"+tc.getInterpreter()+" -version</version_command>\n"+out;
	   }
	   return out;
   }
   public void writexmlconfig(){
	   PrintWriter pw;
	try {
		pw = new PrintWriter(new FileWriter(GalaxyToolMain.toolinfos.getTid()+".xml"));
		pw.write(this.formattoolinfos(GalaxyToolMain.toolinfos));	 
		pw.write("\n");
		pw.write(this.formattoolconfigfiles(GalaxyToolMain.toolconf));
		pw.write("\n");
		pw.write(this.formattoolrequirements(GalaxyToolMain.toolreq));
		pw.write("\n");
		pw.write(this.formattoolcommand(GalaxyToolMain.toolcommand, ""));
		pw.write("\n");
		pw.write(this.formattoolinputs(GalaxyToolMain.toolparam));
		pw.write("\n");
		pw.write(this.formattooloutput(GalaxyToolMain.tooloutput));
		pw.write("\n");
		pw.write(this.formattoolstdio(GalaxyToolMain.toolstdio));
		pw.write("\n");
		pw.write(this.formattoolhelp(GalaxyToolMain.toolhelp));
		pw.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
   public static void main(String argv[]) {
	   //Writetooltags wtg=new Writetooltags();
	   //ToolInformations ti=new ToolInformations();
   }
}