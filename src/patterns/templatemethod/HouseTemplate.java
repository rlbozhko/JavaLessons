package patterns.templatemethod;
/*Поведенческий шаблон*/
public abstract class HouseTemplate {
    private void buildWindows() {
        System.out.println("Install windows");
    }

    private void buildFoundation() {
        System.out.println("Install foundation");
    }

    public abstract void buildWalls();

    public abstract void buildPillars();

    public final void buildHouse() {
        buildFoundation();
        buildWalls();
        buildWindows();
        buildPillars();
    }

}


class GlassHouse extends HouseTemplate {

    @Override
    public void buildWalls() {
        System.out.println("Install glass walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Install glass pillars");
    }
}

class WoodHouse extends HouseTemplate {
    @Override
    public void buildWalls() {
        System.out.println("Install wood walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Install wood pillars");
    }
}

class Worker {
    public static void main(String[] args) {
        HouseTemplate woodHouse = new GlassHouse();

        woodHouse.buildHouse();
    }
}


