package core.genericClasses;

public class MyTClass <T, V>{

    T x;
    V y;

    MyTClass(T x, V y){
        this.x = x;
        this.y = y;
    }

    public V getValue(){
        return y;

    }
}
