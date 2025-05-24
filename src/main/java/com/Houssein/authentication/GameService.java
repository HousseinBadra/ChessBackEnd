package com.Houssein.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public Game addGame(Game game) {
        System.out.println(game.toString());
        return gameRepository.save(game);
    }

    public Game updateGame(Long id, Game updated) {
        return gameRepository.findById(id)
                .map(existing -> {
                    existing.setMoves(updated.getMoves());
                    return gameRepository.save(existing);
                })
                .orElseThrow(() -> new RuntimeException("Game not found with id " + id));
    }

    public Game getGameById(Long id) {
        return gameRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Game not found with id " + id));
    }

    public List<Game> getGamesForUser(String username) {
        return gameRepository.findByWhiteUsernameOrBlackUsername(username, username);
    }
}