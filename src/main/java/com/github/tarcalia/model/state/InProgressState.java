package com.github.tarcalia.model.state;

import com.github.tarcalia.model.Task;

public class InProgressState extends State {
    public InProgressState(Task task) {
        super(task);
    }
}
