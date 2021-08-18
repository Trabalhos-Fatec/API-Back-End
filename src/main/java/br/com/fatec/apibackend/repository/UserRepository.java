package br.com.fatec.apibackend.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;
import br.com.fatec.apibackend.entities.Usuario;

@Repository
public interface UserRepository extends JpaRepositoryImplementation<Usuario, Long> {

}
