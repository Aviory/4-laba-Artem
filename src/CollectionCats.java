import java.util.*;

public class CollectionCats {
    LinkedList<Cat> cats = new LinkedList<>();


    public void createCat (int n) {
        for (int i = 0; i < n; i++) {
            createCat(randomType());

        }
    }


    public void createCat(TypeCats typeCats){
        Cat cat = new Cat(typeCats);
        cats.add(cat);

    }
    public  void  createFirst (TypeCats typeCats){
        Cat cat = new Cat(typeCats);
        cats.addFirst(cat);

    }


    private TypeCats randomType (){
        Random random = new Random();
        return TypeCats.values()[random.nextInt(3)];
    }

    void  print(){
        for (Cat cat:cats) {
            System.out.println("type = "+ cat.type);
        }
    }
}
