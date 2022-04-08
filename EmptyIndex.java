import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EmptyIndex extends createdProj {

	private String Head;
	private String Meta;
	private String HeadEnd;
	private String End;
	private String Path;
	private String nameProj;
	//
	public EmptyIndex() {
		super();
		this.setPath(Path);
		this.setNameProj(nameProj);
		
	}
	public EmptyIndex(String Path, String nameProj) {
		
		super(Path,nameProj);
		
		this.setPath(Path);
		this.setNameProj(nameProj);
		//System.out.println(this.Path+this.nameProj);
	}
	//Set
	public void setPath(String Path) {
		if(Path!=null)this.Path = Path;
		else this.Path = "C:\\";
	}
	public void setNameProj(String nameProj) {
		if(nameProj!=null)this.nameProj = nameProj;
		else this.nameProj = "ProjectHTML";
	}
	public void setHead(String Head) {
		this.Head = Head;
	}
	public void setHeader(String HeadEnd) {
		this.HeadEnd = HeadEnd;
	}
	public void setEnd(String End) {
		this.End = End;
	}
	public void setMeta(String Meta) {
		this.Meta = Meta;
	}
	//Get
	public String getHead() {
		return this.Head;
	}
	public String getHeadEnd() {
		return this.HeadEnd;
	}
	public String getEnd() {
		return this.End;
	}
	public String getPath() {
		return this.Path;
	}
	public String getNameProj() {
		return this.nameProj;
	}
	public String getMeta() {
		return this.Meta;
	}
	//Created Index
    public void createIndex() throws IOException {
		File Dir= new File(this.Path+ this.nameProj+"\\index.html");
		if(!Dir.exists()) {
		boolean created = Dir.createNewFile();
			if(created) System.out.println(this.Path + this.nameProj+"\\index.html");
			else System.out.println("Error index.html");
		}
		else System.out.println("File index.html exists");
	}
  //Created Css
    public void createCssFile() throws IOException {
		File Dir= new File(this.getDirCss()+ "\\style.css");
		if(!Dir.exists()) {
		boolean created = Dir.createNewFile();
			if(created) System.out.println(this.getDirCss()+ "\\style.css");
			else System.out.println("Error style.css");
		}
		else System.out.println("File style.css exists");
	}
	//Init Index
	public void initIndex() {
		this.Head = "<!DOCTYPE html> \n <html lang=\"en\"> \n"
    			+ " <head> \n "
	            + "<meta charset=\"UTF-8\"> \n "
    	        + "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"> \n";
      this.Meta = "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> \n";
   this.HeadEnd = "<title>"+ this.nameProj+"</title> \n "
    			+ "</head> \n "
    	        + "<body> \n ";
       this.End = "</body> \n "
    			+ "</html>";
	}
	//Write Index
	public void writeIndex() {
		 try (FileWriter writer = new FileWriter(this.Path +this.nameProj+ "\\index.html")) {
			writer.write(toString());
			writer.append("\n");
		}
		 catch(IOException ex){
           
           System.out.println(ex.getMessage());
     }     
	}
	@Override
	public String toString() {
		String str = this.Head + this.Meta + this.HeadEnd + this.End;
		return str;
	}
	
}
