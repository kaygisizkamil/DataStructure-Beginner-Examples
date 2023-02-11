import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class DynamicArray<T> {

    private T[] obj;
    private int current;
    private int capacity;

    public DynamicArray() {
        current = -1;
        capacity = 10;
        obj = (T[])new Object[capacity];
    }

    public void add(T object) {
        if (isFull()) {
            increaseCapacity();
        }
        obj[++current] = object;
    }

    public T get(int index) {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return obj[index];
    }

    public boolean isFull() {
        return current == capacity - 1;
    }

    public boolean isEmpty() {
        return current == -1;
    }

    public void delete(int index) {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (index < 0 || index > current) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < current; i++) {
            obj[i] = obj[i + 1];
        }
        obj[current] = null;
        --current;
    }

    public boolean contains(T object) {
        for (int i = 0; i <= current; i++) {
            if (object.equals(obj[i])) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(T object) {
        for (int i = 0; i <= current; i++) {
            if (obj[i].equals(object)) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    public void set(int index, T object) {
        if (index < 0 || index > current) {
            throw new NoSuchElementException();
        }
        if (isFull()) {
            increaseCapacity();
        }
        for (int i = current; i >= index; i--) {
            obj[i + 1] = obj[i];
        }
        obj[index] = object;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void forEach(Consumer<Object> action) {
        for (int i = 0; i <= current; i++) {
            action.accept(obj[i]);
        }
    }

    private void increaseCapacity() {
        capacity += 10;
        obj = Arrays.copyOf(obj, capacity);
    }
}