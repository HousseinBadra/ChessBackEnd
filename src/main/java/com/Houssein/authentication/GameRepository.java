package com.Houssein.authentication;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
    List<Game> findByWhiteUsernameOrBlackUsername(String whiteUsername, String blackUsername);
}
