import java.util.Scanner;
public class lab4_1 {
    static int X,Y,Z;
    static void set(int val ,int idxX,int idxY,int idxZ,int []arr){
        int index=idxX*(Y*Z)+idxY*Z+idxZ;
        arr[index]=val;
    }
    static void get(int idxX,int idxY,int idxZ,int []arr){
        int index=idxX*(Y*Z)+idxY*Z+idxZ;
        System.out.println("The value at index "+idxX+" "+ idxY +" "+idxZ+" is:"+arr[index]);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of X ,Y and Z :");
        X =sc.nextInt();
        Y =sc.nextInt();
        Z =sc.nextInt();

        int[] arr = new int[X * Y * Z];

        int val,x,y,z;
        System.out.println("enter the value and index (X,Y,Z) :");
        val=sc.nextInt();
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        set(val,x,y,z,arr);

        get(x,y,z,arr);

        sc.close();



    }
}
