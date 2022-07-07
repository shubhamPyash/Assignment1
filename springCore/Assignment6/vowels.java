package springCoreAssignment6;


public class vowels {

		
	String ary[]=new String[10];
	

    public vowels(String[] ary)
    {
        super();
        this.ary = ary;
    }
	
	
	
	void words()
	{
		for (int i = 0; i < ary.length; i++) 
		{
			String str=ary[i];
			int cnt=0;
		    char ch[]=str.toCharArray();
            for (int j = 0; j < ch.length; j++) 
            {
                if(ch[j]!='a' && ch[j]!='e' && ch[j]!='i' && ch[j]!='o' && ch[j]!='u')
                {
                cnt++;    
                }
            }
            if(cnt==ch.length)
            {
                String s1= new String(ch);
                System.out.println(s1);
            }
        }
    }

}
