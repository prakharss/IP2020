class StaticAnoynymous{
  static {
    System.out.println("1");
  }

  {
    System.out.println("2");
  }

  {
    System.out.println("1");
  }

  public static void main(String args[]){
    System.out.println("Inside Main");
    StaticAnoynymous sn = new StaticAnoynymous();
  }
}

/*
1
Inside Main
2
1
*/