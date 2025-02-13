package org.future.lkapp.Solutions.zigzag;

import java.util.HashMap;
import java.util.Map;

/*
*
*
* =====================================================
*  P   A   H   N
*  A P L S I I G
*  Y   I   R
* 
* =====================================================
* [0][1][2][3][4][5][6]
*  P        I        N
*  A     L  S     I  G
*  Y  A     H  R
*  P        I
*
*  PAYPA    numRows 5
*     L     3
*    I      2 
*   S       1
*  HIRIN
*     G
* =====================================================
0    1    2    3    4    5
*  PAYPAL    numRows 6  {'P', 'A', 'Y', 'P', 'A', 'L'}  
*      I     4          {' ', ' ', ' ', ' ', 'I', ' '}
*     S      3          {' ', ' ', ' ', 'S', ' ', ' '}
*    H       2          {' ', ' ', 'H', ' ', ' ', ' '}
*   I        1          {' ', 'I', ' ', ' ', ' ', ' '}
*  RING                 {'R', 'I', 'N', 'G', ' ', ' '}
*
* =====================================================
*  PAYPAL   numrows 2     {'P', 'A'} 
*                         {'Y', 'P'}     
*                         {'A', 'L'}
* =====================================================
*
*                           0    1    2    3 
*  PAYP      numRows 4    {'P', 'A', 'Y', 'P'}      (0)
*    A       2            {' ', ' ', 'A', ' '}      (2)  
*   L        1            {' ', 'L', ' ', ' '}      (1)
*  ISHI                   {'I', 'S', 'H', 'I'}      (0)
*    R                    {' ', ' ', 'R', ' '}      (2)    
*   I                     {' ', 'I', ' ', ' '}      (1)    
*  NG                     {'N', 'G', ' ', ' '}      (0)     1, 2, 3, 4, 5, 6                                                           
* ===============================================================================================
*/
public class ZigZag {
    public String convert(String s, int numRows) {
        Map<Integer, StringBuilder> resultMap = new HashMap<>();
        StringBuilder resultString = new StringBuilder(s.length());

        if (s.length() < numRows || numRows == 1)
            return s;
        int index = 0;
        int factor = 1;
        int indexOfResult = 0;

        while (index < s.length()) {
            if (resultMap.get(indexOfResult) == null) {
                resultMap.put(indexOfResult, new StringBuilder().append(s.charAt(index)));
            } else {
                resultMap.get(indexOfResult).append(s.charAt(index));
            }

            if (indexOfResult == numRows - 1) {
                factor = -1;
            }
            if (indexOfResult == 0)
                factor = 1;
            indexOfResult += factor;
            index++;
        }

        for (StringBuilder value : resultMap.values()) {
            resultString.append(value);
        }
        return resultString.toString();
    }
}
