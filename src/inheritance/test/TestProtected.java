package inheritance.test;

import inheritance.test.child.MyTest;

public class TestProtected extends MyTest{
    public int x = this.idefault;
    private int y;

    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        TestProtected testProtected = new TestProtected();
/*        testProtected.y
        myTest.idefault =4;*/
    }
}
