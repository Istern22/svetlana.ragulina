package ru.job4j.tracker;

import java.util.List;

public class StubInput implements Input {
    /**
     * Это поле содержит последовательность ответов пользователя.
     * Например, если пользователь хочет выбрать добавление
     * новой заявки, ему нужно ввести:
     * 0 - выбор пункта меню "Add new item".
     * name - имя заявки
     * desc - описание заявки
     * 6 - выйти из трекера
     */
    private final String[] value;

    /**
     * Поле считает количество вызовом метода ask.
     * При каждом вызове надо передвинуть указатель но новое число.
     */
    private int position;

    public StubInput(final String[] value) {
        this.value = value;
    }

    public int ask(String question, List<Integer> range) {
            int key = Integer.valueOf(this.ask(question));
            if (!range.contains(key)) {
                throw new MenuOutException("Out of menu range.");
            }
            return key;
    }

    /**
     * Давайте рассмотрим, как работает этот метод.
     * У нас есть объект, в котором содержатся заранее продуманные ответы.
     * При последовательном вызове метода ask нам надо возвращать соответствующие данные,
     * как если бы мы симулировали поведение пользователя.
     * Для этого при каждом вызове метода ask мы увеличиваем сетчик,
     * и при следующем вызове он вернет нам новове значение.
     */
    @Override
    public String ask(String question) {
        return this.value[this.position++];
    }
}
