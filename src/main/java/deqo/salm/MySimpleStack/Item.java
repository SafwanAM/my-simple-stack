package deqo.salm.MySimpleStack;

/**
 * Created by 21305507 on 04/11/2016.
 */
public class Item {
    public Object value;

    Item(Object value){
        setValue(value);
    }

    /**
     * Commentaire répondant à l'exigence #1.
     * @return
     */
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
