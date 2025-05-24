package com.Houssein.authentication;
import jakarta.persistence.*;

@Entity
@Table(name = "games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(name = "white_username", nullable = false)
    private String whiteUsername;

    @Column(name = "black_username", nullable = false)
    private String blackUsername;

    @Column(name = "moves", columnDefinition = "text[]", nullable = false)
    private String[] moves;

    public String getWhiteUsername() {
        return whiteUsername;
    }

    public void setBlackUsername(String blackUsername) {
        this.blackUsername = blackUsername;
    }

    public String getBlackUsername() {
        return blackUsername;
    }

    public void setWhiteUsername(String whiteUsername) {
        this.whiteUsername = whiteUsername;
    }

    // Constructors
    public Game() {}

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String[] getMoves() {
        return moves;
    }

    public void setMoves(String[] moves) {
        this.moves = moves;
    }
}