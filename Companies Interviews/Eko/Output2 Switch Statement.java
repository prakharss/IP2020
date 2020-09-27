class Output
{
    final static short i = 2;
    public static int j = 0;
    
    public static void main(String [] args)
    {
        for (int k = 0; k < 3; k++)
        {
            switch (k)
            {
                case i: System.out.print(" 0 ");   //2
                case i-1: System.out.print(" 1 ");   //1 
                case i-2: System.out.print(" 2 ");   //0
            }
        }
    }
}

/*
k=0   2 1 0
k=1
k=2
*/