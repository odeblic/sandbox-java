package fr.odeblic;

import fr.odeblic.hidden.*;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello World !");
        
        playWithBasic();
        playWithSideClass();
        playWithHiddenClass();
        playWithSuperEnum();
        playWithCWrapper();
    }

    private static void playWithBasic()
    {
      Basic.doAction();
    }

    private static void playWithSideClass()
    {
        SideClass sc = new SideClass();
        System.out.println("SideClass says : " + sc.getMessage());
    }
    
    private static void playWithHiddenClass()
    {
        HiddenClass hc = new HiddenClass();
        System.out.println("HiddenClass says : " + hc.getMessage());
    }

    private static void playWithSuperEnum()
    {
      SuperEnum.doAction();
    }
    
    private static void playWithCWrapper()
    {
        CWrapper cw = new CWrapper();
        System.out.println("CWrapper has msg = " + cw.getMessage());
        System.out.println("CWrapper has id = " + cw.getId());
    }
}

