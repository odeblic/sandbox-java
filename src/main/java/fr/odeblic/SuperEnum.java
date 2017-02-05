package fr.odeblic;

public class SuperEnum
{
	public enum Enum
	{
	  JAVA(1),
	  C(2),
	  CPP(3),
	  Python(4),
	  Rust(5);

    private int id;

    Enum(int id)
    {
      this.id = id;
    }

    String getName()
    {
      return super.toString();
    }
    
    int getId()
    {
      return this.id;
    }

    public String toString()
    {
      return super.toString() + " (" + Integer.toString(id) + ")";
    }
	}

  public static void doAction()
  {
    System.out.println("START");

    for(Enum e : Enum.values())
    {
    	System.out.printf("Enum.%s : %d\n", e.getName(), e.getId());
    }      

    for(Enum e : Enum.values())
    {
    	System.out.printf("Enum : \"%s\"\n", e);
    }      

    System.out.println("STOP");
  }
}

