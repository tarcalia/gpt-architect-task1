package com.github.tarcalia.service;

import com.github.tarcalia.model.Task;
import com.github.tarcalia.model.state.CompletedState;
import com.github.tarcalia.model.state.InProgressState;
import com.github.tarcalia.model.state.NewState;
import com.github.tarcalia.model.state.State;

public abstract class GeneralService<T extends State, K extends State> {

    /**
     * Update state for a {@link Task} entity.
     * @return the set entity.
     */
    T updateState(K state) {
        State result = switch (state) {
            case NewState newState -> new InProgressState(state.getTask());
            case InProgressState inProgressState -> new CompletedState(state.getTask());
            case CompletedState completedState -> state;
            case null, default -> throw new IllegalArgumentException("Unknown state");
        };
        return (T) result;
    }
}
