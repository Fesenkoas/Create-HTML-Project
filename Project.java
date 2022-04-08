//import java.io.File;
//import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
//1)ландинг с меню
//2)саит с боковым меню
//3)сохрание пути в бин фаиле
//4)проверка какие есть диски у пользователя
public class Project {

	public static void main(String[] args) throws IOException {
//		System.out.println("Path of Directory");
		Scanner obj = new Scanner(System.in);
//		String path = obj.next();
		

		System.out.println("Directory name");
//	    SomeDir
//      String path ="C:\\HTML";
//      int num =0;		
//		String Dir="HTML";
		String Path="C:\\Users\\Alex\\Desktop\\";
// Create empty index		
//		if(num==1) {
		EmptyIndex em = new EmptyIndex(Path,obj.next());
//		EmptyIndex em = new EmptyIndex();
		
		em.createRoot();
		em.createCss();
		em.createJs();
		em.createImages();
		em.createIndex();
		em.createCssFile();
		em.initIndex();
		em.writeIndex();
	
		System.out.println("Good!!");
//		}
		
// Create Landing Page
//		if(num==2) {
//		landingPage lp = new landingPage();
//		lp.createRoot();
//		lp.createCss();
//		lp.createImages();
//		lp.createJs();
//		lp.createIndex();
//		lp.createCssFile();
//		lp.initIndex();
//		lp.InitBody();
//		lp.writeIndex();
//		}
		
	}

}
