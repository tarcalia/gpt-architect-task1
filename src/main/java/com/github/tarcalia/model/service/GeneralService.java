package com.github.tarcalia.model.service;

import com.github.tarcalia.model.Task;
import com.github.tarcalia.model.state.State;

public abstract class GeneralService<T extends Task, K> {

    //fixme
    /**
     * Mark a {@link Task} entity.
     * @param id is the ID of the {@link Task}.
     * @return the marked entity.
     */
    T markTask(K id) {
        return null;
    }

    //fixme
    /**
     * Set {@link Task} entity priority.
     * @param id is the ID of the {@link Task}.
     * @return the set entity.
     */
    T setPriority(K id) {
        return null;
    }

    /**
     * Update state for a {@link Task} entity.
     * @return the set entity.
     */
    T updateState(T task) {
        switch (task.state) {
            case NEW -> task.state = State.IN_PROGRESS;
            case IN_PROGRESS -> task.state = State.COMPLETED;
            case COMPLETED -> {}
        }
        return task;
    }
}
