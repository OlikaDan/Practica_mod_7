public class Square extends Town implements Trees {
    public Square(String title) {
        super("square", title);
    }

    @Override
    public void growTrees() {
        System.out.println("Trees grow on the square");
    }
}
