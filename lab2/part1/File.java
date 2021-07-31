public class File{
    public static void main(String[] args){
        String str = "the language Java the language is names after the island Java";
        String[] array = str.split(" ");
        int length = array.length;
        for(int i = length-1;i>=0;i--)
            System.out.print(array[i] + " ");
    }   
}