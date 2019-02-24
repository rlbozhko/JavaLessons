package patterns.object_pool;

import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.stream.IntStream;

public interface Pool<T> {
    T get();
    void insert(T object);
    void shutdown();
}



interface CreatorFactory<T> {
    T createNew();
}

abstract class ObjectPool<T> implements CreatorFactory<T>, Pool<T> {
    private int size;
    private boolean isShutdown;
    private BlockingQueue<T> objects;

    public ObjectPool(int size) {
        this.size = size;
        isShutdown = false;
        init();
    }

    private void init() {
        objects = new LinkedBlockingDeque<>();

        IntStream.range(0, size).forEach(index -> objects.add(createNew()));
        /*
        int bound = size;
        for (int index = 0; index < bound; index++) {
            objects.add(createNew());
        }
        */
    }

    @Override
    public T get() {

        if (!isShutdown) {

            T t = null;

            try {
                t = objects.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return t;
        }

        throw new IllegalStateException("Object pool is already shutdown");

    }

    @Override
    public void insert(T object) {
        objects.offer(object);
    }

    @Override
    public void shutdown() {
        objects.clear();
        isShutdown = true;
    }

    public int getSize() {
        return objects.size();
    }
}

class ExpensiveObject {
    private String name;

    public ExpensiveObject(String name) {
        this.name = name;
    }

    public void doSomething() {
        System.out.println("I'm resource " + name + ".");
    }
}

class ExpensiveObjectPool extends ObjectPool<ExpensiveObject> {

    public ExpensiveObjectPool(int size) {
        super(size);
    }

    @Override
    public ExpensiveObject createNew() {
        return new ExpensiveObject(UUID.randomUUID().toString());
    }
}

class TestPool {
    public static void main(String[] args) {
        ExpensiveObjectPool pool = new ExpensiveObjectPool(3);

        System.out.println("Pool size: " + pool.getSize());

        ExpensiveObject object = pool.get();

        object.doSomething();

        System.out.println("Pool size: " + pool.getSize());

        pool.insert(object);

        System.out.println("Pool size: " + pool.getSize());

        pool.shutdown();

        ExpensiveObject expensiveObject = pool.get();
        expensiveObject.doSomething();


        BlockingQueue<ExpensiveObject> objects =  new LinkedBlockingDeque<>();



    }
}
