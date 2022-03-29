package eBury_project;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

//Error en Inteli J
@Embeddable
    public class Externa {

    @ManyToOne
    private Cuenta_Externa c_ext;

	public Cuenta_Externa getC_ext() {
		return c_ext;
	}

	public void setC_ext(Cuenta_Externa c_ext) {
		this.c_ext = c_ext;
	}
}
