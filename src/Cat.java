import java.lang.reflect.Type;

public class Cat {
    TypeCats type;

    public Cat( TypeCats type) {
        this.type = type;
    }


    @Override
    public int hashCode() {
        return type.ordinal();
    }

    @Override
    public boolean equals(Object obj) {
        Cat c = (Cat)obj;
        return c.type==type;
    }

}
