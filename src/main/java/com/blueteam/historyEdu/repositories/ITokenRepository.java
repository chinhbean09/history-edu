package com.blueteam.historyEdu.repositories;

import com.blueteam.historyEdu.entities.Token;
import com.blueteam.historyEdu.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ITokenRepository extends JpaRepository<Token, Long> {

    List<Token> findByUser(User user);

    Token findByToken(String token);

    Token findByRefreshToken(String token);

    List<Token> findByUserId(Long userId);
}
