package cigma;

import cigma.controllers.ClientController;
import cigma.models.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl = (ClientController) context.getBean("ClientController");

//        ctrl.save(new Client(1L,"Ayoub", 10));
//        ctrl.update(new Client(1L,"Benabid", 10));
//        ctrl.find(1L);
//        ctrl.findAll();
//        ctrl.delete(1L);
    }
}
