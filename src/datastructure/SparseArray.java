package datastructure;

/**
 * 稀疏数组 当数组中存在大量0或者相同数值时可用稀疏数组来保存数据，可以极大压缩数据的空间
 *
 * 稀疏数组为一个N+1（N为原数组有效数据个数）行 3列的二维数组
 * 第一行 的三列分别存原数组的行数、列数、有效数据个数，
 * 自第二行开始的每一列分别存原数组的第n个有效数据的 行数、列数、有效数据值
 */
public class SparseArray {

    public static void main(String[] args) {
//        创建一个11*11的棋盘
        int [][] chessArray=new int [11][11];
        chessArray[2][3]=1;
        chessArray[3][4]=2;
        for(int[] row: chessArray){
            for(int data:row){
                System.out.print("\t"+data);
            }
            System.out.println();
        }

//        原二维数组转稀疏数组
//        1.先遍历原二维数组,统计有效数据个数
        int sum=0;
        for(int[] row: chessArray){
            for(int data:row){
               if(data!=0){
                   sum++;
                }
            }
        }
//        2.根据有效数据个数创建稀疏数组，并初始化第一行数据
        int [][] sparseArray=new int[sum+1][3];
        sparseArray[0][0]=chessArray.length;
        sparseArray[0][1]=chessArray[0].length;
        sparseArray[0][2]=sum;
//        3.遍历原数组，将有效数据的 行、列、值分别存入稀疏数组
        int count=1;
        for(int i=0;i<chessArray.length;i++){
            for(int j=0;j<chessArray[i].length;j++){
                if(chessArray[i][j]!=0){
//                    有效数据行号
                    sparseArray[count][0]=i;
//                    有效数据列号
                    sparseArray[count][1]=j;
//                    有效数据值
                    sparseArray[count][2]=chessArray[i][j];
                    count++;
                }
            }
        }

        for(int[] row: sparseArray){
            for(int data:row){
                System.out.print("\t"+data);
            }
            System.out.println();
        }

//        稀疏数组还原成二维数组
//        1.读取稀疏数组第一行，创建二维数组
        int[][]chessArray2=new int[sparseArray[0][0]] [sparseArray[0][1]];
//        2.遍历稀疏数组 将稀疏数组中的数据还原成原数组对应的行、列、值
        for(int i=1;i<=sparseArray[0][2];i++){
            chessArray2[sparseArray[i][0]][sparseArray[i][1]]=sparseArray[i][2];
        }

        for(int[] row: chessArray2){
            for(int data:row){
                System.out.print("\t"+data);
            }
            System.out.println();
        }

    }
}
