package Task1;



import Task1.Animal;

public class main {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex", 5, "Brown", "Golden Retriever");
        Cat cat = new Cat("Whiskers", 3, "Gray", true);
        Eagle eagle = new Eagle("Freedom", 10, true, "Hooked");
        Shark shark = new Shark("Jaws", 15, "Ocean", 300);
        Turtle turtle = new Turtle("Shelly", 20, false, "Hard-shell");

        System.out.println("Dog: " + dog.getName() + " is a " + dog.getBreed() + " with " + dog.getFurColor() + " fur.");
        System.out.println("Cat: " + cat.getName() + " has " + (cat.hasTail() ? "a tail" : "no tail") + " and " + cat.getFurColor() + " fur.");
        System.out.println("Eagle: " + eagle.getName() + " has a " + eagle.getBeakType() + " beak and can " + (eagle.isCanFly() ? "fly" : "not fly") + ".");
        System.out.println("Shark: " + shark.getName() + " with " + shark.getTeethCount() + " teeth, lives in the " + shark.getHabitat() + ".");
        System.out.println("Turtle: " + turtle.getName() + " has a " + turtle.getShellType() + " shell and is " + (turtle.isColdBlooded() ? "cold-blooded" : "warm-blooded") + ".");
    }
}







