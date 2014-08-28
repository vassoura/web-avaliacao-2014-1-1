/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inscricao.faces.mngbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;
import utfpr.faces.support.PageBean;

/**
 *
 * @author a1051326
 */
@Named
@ManagedBean
@SessionScoped
public class LoginBean extends PageBean{
    private String usuario;
    private String senha;
    private boolean admin;

    /**
     * Creates a new instance of LoginBean
     */
    public LoginBean() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    
    public String entrar() {
        if (usuario.equals(senha)) {
            if (isAdmin())
                return "/admin.xhtml";
            else
                return "/cadastro.xhtml";
        }
        return "";
    }
}
