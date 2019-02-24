package patterns.prototype;

public class Prototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        HardCreatedObject object = new HardCreatedObject();
        HardCreatedObject copy = object.copy();

    }
}

interface Copyable {
    Copyable copy() throws CloneNotSupportedException;
}

class HardCreatedObject implements Copyable, Cloneable {

    @Override
    public HardCreatedObject copy() throws CloneNotSupportedException {
        //clone() у Обджекта делает поверхностное shallow копированием
        return (HardCreatedObject) super.clone();
    }
}

class ExpensiveObject implements Cloneable {


    public ExpensiveObject clone() throws CloneNotSupportedException {
        //clone() у Обджекта делает поверхностное shallow копированием
        return (ExpensiveObject) super.clone();
    }
}

class CreatorExpensiveObject {
    private ExpensiveObject object;

    public CreatorExpensiveObject(ExpensiveObject object) {
        this.object = object;
    }

    public ExpensiveObject copy() throws CloneNotSupportedException {
        return object.clone();
    }
}

/*
class CreatorExpensiveObject<T extends ExpensiveObject> {
    private T object;

    public CreatorExpensiveObject(T object) {
        this.object = object;
    }

    @SuppressWarnings("unchecked")
    public T copy() throws CloneNotSupportedException {
        return (T) object.clone();
    }
}
 */

/*
public class CookieMachine {

    private Cookie cookie; // Could have been a private Cloneable cookie.

    public CookieMachine(Cookie cookie) {
        this.cookie = cookie;
    }

    public Cookie makeCookie() throws CloneNotSupportedException {
        return (Cookie) this.cookie.clone();
    }

    public static void main(String args[]) throws CloneNotSupportedException {
        Cookie tempCookie = null;
        Cookie prot = new CoconutCookie();
        CookieMachine cm = new CookieMachine(prot);
        for (int i = 0; i < 100; i++)
            tempCookie = (Cookie) prot.clone();
    }
}

*/

