class Park extends Town implements Trees{
    public Park(String title) {
        super("park", title);
    }

    @Override
    public void growTrees() {
        System.out.println("Trees grow in the park");
    }
}
