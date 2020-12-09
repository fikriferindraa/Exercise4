abstract class Marks {
     void getPercentage() {
    }
}

class a extends Marks {
    int mark1,mark2,mark3,percentage;

    a(int d, int m, int y) {
        this.mark1 = d;
        this.mark2 = m;
        this.mark3 = y;
}

    void getPercentage(){
        percentage = (mark1 + mark2 + mark3)/300*100;
        System.out.println("total percentage class a = " + percentage + "%");
    }
}

class b extends Marks {
    int mark1, mark2, mark3,percentage;

    b(int d, int m, int y){
        this.mark1 = d;
        this.mark2 = m;
        this.mark3 = y;
    }
    void getPercentage(){
        percentage = (mark1 + mark2 + mark3)/300*100;
        System.out.println("total percentage class b = " + percentage + "%");
    }
}

public class abstraction{
    public static void main(String[] args){
        a obj = new a(100,100,100);
        b obj2 = new b(100, 100, 100);
        obj.getPercentage();
        obj2.getPercentage();

    }
}