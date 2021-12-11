package Week13.composite;

public class Main {
    public static void main(String[] args) {

        Person James = new Person("James");
        Person Hana = new Person("Hana");
        Person Ryan = new Person("Ryan");
        Person Kai = new Person("Kai");

        James.setMarriage(Hana);
        James.getChildren().add(Ryan);
        James.getChildren().add(Kai);

        Person Jenifer = new Person("Jenifer");
        Kai.setMarriage(Jenifer);

        Person child1 = new Person("Rooney");
        Person child2 = new Person("Robin");
        Person child3 = new Person("Ronaldo");
        Person child4 = new Person("Bruno");

        Kai.getChildren().add(child1);
        Kai.getChildren().add(child2);
        Kai.getChildren().add(child3);
        Kai.getChildren().add(child4);

          /*
                    James + Hana
                  /             \
              Ryan          Kai + Jenifer
                          /    |     |     \
                      Rooney Robin Ronaldo Bruno
         */

        System.out.println("Cặp vợ chồng có 2 con:");
        James.find2Children();
        System.out.println("Thế hệ mới nhất:");
        James.findNewGeneration(0);
        System.out.println(Person.generation);
    }
}
