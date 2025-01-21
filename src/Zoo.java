import java.util.Arrays;

public class Zoo {

    Object[] objects;

    public Zoo() {
        objects = new Object[3];

        objects[0] = new Dog();
        objects[1] = new Cat();
        objects[2] = new Reptile();
    }

    //переопределяем метод toString, ниже сделано сложнее
    public String toString() {
        return "Zoo: " + Arrays.toString(objects);
    }

    /*
    //переопределяем метод toString, выше сделано проще
    @Override
    public String toString() {
        String result = "Zoo: [";
        for (Object animal : objects) {
            result += animal + ", ";
        }
        result = result.substring(0, result.length() - 2); // Удаляем последнюю запятую и пробел
        result += "]";
        return result;
    }*/

    public void print() {
        for (Object a : objects) {
            System.out.println(a);
        }
    }

    public void change(Object a, int i) {
        if (i >= 0 && i < objects.length)
            objects[i] = a;
    }
}