package com.github.tarcalia.model.state;

import com.github.tarcalia.model.Task;

public class CompletedState extends State {
    public CompletedState(Task task) {
        super(task);
    }
}
