package cigma;

import cigma.controllers.ClientController;
import cigma.controllers.FactureController;
import cigma.models.Client;
import cigma.models.Facture;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        ClientController clientCtrl = (ClientController) context.getBean("ClientController");
        FactureController factureCtrl = (FactureController) context.getBean("FactureController");

        //clientCtrl.save(new Client("Ayoub"));
        //clientCtrl.update(new Client("Benabid"));
        //clientCtrl.find(1L);
        //clientCtrl.findAll();
        //clientCtrl.delete(1);

        //factureCtrl.save(new Facture(new Date(), 20));
    }
}
