package inheritance.test.child;


public class TestInheritance {
    public int smth;
    protected int idefault;

    public void doSmth() {
        getSmth(5);
        System.out.println(smth * 2);
    }

    private int getSmth(int a) {
        return smth;
    }
}


/* и методы и поля
 * private - visibility only inside class - inheritance == no
 deafult:  * package - private - visibility only inside package (no subpackage ) - inheritance == not important
 * protected - visibility only inside package + subclasses -inheritance == yes
 * public - visibility anywhere
 * */
/* у класса
  deafult:  * package - private - visibility only inside package (no subpackage)
 * public - visibility anywhere
 * */