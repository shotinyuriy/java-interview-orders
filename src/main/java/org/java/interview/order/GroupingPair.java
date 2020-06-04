package org.java.interview.order;

public class GroupingPair<T> {
    private GroupingKey key;
    private T value;

    public GroupingPair(GroupingKey key, T value) {
        this.key = key;
        this.value = value;
    }

    public GroupingKey getKey() {
        return key;
    }

    public T getValue() {
        return value;
    }
}
