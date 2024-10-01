package com.github.tarcalia.repository;

import com.github.tarcalia.model.Task;

import java.util.List;
import java.util.UUID;

/**
 * Repository abstract class for {@link Task} class.
 * @param <T> is the {@link Task} class.
 * @param <K> is the {@link UUID} of {@link Task}.
 */
public interface GenericRepository<T extends Task, K> {

    /**
     * Save a {@link Task} into the database.
     * @param entity the entity to be saved.
     * @return the saved entity.
     */
    T save(T entity);

    /**
     * Update a {@link Task} into the database.
     * @param entity the entity to be saved.
     * @return the updated entity.
     */
    T update(T entity);

    /**
     * Find {@link Task} by id.
     * @param id the ID of the {@link Task}.
     * @return the entity if it exists.
     */
    T findById(K id);

    /**
     * Return all {@link Task}.
     * @return a list of {@link Task}.
     */
    List<T> findAll();

    /**
     * Delete a {@link Task} by id.
     * @param id the ID of the {@link Task}.
     */
    void deleteById(K id);
}
