public class ArrayRange{
    public static int range(int[] array){
        int arrayMin = array[0];
        int arrayMax = array[0];
        for (int i=0; i<array.length; i++){
            if (arrayMin>array[i]) arrayMin=array[i];
            if (arrayMax<array[i]) arrayMax=array[i];
        }
        return arrayMax-arrayMin;
    }
}