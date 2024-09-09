//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    int a = 5;

    public void TangTruong(){
        a++;
    }
    public void SuyThoai(){
        a--;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.TangTruong();
        obj.TangTruong();
        obj.TangTruong();
        System.out.println(obj.a);



    }
}