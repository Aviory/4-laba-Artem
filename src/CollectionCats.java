import java.util.*;

public class CollectionCats {
    int sum = 20;
    List<Cat> cats = new LinkedList<>();


    public void createCat (int n) {
        for (int i = 0; i < n; i++) {
            createCat(randomType());
        }
    }


    public void createAllCatsWithoutReplay () {

    }


    public void createCat(TypeCats typeCats){
        Cat cat = new Cat(typeCats);
        cats.add(cat);

    }
    public  void  createFirst (TypeCats typeCats){
        //создать кота и добавить в начало. HashMap?,

    }


    private TypeCats randomType (){
        Random random = new Random();
        return TypeCats.values()[random.nextInt(3)];
    }
}
