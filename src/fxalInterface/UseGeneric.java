package fxalInterface;

public class UseGeneric implements InterfaceGeneric {

	public static void main(String[] args) {
		InterfaceGeneric<Float> nums = new InterfaceGeneric<Float>() {
	@Override
	public Float compare(FLoat o1, Float o2) {
		if(o1>o2);
		
	}else {
		return o2;
	}
	@Override
	public Float compare(Float o1, Float o2) {
		// TODO Auto-generated method stub
		return null;
	}

};
Float max = nums.compare(34F, 100F);
System.out.println(max);
	}
}
