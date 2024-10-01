package com.github.tarcalia.model.state;

import com.github.tarcalia.model.Task;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class State {
    private Task task;

    protected State(Task task) {
        this.task = task;
    }
}
