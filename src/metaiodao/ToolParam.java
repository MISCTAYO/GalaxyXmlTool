package metaiodao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToolParam {
	public class optionita{
		private String Value;
		private String Selected;
		public String getValue() {
			return Value;
		}
		public void setValue(String value) {
			this.Value = value;
		}
		public String getSelected() {
			return Selected;
		}
		public void setSelected(String selected) {
			this.Selected = selected;
		}
		public optionita(String value,String selected){
			Value=value;
			Selected=selected;
		}
		public optionita(){
			Value="value";
			Selected="true";
		}
	}
	public ToolParam(String typeparam, String name, String optional, String label, String help) {
		super();
		this.setTypeparam(typeparam);
		this.name = name;
		this.optional = optional;
		this.label = label;
		this.help = help;
	}
	public ToolParam() {
		super();
		this.setTypeparam("text");
		this.name = "name";
		this.optional = "false";
		this.label = "label";
		this.help = "help";
	}
	private String typeparam;
	private String name;
	private String optional;
	private String label;
	private String help;
	private Map<String,String> typelistparam=new HashMap<String,String>();
	private Map<String,String> listoptions=new HashMap<String,String>();
	private List<optionita> listaoptions=new ArrayList<optionita>();
	public void addoptionitas(String v,String s){
	     this.listaoptions.add(new optionita(v,s));		
		}
	public void addoptionita(optionita op){
     this.listaoptions.add(op);		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOptional() {
		return optional;
	}
	public void setOptional(String optional) {
		this.optional = optional;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getHelp() {
		return help;
	}
	public void setHelp(String help) {
		this.help = help;
	}
	public String getTypeparam() {
		return typeparam;
	}
	public void setTypeparam(String typeparam) {
		this.typeparam = typeparam;
	}
	public Map<String,String> getTypelistparam() {
		return typelistparam;
	}
	public void setTypelistparam(Map<String,String> typelistparam) {
		this.typelistparam = typelistparam;
	}
	public void addparamattribute(String att,String val){
		this.typelistparam.put(att, val);
	}
	public void addoptionattribute(String att,String val){
		this.listoptions.put(att, val);
	}
	public Map<String,String> getListoptions() {
		return listoptions;
	}
	public void setListoptions(Map<String,String> listoptions) {
		this.listoptions = listoptions;
	}
	public List<optionita> getListaoptions() {
		return listaoptions;
	}
	public void setListaoptions(List<optionita> listaoptions) {
		this.listaoptions = listaoptions;
	}
	

}

