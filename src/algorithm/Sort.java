package algorithm;

import java.util.List;

public class Sort {

    /**
     * 冒泡排序（正序）
     * @param source
     */
    public void bubbleSort(List<Integer> source ) {
        for(int i=source.size()-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(source.get(j)>source.get(j+1)){
                    int temp=source.get(j);
                    source.set(j,source.get(j+1));
                    source.set(j+1,temp);
                }
            }
        }
    }

    /**
     * 冒泡排序（正序）
     * @param source
     */
    public void bubbleSort(int[] source ) {
        for(int i=source.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(source[j]>source[j+1]){
                    int temp=source[j];
                    source[j]=source[j+1];
                    source[j+1]=temp;
                }
            }
        }
    }



}
