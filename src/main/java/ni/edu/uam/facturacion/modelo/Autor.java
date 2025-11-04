package ni.edu.uam.facturacion.modelo;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.ListProperties;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Getter @Setter
public class Autor {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(length=32)
    String oid;

    @Column(length=50)
    String nombre;

    @OneToMany(mappedBy = "autor")
    @ListProperties("numero, descripcion, precio")
    Collection<Producto> productos;
}
