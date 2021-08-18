package br.com.fatec.apibackend;

import javax.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

@SpringBootTest
@Transactional
@Rollback
class ApiBackendApplicationTests {

  @Autowired

  @Test
  void contextLoads() {}

}
