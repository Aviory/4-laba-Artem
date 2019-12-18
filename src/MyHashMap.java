
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MyHashMap {

    Map<TypeCats,Cat> catsByTypes = new HashMap<>();

    public void createCat (int n) {
        for (int i = 0; i < n; i++) {
            createCat(randomType());
        }
    }




    public void createCat(TypeCats typeCats){
        Cat cat = new Cat(typeCats);
        catsByTypes.put(typeCats,cat);
    }

    private TypeCats randomType (){
        Random random = new Random();
        return TypeCats.values()[random.nextInt(5)];
    }

    void  print(){
        for (Map.Entry entry : catsByTypes.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: "
                    + entry.getValue());
        }
    }
}