package danil;

public class Buhg extends Object{


Buhg(){
 int x=5;
}


    public static void main(String[] args) {
   //SotrudnikChild sotrudnikChild = new SotrudnikChild();
    }


}

class Sotrudnik extends Buhg{


    private String name;
    private String zarplat;

    Sotrudnik(int x, int y) {
        super();
    }

  private  Sotrudnik() {
        int x =5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


class SotrudnikChild  extends Sotrudnik{


    private String name;
    private String zarplat;

    SotrudnikChild(int x, int y) {
        super(x, y);


    }

/*  private  SotrudnikChild() {
int x =5;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}