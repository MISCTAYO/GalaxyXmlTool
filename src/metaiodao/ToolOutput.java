package metaiodao;

public class ToolOutput {
	public ToolOutput(String name, String format, String format_source, String metadata_source, String label,
			String from_work_dir, String hidden) {
		super();
		this.name = name;
		this.format = format;
		this.format_source = format_source;
		this.metadata_source = metadata_source;
		this.label = label;
		this.from_work_dir = from_work_dir;
		this.hidden = hidden;
	}
	public ToolOutput() {
		name="name";
		format="format";
		format_source="format_source";
		metadata_source="metadata_source";
		label="label";
		from_work_dir="from_work_dir";
		hidden="false";
	}
	private String name="name";
	private String format="format";
	private String format_source="format_source";
	private String metadata_source="metadata_source";
	private String label="label";
	private String from_work_dir="from_work_dir";
	private String hidden="false";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public String getFormat_source() {
		return format_source;
	}
	public void setFormat_source(String format_source) {
		this.format_source = format_source;
	}
	public String getMetadata_source() {
		return metadata_source;
	}
	public void setMetadata_source(String metadata_source) {
		this.metadata_source = metadata_source;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getFrom_work_dir() {
		return from_work_dir;
	}
	public void setFrom_work_dir(String from_work_dir) {
		this.from_work_dir = from_work_dir;
	}
	public String getHidden() {
		return hidden;
	}
	public void setHidden(String hidden) {
		this.hidden = hidden;
	} 

}
