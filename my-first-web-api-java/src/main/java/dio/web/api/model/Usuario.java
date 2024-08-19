package dio.web.api.model;

public class Usuario {
    private Integer id;
    private String login;
    private String senha;
    public Usuario(){}
    public Usuario(String login, String senha){
        this.login = login;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", login=" + login + ", senha=" + senha + '}';
    }

    public String getId() {
        return "id: " + id + ", login: " + login + ", senha: " + senha;
    }
    
    
}
