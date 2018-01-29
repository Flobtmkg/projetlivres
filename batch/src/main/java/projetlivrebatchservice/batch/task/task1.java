package projetlivrebatchservice.batch.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import projetlivrebatchservice.batch.clientservices.generated.servicePret.Reservation;
import projetlivrebatchservice.batch.clientservices.generated.servicePret.ServicePret;
import projetlivrebatchservice.batch.clientservices.generated.servicePret.ServicePretService;

import java.util.List;


@Component
public class task1 {
    @Scheduled(fixedRate=1000)
    public void work() {
        ServicePretService monservice= new ServicePretService();
        ServicePret accesPret=monservice.getServicePretPort();
        List<Reservation> pretsNonRendus=accesPret.listerUtilisateursPretsNonRendus();
        System.out.println(pretsNonRendus);
    }
}
