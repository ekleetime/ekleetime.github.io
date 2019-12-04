/**
 * Created by lee on 2019-11-29.
 */

public class JunitTest {
    private String name;
    private int age;
    private float tall;

    public JunitTest(String name) {
        this.name = name;
    }

    public JunitTest(String name, int age){
        this.name = name;
        this.age = age;
    }

    public JunitTest(String name, float tall){
        this.name = name;
        this.tall = tall;
    }

    public JunitTest(String name, int age, float tall){
        this.name = name;
        this.age = age;
        this.tall = tall;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public float getTall(){
        return tall;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTall(float tall) {
        this.tall = tall;
    }

    public void printInfo(){
        System.out.println("name: " + name + ", age: " + String.valueOf(age) + ", tall:" + String.valueOf(tall));
    }
}
