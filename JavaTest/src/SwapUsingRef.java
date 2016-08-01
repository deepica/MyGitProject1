
public class SwapUsingRef{
	int a;
    SwapUsingRef(int a)
    	{ 
    	this.a=a;
    	}
    	void swap(SwapUsingRef o)
    		{
    			int temp=this.a;
    			this.a=o.a;
    			o.a=temp;
    		}
    public static void main(String args[])
    {
    	SwapUsingRef obj1=new SwapUsingRef(5);
    	SwapUsingRef obj2=new SwapUsingRef(7);
    	
    	System.out.println("obj1 has integer value->"+obj1.a);
    	System.out.println("obj2 has integer value->"+obj2.a);
    	
    	obj1.swap(obj2);//this should swap using call by reference
    	
    	System.out.println("obj1 has integer value->"+obj1.a);
    	System.out.println("obj2 has integer value->"+obj2.a);
    }
}