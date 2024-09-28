class Bird extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Chirp");
    }

    @Override
    public void move() {
        System.out.println("Fling");
    }

    @Override
    public void eat() {
        System.out.println("seeds");
    }
}
