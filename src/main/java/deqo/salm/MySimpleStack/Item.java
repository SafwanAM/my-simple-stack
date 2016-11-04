package deqo.salm.MySimpleStack;

/**
 * Created by 21305507 on 04/11/2016.
 */
public class Item {
    public Object value;

    Item(Object value){
        setValue(value);
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
