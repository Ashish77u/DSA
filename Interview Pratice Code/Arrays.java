public class Arrays{


    // Arrays(){
    //     System.out.println("constructor called");
    // }


    Arrays(int[] arr){
        System.out.println("constructor called" + arr.length);
    }

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6};

        for(int i = 0 ; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        final int j;
        j = 10;
        // j = 20; 
        System.out.println(j);



        // =================== swap

        Integer l = new Integer(10);
        Integer m = new Integer(20);

        swap(l,m);
        System.out.println(l);
        System.out.println(m);

         //   ================================

        char array[] = {'a', 'b', ' ', 'c', 'd', ';', 'e', 'f', ' ', 
                        'g', 'h', ';', 'i', 'j', ' ', 'k', 'l'};
        String str = new String(array);

        Arrays obj = new Arrays();
        obj.(str);



    }

    public static void swap(Integer i, Integer j) {
      Integer temp = new Integer(i);
      i = j;
      j = temp;

      System.out.println("i = " + i);
      System.out.println("j = " + j);

    }

   public void demo(String str)
    {
        String[] arr = str.split(";");
        for (String s : arr)
        {
            System.out.println(s);
        }
    }

   

}