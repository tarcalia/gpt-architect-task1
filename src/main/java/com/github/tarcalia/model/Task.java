package com.github.tarcalia.model;

import com.github.tarcalia.model.state.State;

import java.io.Serializable;
import java.util.UUID;

/**
 * Generic domain class for {@link Task} entities.
 */
public abstract class Task implements Serializable {
    public UUID id;
    public State state;
}
