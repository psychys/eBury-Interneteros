package eBury_project;
import javax.persistence.*;

@Entity

public class Externa extends Transaccion{

    @ManyToOne
    private Cuenta_Externa c_ext;

	public Cuenta_Externa getC_ext() {
		return c_ext;
	}

	public void setC_ext(Cuenta_Externa c_ext) {
		this.c_ext = c_ext;
	}

}
