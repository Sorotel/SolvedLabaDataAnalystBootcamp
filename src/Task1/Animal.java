package Task1;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


class Mammal extends Animal {
    private String furColor;

    public Mammal(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
}


class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}

class Fish extends Animal {
    private String habitat;

    public Fish(String name, int age, String habitat) {
        super(name, age);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}

class Reptile extends Animal {
    private boolean isColdBlooded;

    public Reptile(String name, int age, boolean isColdBlooded) {
        super(name, age);
        this.isColdBlooded = isColdBlooded;
    }

    public boolean isColdBlooded() {
        return isColdBlooded;
    }

    public void setColdBlooded(boolean isColdBlooded) {
        this.isColdBlooded = isColdBlooded;
    }
}

class Dog extends Mammal {
    private String breed;

    public Dog(String name, int age, String furColor, String breed) {
        super(name, age, furColor);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
class Cat extends Mammal {
    private boolean hasTail;

    public Cat(String name, int age, String furColor, boolean hasTail) {
        super(name, age, furColor);
        this.hasTail = hasTail;
    }

    public boolean hasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }
}

class Eagle extends Bird {
    private String beakType;

    public Eagle(String name, int age, boolean canFly, String beakType) {
        super(name, age, canFly);
        this.beakType = beakType;
    }

    public String getBeakType() {
        return beakType;
    }

    public void setBeakType(String beakType) {
        this.beakType = beakType;
    }
}

class Shark extends Fish {
    private int teethCount;

    public Shark(String name, int age, String habitat, int teethCount) {
        super(name, age, habitat);
        this.teethCount = teethCount;
    }

    public int getTeethCount() {
        return teethCount;
    }

    public void setTeethCount(int teethCount) {
        this.teethCount = teethCount;
    }
}


class Turtle extends Reptile {
    private String shellType;

    public Turtle(String name, int age, boolean isColdBlooded, String shellType) {
        super(name, age, isColdBlooded);
        this.shellType = shellType;
    }

    public String getShellType() {
        return shellType;
    }

    public void setShellType(String shellType) {
        this.shellType = shellType;
    }
}

