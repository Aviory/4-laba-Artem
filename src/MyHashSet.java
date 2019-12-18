import java.util.*;

public class MyHashSet {
    LinkedHashSet<Cat> catsByTypes = new LinkedHashSet<>();

    public void createCat (int n) {
        for (int i = 0; i < n; i++) {
            createCat(randomType());
        }
    }

    public void createCat(TypeCats typeCats){
        Cat cat = new Cat(typeCats);
        catsByTypes.add(cat);

    }


    private TypeCats randomType (){
        Random random = new Random();
        return TypeCats.values()[random.nextInt(5)];
    }

    void  print(){
        for (Cat cat:catsByTypes) {
            System.out.println("type = "+ cat.type);
        }
    }
}

