package com.vikky.lecture11;

public class Test1 {
    public static int i1 = 10;
    // WILL THROW AN ERROR
    //  public int i2 = 40;
    public int i2 = 20;
    // WILL THROW AN ERROR
    //  public int i1 = 30;
    public int i3 = 30;

    public static void main(String[] args) {
        int i3 = 40;

        // this will not throw an error because the scopes are different
        int i1 = 50; // - KNOWN AS SHADOWING OFF A STATIC VARIABLE

        int i2 = 30; // - KNOWN AS A SHADOWING OFF AN INSTANCE VARIABLE

        // WILL THROW AN ERROR
        // int i3 = 30;

        //WILL THROW AN ERROR
       /* {
            int i3 = 30;
        }*/

       // WILL THROW AN ERRO
       /* for(int i3 = 0; i3 < 2; i3++) {
            ......
        }*/
    }

}
