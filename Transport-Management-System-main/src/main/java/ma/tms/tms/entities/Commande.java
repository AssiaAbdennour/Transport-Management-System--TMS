package ma.tms.tms.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    @Column(length = 50)
    private String nom;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date_Programmation;
    @NotEmpty
    private String Urgence;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date_acceptation;
    private String etat;

    private String Type_intervention;
    private String Nom_technicien;
    private String type_service;
    @NotEmpty
    private String Description;
}
