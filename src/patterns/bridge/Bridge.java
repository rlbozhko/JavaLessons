package patterns.bridge;

public class Bridge {
    public static void main(String[] args) {
        PersistenceImplementor<Integer> implementorIntRel =
                new RelationDbImplementor();
        PersistenceImplementor<Integer> implementorIntNoRel =
                new NoRelationDbImplementor();

        PersistenceImpl persistence = new PersistenceImpl(implementorIntNoRel);

        persistence.save(8);

        persistence.setImplementor(implementorIntRel);

        persistence.save(74);
    }
}

interface Persistable<T> {
    public void save(T t);

    public T findById(int id);

    public void deleteById(int id);
}

interface PersistenceImplementor<T> {
    public void saveObject(T t);

    public void deleteObjectById(int id);

    public T getObjectById(int id);
}

class PersistenceImpl implements Persistable<Integer> {

    private PersistenceImplementor<Integer> implementor;

    public PersistenceImpl(PersistenceImplementor<Integer> implementor) {
        this.implementor = implementor;
    }

    public void setImplementor(PersistenceImplementor<Integer> implementor) {
        this.implementor = implementor;
    }

    @Override
    public void save(Integer integer) {
        implementor.saveObject(integer);
    }

    @Override
    public Integer findById(int id) {
        return implementor.getObjectById(id);
    }

    @Override
    public void deleteById(int id) {
        implementor.deleteObjectById(id);
    }
}

class RelationDbImplementor implements PersistenceImplementor<Integer> {
    @Override
    public void saveObject(Integer integer) {
        System.out.println("Save Integer to relation database");
    }

    @Override
    public void deleteObjectById(int id) {
        System.out.println(" Delete by id from relation database");
    }

    @Override
    public Integer getObjectById(int id) {
        return 5;
    }
}

class NoRelationDbImplementor implements PersistenceImplementor<Integer> {
    @Override
    public void saveObject(Integer integer) {
        System.out.println("Save Integer to norelation database");
    }

    @Override
    public void deleteObjectById(int id) {
        System.out.println(" Delete by id from norelation database");
    }

    @Override
    public Integer getObjectById(int id) {
        return 7;
    }
}
