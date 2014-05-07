package demo.service;




import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;
@Component
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	@SuppressWarnings("resource")
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ConfigApp.class);
		
FbService obj1=(FbService) context.getBean("FbServiceImpl");
obj1.getFb();
	}

}
