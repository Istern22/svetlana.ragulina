package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставки использовать add(int index, E value)
     * @param task задача
     */
    public void put(Task task) {
        int index = 0;
        for (Task value : tasks) {
            if (task.getPriority() > value.getPriority()) {
                index = index + 1;
            }
        }
        tasks.add(index, task);
    }

    public Task take() {
        return this.tasks.poll();
    }
}