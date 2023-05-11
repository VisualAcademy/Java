import java.util.*;

//사람을 나타내는 클래스
class Person {
    int id; //사람의 id
    String name; //사람의 이름
    int age; //사람의 나이

    Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

public class SortObjects {
    public static void main(String[] args) {
        //사람들을 나타내는 리스트
        List<Person> people = Arrays.asList(
            new Person(1, "홍길동", 20),
            new Person(2, "백두산", 25),
            new Person(3, "임꺽정", 30),
            new Person(4, "한라산", 28)
        );

        System.out.println("정렬되지 않은 사람들:");
        for (Person person : people) {
            System.out.printf("%d: %s, %d\n", person.id, person.name, person.age);
        }

        //나이를 기준으로 사람들을 정렬
        Collections.sort(people, Comparator.comparingInt(person -> person.age));

        System.out.println("나이별로 정렬된 사람들:");
        for (Person person : people) {
            System.out.printf("%d: %s, %d\n", person.id, person.name, person.age);
        }
    }
}