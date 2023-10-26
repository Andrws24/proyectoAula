
package control;

import java.util.Vector;
import modelo.Usuario;

public class UsuarioController {
    private Vector usuarios = new Vector();

    public UsuarioController() {
    }

    public void agregar(Usuario b) {
        getUsuarios().add(b);
    }

    public Usuario consultar(String c) {
        Usuario b = null;
        for (int i = 0; i < getUsuarios().size(); i++) {
            Usuario blo = (Usuario) getUsuarios().get(i);
            if (blo.getIdentificacion().equals(c)) {
                b = blo;break;
            }
        }
        return b;
    }

    public void eliminar(String c){
         for (int i = 0; i < getUsuarios().size(); i++) {
            Usuario blo = (Usuario) getUsuarios().get(i);
            if (blo.getIdentificacion().equals(c)) {
                getUsuarios().remove(i);break;
            }
        }
    }

    
    public Vector getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Vector usuarios) {
        this.usuarios = usuarios;
    }
}
