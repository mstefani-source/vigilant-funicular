package lkapp.Solutions.median;

// nums1 = 1,2,3,4,5,6
// nums2 = 3,4,5,6,7,8,9
//            x     x
// nums1: 1.2.3.4.5.6
// nums2:     3,4,5,6,7,8,9
//                x

// 1,2,3
// 1,2,5,6

// 1,1,2,2,3,5,6  = 2
// 1.2.3.5.6 =3


//        1,2,3,3,4,4,5,5,6,6,7,8,9
                        
// 1,1,1,2,3,5,7
//         3,4,6,8,9
//
// 1,1,1,2,3,3,4,5,6,7,8,9                             
//
// 1,1,1,2,3,3,3,4,4,5,5,6,6,7,8,9
//              v   

// 1.2.3.4.5.6.7.8.9
//         x

// int[] nums1 = {1,2,3,4,5,6};
// int[] nums2 = {3,4,5,6,7,8,9};

public class Median {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0;
        String s = "ababs";

        char i = s.charAt(0);

        int len1 = nums1.length;
        int len2 = nums2.length;
        int startIndex = 0;
        int finishIndex = 0;

        // узнаём где начинается второй массив относительно первого
        if (nums2[0] < nums1[len1]) {                    // второй массив начинается где-то в середине первого
            startIndex = findIndex(nums2[0], nums1);     // находим в первом массиве индекс элемента с которого начинается второй массив
            int mergedIndexes = startIndex + len2;       // типа тут мы должны получить общую длину смерженого массива
        }


        System.out.println(len1);
        System.out.println(len2);

        return result;
    }

    private int findIndex(int value, int[] arr) {
        int index = 0;
        int len = arr.length;
        while (value != arr[index]) {
            if (value > arr[index]) {

            }
        }
        return index;
    }

}
