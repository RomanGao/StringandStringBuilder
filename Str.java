
public class Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1000;
		while(n<1000000)
		{
			System.out.println("nÎª£º"+n);
			String string="";
			int cout=1;
			  long starTime=System.currentTimeMillis();
			while(cout<n)
			{
				string+=cout;
			 //System.out.println(cout);
				cout++;
			}
			long endTime=System.currentTimeMillis();
			long Time=endTime-starTime;
			System.out.println("String time:"+Time);
			cout=1;
			StringBuilder stringBuilder=new StringBuilder("");
			 starTime=System.currentTimeMillis();
			while(cout<n)
			{
				stringBuilder.append(cout);
				cout++;
			}
			endTime=System.currentTimeMillis();
			Time=endTime-starTime;
			System.out.println("StringBuilder time:"+Time);
			
			n=n*10;
		}
		
	}

}
