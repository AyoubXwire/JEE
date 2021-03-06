package cigma.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "clients")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
@DiscriminatorValue("client")
public class Client {

    public Client(String name) {
        this.name = name;
    }

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "full_name")
    private String name;

    @OneToMany(mappedBy = "client", cascade = CascadeType.PERSIST)
    private List<Facture> factures;

}