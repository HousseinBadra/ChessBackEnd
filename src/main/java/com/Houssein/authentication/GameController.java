package com.Houssein.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @PostMapping("/add")
    public ResponseEntity<Game> createGame(@RequestBody Game game) {
        Game created = gameService.addGame(game);
        return ResponseEntity.ok(created);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Game> updateGame(
            @PathVariable Long id,
            @RequestBody Game game) {
        Game updated = gameService.updateGame(id, game);
        return ResponseEntity.ok(updated);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Game> getGameById(@PathVariable Long id) {
        Game game = gameService.getGameById(id);
        return ResponseEntity.ok(game);
    }

    @GetMapping("user/{userName}")
    public ResponseEntity<List<Game>> getGamesForUser(@PathVariable String userName) {
        List<Game> games = gameService.getGamesForUser(userName);
        return ResponseEntity.ok(games);
    }
}