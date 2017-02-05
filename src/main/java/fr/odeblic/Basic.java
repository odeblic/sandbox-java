package fr.odeblic;

public class Basic
{
    public String str;

    public Basic(String str)
    {
        this.str = str;
    }

    public static void doAction()
    {
        Basic x = new Basic("foo");
        
        final int y = 33;
        
        final String z = "bla";
        
        System.out.println("str = " + x.str);
        
        append(x);
        
        System.out.println("str = " + x.str);
        
        overwriteContent(x);
        
        System.out.println("str = " + x.str);
        
        overwriteRef(x);
        
        System.out.println("str = " + x.str);
    }
    
    private static void append(Basic x)
    {
        x.str += " ";
        x.str += "bar";
    }
    
    private static void change(Basic x)
    {
        x.str = "other";
    }
    
    private static void overwriteContent(final Basic x)
    {
        x.str = "stuff";
    }
    
    private static void overwriteRef(final Basic x)
    {
        //x = new Basic("forbidden");
    }
}

