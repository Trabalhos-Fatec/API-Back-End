package br.com.fatec.apibackend.entities;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "data_user")
public class DadosUsuario {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "data_user_id")
  private Long id;

  @OneToMany(fetch = FetchType.LAZY)
  @JoinTable(name = "dados_email", joinColumns = {@JoinColumn(name = "data_user_id")},
      inverseJoinColumns = {@JoinColumn(name = "email_id")})
  private Set<Email> email;

  @OneToMany(fetch = FetchType.LAZY)
  @JoinTable(name = "dados_telefone", joinColumns = {@JoinColumn(name = "data_user_id")},
      inverseJoinColumns = {@JoinColumn(name = "tel_id")})
  private Set<Telefone> telefone;

}
