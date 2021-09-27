package br.com.digiboard.app.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import br.com.digiboard.app.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	Usuario findByNome(String nome);

}
