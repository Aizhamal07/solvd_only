package theoryWithSerey;

public class Box<T> {
    //by this T we are saying we work with generics
    private T t;

    public void setObject(T t) {
        this.t = t;
    }

    public T getObject() {
        return t;
    }
}

//public class Main{
//    public static void main(String[] args) {
//        Box <Integer> box=new Box<>();
//        box.setObject(11);
//        Box <String> box2=new Box<>();
//        box2.setObject("11");
//
//        BoxT<Double> doubleBox=new BoxT<>();
//        doubleBox.setObject(20d);
//
//
//
//
//
//
//
//    }
//
//    public class BoxT <T extends Number>{
//    public T sum(T num){
//        t+=num.intValue();
//        return t;
//    }
//
//    }