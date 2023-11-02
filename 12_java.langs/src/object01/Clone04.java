package object01;
class Point implements Cloneable{
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "x = " + x + ", y = " + y;
	}
	
	@Override
	public Object clone() {
		Object obj = null;
		
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return obj;
	}
}
public class Clone04 {

	public static void main(String[] args) {
		Point originP = new Point(3, 5);
		Point copy = (Point)originP.clone();
		
		System.out.println(originP);
		System.out.println(copy);
		
		System.out.println(originP.hashCode());
		System.out.println(copy.hashCode());
		
		int[] arr = {1,2,3,4,5};
		int[] arrClone = arr.clone();
		System.arraycopy(arr, 0, arrClone, 0, arr.length);
		
		System.out.println(arrClone[0]);
		System.out.println("---------------------");
		
		arrClone[0] = 9;
		System.out.println(arr[0]);
		System.out.println(arrClone[0]);
		
		
	}

}