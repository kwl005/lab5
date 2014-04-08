public class Hello
{
    public static void main( String argv[] )
    {
        // Default is "World"
        // Author: CSE15L Student (studentemail@email.com)
        String name = "World";
        if ( argv.length != 0 )
        {
            name = argv[0];
        }

        System.out.println( "Hello, " + name + "!" );
    }
}
