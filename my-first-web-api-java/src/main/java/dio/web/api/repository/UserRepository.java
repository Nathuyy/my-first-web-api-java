package dio.web.api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dio.web.api.model.Usuario;

@Repository //define como um componente, oq ue faz com que o Spring fique encarregado de gerenciar toda existência de instancias desse objeto
public class UserRepository {

    public void save(Usuario usuario) {
        if (usuario.getId() == null) {
            System.out.println("SAVE - recebendo o user na camada de repositório");
        } else {
            System.out.println("UPDATE - recebendo o user na camada de repositório");
        }
        System.out.println(usuario);
    }

    public void deletarById(Integer id){
        System.out.println(String.format("DELETE - recebendo o id %d na camada de repositório", id));

    }

    public List<Usuario> findAll(){
        System.out.println("LIST - listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Nathy", "minhaSenha"));
        usuarios.add(new Usuario("Fulano", "senhaFulano"));
        usuarios.add(new Usuario("Ciclano", "senhaCiclano"));
        return usuarios;
    }

    public Usuario findById(Integer id){
        System.out.println(String.format("FIND - recebendo o id %d na camada de repositório", id));
        return new Usuario("Fulano", "senhaFulano");
    }

    public Usuario findByName(String username){
        System.out.println(String.format("FIND - recebendo o username %s na camada de repositório", username));
        return new Usuario("Ciclano", "senhaCiclano");
    }
    
}
