public class Main {
    public static void main(String[] args) {

        Object[] objects;
        Street street = new Street("Lenina");
        Park park = new Park("Svobody");
        Square square = new Square("Komsomol'skaya");
        objects = new Object[3];
        objects[0] = street;
        objects[1] = park;
        objects[2] = square;
        System.out.println(street.getInfoObj() + "\n" + park.getInfoObj() + "\n" + square.getInfoObj());

        Street.House house = street.getHouse();//создаем объект внутреннего класса House
        house.setNumber(9);

        objects = new Object[3];
        objects[0] = street;
        objects[1] = park;
        objects[2] = square;
        for (Object a : objects) {//проверяем реализует ли объект города интерфейс Trees, и если да, выполняет метод growTrees()
            if (a instanceof Trees)
                ((Trees) a).growTrees();
        }
    }
}
