package ma.tms.tms.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vehicules {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String Poids_max;
    private  String ville;
    public  String commune;
    public String NomConducteur;
    public String marque;
    public String kilometrage;

}
