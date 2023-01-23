package ma.tms.tms;

import ma.tms.tms.entities.Commande;
import ma.tms.tms.repositories.CommandeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class TmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TmsApplication.class, args);
    }
    //@Bean
    CommandLineRunner commandLineRunner(CommandeRepository commandeRepository) {
        return args -> {
            commandeRepository.save(
                    new Commande(null, "vidange", new Date(), "cc", new Date(), "cc", "en cours"
                            , "kiko", "ss", "dd"));
            ;
            commandeRepository.save(
                    new Commande(null, "Lavage", new Date(), "ff", new Date(), "desc", "zen"
                            , "hh", "hh", "hh"));
            commandeRepository.findAll().forEach(p -> {
                System.out.println(p.getNom());
            });
        };}
}
