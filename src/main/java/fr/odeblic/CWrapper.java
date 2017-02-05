package fr.odeblic;

public class CWrapper
{
  static
  {
    try
    {
      System.loadLibrary("native");
    }
    catch (UnsatisfiedLinkError e)
    {
      System.err.println("Native code library failed to load.\n" + e);
      System.exit(1);
    }
  }

  native public void saySomething();
  native public String getMessage();
  native public int getId();
}

