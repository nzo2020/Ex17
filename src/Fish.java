class Fish extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Blub");
    }

    @Override
    public void move() {
        System.out.println("swimming");
    }

    @Override
    public void eat() {
        System.out.println("algae");
    }

    public void moveOnLand() {
        System.out.println("The fish cannot move on land");
    }
}