package com.Houssein.authentication;

import jakarta.persistence.*;

@Entity
@Table(name = "games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "white_id", nullable = false)
    private Long whiteId;

    @Column(name = "black_id", nullable = false)
    private Long blackId;

    @Column(name = "moves", columnDefinition = "text[]")
    private String[] moves;

    // Constructors
    public Game() {}

    public Game(Long whiteId, Long blackId, String[] moves) {
        this.whiteId = whiteId;
        this.blackId = blackId;
        this.moves = moves;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWhiteId() {
        return whiteId;
    }

    public void setWhiteId(Long whiteId) {
        this.whiteId = whiteId;
    }

    public Long getBlackId() {
        return blackId;
    }

    public void setBlackId(Long blackId) {
        this.blackId = blackId;
    }

    public String[] getMoves() {
        return moves;
    }

    public void setMoves(String[] moves) {
        this.moves = moves;
    }
}
