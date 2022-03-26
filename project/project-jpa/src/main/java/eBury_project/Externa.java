package eBury_project;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Embeddable
    public class Externa {

    @ManyToOne
    private Cuenta_Externa c_ext;
}
