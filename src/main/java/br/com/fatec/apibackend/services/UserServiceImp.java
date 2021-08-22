package br.com.fatec.apibackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.fatec.apibackend.entities.Usuario;
import br.com.fatec.apibackend.repository.UserRepository;

@Service
public class UserServiceImp implements UserService {

  @Autowired
  private UserRepository userRepo;

  public Usuario cadastroUsuario(Usuario user) {
    return userRepo.save(user);

  }

}
