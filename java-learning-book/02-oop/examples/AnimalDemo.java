// 这个示例演示继承和多态。
public class AnimalDemo {
    public static void main(String[] args) {
        // 左边是父类 Animal，右边是子类 Dog/Cat，这就是多态的常见写法。
        Animal dog = new Dog("旺财");
        Animal cat = new Cat("小花");

        dog.eat();
        dog.makeSound();

        cat.eat();
        cat.makeSound();
    }
}

// 父类：把动物共同拥有的属性和方法放在这里。
class Animal {
    // protected 表示子类也可以访问这个属性。
    protected String name;

    // 父类构造方法。
    public Animal(String name) {
        this.name = name;
    }

    // 所有动物都能吃东西，所以放在父类里。
    public void eat() {
        System.out.println(name + "正在吃东西");
    }

    // 父类提供一个默认声音，子类可以重写这个方法。
    public void makeSound() {
        System.out.println(name + "发出声音");
    }
}

// Dog 通过 extends 继承 Animal。
class Dog extends Animal {
    public Dog(String name) {
        // super(name) 表示调用父类 Animal 的构造方法。
        super(name);
    }

    // 子类重写父类方法，让狗有自己的叫声。
    public void makeSound() {
        System.out.println(name + "：汪汪");
    }
}

// Cat 也是 Animal 的子类。
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    // 子类重写父类方法，让猫有自己的叫声。
    public void makeSound() {
        System.out.println(name + "：喵喵");
    }
}
