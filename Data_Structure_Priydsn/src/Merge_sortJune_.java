import java.util.Arrays;

public class Merge_sortJune_ {
    public  static  int[] merge(int left[],int[] right){
        int[] merge=new int[left.length+ right.length];
        int i=0,j=0,k=0;
        while (i< left.length && j< right.length)
        {
            if (left[i]<right[j]) {
                merge[k++] = left[i++];

            }
            else
                merge[k++]=right[j++];
        }
        while (i< left.length)
            merge[k++] = left[i++];
        while (j<right.length)
            merge[k++]=right[j++];

        return  merge;
    }

    public static void main(String[] args) {
        int[] i={1,6,15,17};
        int[] j={4,12,62};
        int[] m={i.length+ j.length};
        System.out.println(Arrays.toString(merge(i,j)));
    }
}
