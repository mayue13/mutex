class  ArrayDemo
{
	public static void main(String[] args) 
	{
		int[][] table = new int[10][];
		for(int i=0;i<table.length;i++){
		
		 table[i]=new int[10];
		}
        int count=1;
		for(int i=0;i<table.length;i++)
		{
			
		    for(int j=0;j<table[i].length;j++){
				table[j][i]=count++;
		      
		   }

		}
		for(int i=0;i<table.length;i++)
		{
			System.out.println("");
		    for(int j=0;j<table[i].length;j++){
				
		      System.out.print(table[i][j]+"  ");
		   }

		}



	}
}
