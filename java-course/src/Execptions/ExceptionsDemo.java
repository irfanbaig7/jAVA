package Execptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsDemo {

    static void main(String[] args) {

//      **  exception problem
//        System.out.println("top");
//        int res = 10 / 0;
//        System.out.println("bottom");

//     **   solution
//        if u fill like that this will be gen exception then u can put them into try part. ex. api connection, divide by 0 or more like that

//        System.out.println("top");
//        try{
//            int res = 10 / 0;
//            System.out.println("Done");
//        }catch(Exception e){
//            System.out.println("Exception catch Here");
//            System.out.println("kya hai hai isme : " + e); // exact location of error or meaning of error
//        }
//        System.out.println("bottom");


//       ** example: 2
//        this is unChecked exeption bcz compiler not force to handle them ex: runtimeExecption


//        int[] arr = { 10, 20, 40 };
//
//        try{
//            System.out.println(arr[5]);
//        }catch (Exception e){
//            System.out.println("Exception found ");
//        }
//        System.out.println("Out side of try-catch");


//       ** Check & un-check exceptions
//        compiler force to handle this exception thats called check
//        try {
//            FileReader fileReader = new FileReader("abc.txt");
//        } catch (FileNotFoundException e) {
//            System.out.println("Force to Handle this exception");
//        }


//        ** try with multiple cathc an finally
//
//        int[] arr = { 10, 20, 40 };
//        try{
//            System.out.println(arr[2]);
//        }catch (IndexOutOfBoundsException e){
//            System.out.println("Exception : index out of bound ");
//        } catch (Exception e){
//            System.out.println("Exception");
//        } finally { // fi we want colse the data base connection then this was perfect
////            Always Excutes
//            System.out.println("Finally");
//        }
//        System.out.println("Out-side try-catch");


//        ** throw & throws keyWord


    }


}
