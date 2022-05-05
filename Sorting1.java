class Sorting1{
	
	
	void sorting(int arr){
		int n=arr.length;
		for(int i=1;i<n;i++){
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp){
				arr[j=1]=arr[j];
				j=j-1;
			}
			arr[j+1]=temp;
		}
	}
	static void display(int arr[]){
		int n=arr.length;
		for(int i=0;i<n;i++){
			System.out.println(arr[i]+" ");
		}
	}
	
	public static void main(String[] ak){
		Sorting1 s1=new Sorting1();
		int arr[]=a{1,2,3,4,5};
		s1.sorting(arr);
		s1.display(arr);
	}
}