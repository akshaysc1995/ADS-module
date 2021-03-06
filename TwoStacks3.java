class TwoStacks3{
	
	int[]arr;
	int size;
	int top1,top2;
	
	TwoStacks3(int n){
		size=n;
		arr=new int[n];
		top1=n/2+1;
		top2=n/2;
	}
	void push1(int x){
		if (top1>0){
			top1--;
			arr[top1]=x;
		}
		else{
			System.out.println("stack overflow");
			return;
		}
	}
	
	void push2(int x){
		if(top2<size-1){
			top2++;
			arr[top2]=x;
		}
		else{
			System.out.println("stack overflow");
			return;
		}
	}
	int pop1(){
		if (top1<=size/2){
			int x=arr[top1];
			top1++;
			return x;
		}
		else{
			System.out.println("Stack Underflow");
			System.exit(1);
			
		}
		return 0;
	}
	int pop2(){
		if(top2>=size/2+1){
			int x=arr[top2];
			top2--;
			return x;
		}
		else{
			System.out.println("Stack Underflow");
			System.exit(1);
		}
		return 1;
	}
	public static void main(String[] ak){
		TwoStacks3 t1=new TwoStacks3(5);
		t1.push1(5);
		t1.push2(10);
		t1.push2(15);
		t1.push1(11);
		t1.push2(7);
		
		System.out.println("Popped element from stack1 is "+t1.pop1());
		t1.push2(40);
		System.out.println("Popped element from stack2 is "+t1.pop2());
	}
}