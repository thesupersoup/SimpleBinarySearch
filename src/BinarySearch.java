/*
 * Author       : Mitch Gentry (https://github.com/thesupersoup), 2019
 * Description  : A simple BinarySearch class that functions with any
 *                generic type implementing the Comparable interface.
 *                Recursively locates the index of the element (nChk).
 */

class BinarySearch<T extends Comparable> {
    // FindIndex requires a sorted array
    public int FindIndex(T[] nArr, T nChk) {
        return FindIndex(nArr, 0, 0, 0, nChk);
    }

    private int FindIndex(T[] nArr, int nCount, int nIndex, int nBound, T nChk) {
        int i;

        if (nIndex >= 0 && nIndex < nArr.length) {
            if (!nArr[nIndex].equals(nChk)) {
                nCount++;               // Check count
                nBound = nBound / 2;    // New bound

                if (nChk.compareTo(nArr[nIndex]) > 0) {
                    if (nBound != 0)
                        nIndex += nBound;
                    else            // nBound can end up == 0 via integer division
                        nIndex++;

                    i = FindIndex(nArr, nCount, nIndex, nBound, nChk);
                } else {
                    if (nBound != 0)
                        nIndex -= nBound;
                    else            // nBound can end up == 0 via integer division
                        nIndex--;

                    i = FindIndex(nArr, nCount, nIndex, nBound, nChk);
                }
            } else {
                i = nIndex;
            }
        } else {
            System.out.println("Index out of bounds, returning nIndex");
            i = nIndex;
        }

        return i;
    }
}