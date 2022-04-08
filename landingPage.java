import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class landingPage extends EmptyIndex{
	private String body;
	public landingPage() {
		super();
	}
	//Init Body
	//сделать цикл for для кол-ва блоков div, введеными пользователем 
	//в каждом блоке делать id= i как ссылка обращения с меню к блоку
	public void InitBody() {
		this.body= "hello" +"\n";
	}
	
	//Created Css
    public void createCssFile() throws IOException {
		File Dir= new File(this.getDirCss()+ "\\style.css");
		boolean created = Dir.createNewFile();
			if(created) System.out.println(this.getDirCss()+ "\\style.css");
			else System.out.println("Error index");
	}
  //Write Index
  	public void writeIndex() {
  		 try (FileWriter writer = new FileWriter(this.getPath()+ this.getNameProj()+ "\\index.html")) {
  			writer.write(toString());
  			writer.append("\n");
  		}
  		 catch(IOException ex){
             
             System.out.println(ex.getMessage());
       }     
  	}
	@Override
	public String toString() {
		
		String str = this.getHead()
				+ this.getMeta()
		        + "<link rel=\"stylesheet\" href=\"./css/style.css\"> \n"
		        + this.getHeadEnd()
		        + this.body
		        + this.getEnd();

		return str;
	}
}
