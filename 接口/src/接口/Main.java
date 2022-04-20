package 接口;
interface ShowMessage{
	void 显示商标(String s);
	default void f() {
		System.out.println("default方法");
	}
}
class TV implements ShowMessage{
	public void 显示商标(String s) {
		System.out.println(s);
	}
	public void f() {
		System.out.println("default方法");
	}
}
class PC implements ShowMessage{
	public void 显示商标(String s) {
		System.out.println(s);
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowMessage sm =null;
		sm.new TV();
		sm.显示商标("长城");
		sm.f();
		sm.new PC();
		sm.显示商标("联想");
		sm.f();
	}

}
