package org.java.interview.order;

public class GroupingKey {
    private Object[] keys;

    public GroupingKey(Object... keys) {
        if (keys == null) {
            this.keys = new Object[]{};
        } else {
            this.keys = keys;
        }
    }

    public <T> T getKey(int idx, Class<T> clazz) {
        if (idx < 0 || idx >= keys.length) return null;
        if (clazz.isInstance(keys[idx])) return null;
        return (T)keys[idx];
    }

    public int hashCode() {
        int hash = 0;
        int mode = 31;
        for(int i = 0; i < this.keys.length; i++) {
            if (keys[i] != null) {
                hash += mode * keys[i].hashCode();
            }
        }
        return hash;
    }

    public boolean equals(Object other) {
        if (other == null) return  false;
        if (!(other instanceof GroupingKey)) return false;
        GroupingKey that = (GroupingKey) other;
        if (this.keys.length != that.keys.length) return false;
        for(int i = 0; i < this.keys.length; i++) {
            boolean currentKeysAreEqual = (this.keys[i] == null && that.keys[i] == null)
                    || (this.keys[i].equals(that.keys[i]));
            if (!currentKeysAreEqual) return false;
        }
        return true;
    }
}
