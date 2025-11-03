package ni.edu.uam.facturacion.modelo;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.DescriptionsList;
import org.openxava.annotations.Required;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Producto {
    @Id
    @Column(length=9)
    int numero;

    @Column(length=50)
    @Required
    String descripcion;

    @ManyToOne(
            fetch= FetchType.LAZY,
            optional = true
    )
    @DescriptionsList
    Categoria categoria;
}
