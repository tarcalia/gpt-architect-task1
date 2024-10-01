package com.github.tarcalia.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

/**
 * Generic domain class for {@link Task} entities.
 */
@Getter
@Setter
public abstract class Task implements Serializable {
    private UUID id;
    private Priority priority;
    private List<String> tags;
}
