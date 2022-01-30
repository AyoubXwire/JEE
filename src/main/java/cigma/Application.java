package cigma;

import org.springframework.context.ApplicationContext;

import cigma.controllers.ClientController;
import cigma.controllers.FactureController;
import cigma.models.Client;
import cigma.models.Facture;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        ClientController clientController = (ClientController) context.getBean("ClientController");
        FactureController factureController = (FactureController) context.getBean("FactureController");

//        Client client = new Client("Ayoub");
//        List<Facture> f = new ArrayList<>();
//        f.add(new Facture(new Date(), 10, client));
//        f.add(new Facture(new Date(), 20, client));
//
//        client.setFactures(f);
//
//        clientController.save(client);

        //clientController.update(new Client("Benabid"));
        //clientController.find(1L);
        //clientController.findAll();
        //clientController.delete(1);

        //factureController.save(new Facture(new Date(), 20));
    }
}
