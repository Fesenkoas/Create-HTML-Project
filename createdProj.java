import java.io.File;
import java.io.IOException;

public abstract class createdProj {
	private String Path;
	private String dirCss;
	private String dirJs;
	private String dirImages;
	private String nameDir;
	
	public createdProj() {
		this.setPathway(Path);
		this.setNameDir(nameDir);
		this.dirCss= this.Path + this.nameDir + "\\css";
		this.dirJs= this.Path+ this.nameDir + "\\js";
		this.dirImages= this.Path+ this.nameDir + "\\images";
	}
	public createdProj(String Path, String nameDir) {
		this.setPathway(Path);
		this.setNameDir(nameDir);
		this.dirCss= this.Path + this.nameDir + "\\css";
		this.dirJs= this.Path+ this.nameDir + "\\js";
		this.dirImages= this.Path+ this.nameDir + "\\images";
	}
	//Set
	public void setPathway(String Path) {
		if(Path!=null)this.Path = Path;
		else this.Path = "C:\\";
	}
	public void setNameDir(String nameDir) {
		if(nameDir!=null)this.nameDir = nameDir;
		else this.nameDir = "ProjectHTML";
	}
	public void setDirCss(String dirCss) {
		this.dirCss = dirCss;
	}
	public void setDirJs(String dirJs) {
		this.dirJs = dirJs;
	}
	public void setDirImages(String dirImages) {
		this.dirImages = dirImages;
	}
	//Get
	public String getDirCss() {
		return this.dirCss;
	}
	public String getDirJs() {
		return this.dirJs;
	}
	public String getDirImages() {
		return this.dirImages;
	}
	public String getPathway() {
		return this.Path;
	}
	public String getNameDir() {
		return this.nameDir;
	}
	//created ROOT DIR
	public void createRoot() throws IOException{
		String root = this.Path+ this.nameDir;
		File Dir= new File(root);
		if(!Dir.exists()) {
		boolean created = Dir.mkdir();
			if(created) System.out.println(this.Path + this.nameDir);
			else System.out.println("Error ROOT");
		}
		else System.out.println("Dir CSS exists");
	}
	//created CSS DIR
	public void createCss() throws IOException{
		
		File Dir= new File(this.dirCss);
		if(!Dir.exists()) {
		boolean created = Dir.mkdir();
			if(created) System.out.println(this.Path + this.nameDir +"\\CSS");
			else System.out.println("Error CSS");
	}
	else System.out.println("Dir CSS exists");
	}
	//created JS DIR
	public void createJs() throws IOException{
		File Dir= new File(this.dirJs);
		if(!Dir.exists()) {
		boolean created = Dir.mkdir();
			if(created) System.out.println(this.Path + this.nameDir + "\\JS");
			else System.out.println("Error JS");
		}
		else System.out.println("Dir JS exists");
	}
	//created IMAGES DIR
	public void createImages() throws IOException{
		File Dir= new File(this.dirImages);
		if(!Dir.exists()) {
		boolean created = Dir.mkdir();
			if(created) System.out.println(this.Path + this.nameDir + "\\IMAGES");
			else System.out.println("Error IMAGES");
		}
		else System.out.println("Dir IMAGES exists");
	}

	
}
