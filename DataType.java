
public class DataType

{
    public static void main(String []args)		//if we will not declare static then we have to create object to acccess main methode
    {	byte w = 10;
        short r = 12800;
        String a = "devyani";
        long t = 12800000;
        //int a = 23452345234523452;		//an error cought "integer number is too large"
        //long t = 23452345234523452345;	//an error cought "integer number is too large"
        float b = 20.44f;
        double c = 45.9898;
        char d = 'D';			//for string we use double qouts "" and for char we use single qouts''
        //long double e = 78.898989;		//long double doesnt exist
        //long int f = 456789098;		//long int doesnt exist
        boolean g = true;
        boolean h = false;

        System.out.println("The value of a is : " +a);
        System.out.println("The value of b is : " +b);
        System.out.println("The value of c is : " +c);
        System.out.println("The value of d is : " +d);
//		System.out.println("The value of e is : " +e);
//		System.out.println("The value of f is : " +f);
        System.out.println("The value of t is : " +t);
        System.out.println("The value of r is : " +r);
        System.out.println("The value of w is : " +w);
        System.out.println("The value of g is : " +g);
        System.out.println("The value of h is : " +h);

//        System.out.println("Hello " +a);
//        System.out.println("The value of b is : " b);
//        System.out.println("The value of c is : " c);
//        System.out.println("The value of d is : " d);
//        System.out.println("The value of e is : " +e);
//        System.out.println("The value of f is : " +f);
//        System.out.println("The value of t is : " t);
//        System.out.println("The value of r is : " r);
//        System.out.println("The value of w is : " w);
//        System.out.println("The value of g is : " g);
//        System.out.println("The value of h is : " h);
    }

}
