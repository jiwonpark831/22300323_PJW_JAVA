package week11;

public class ListArrayObject {
    Object[] aArray = null;

    public ListArrayObject() {
        aArray = new Object[0];
    }

    public void add(Object o) {
        Object[] newArray = new Object[aArray.length + 1];
        // 0 1 2 3 4 5
        // 0 1 2 3 4 5 6
        for (int i = 0; i < aArray.length; i++) {
            newArray[i] = aArray[i];
        }
        newArray[aArray.length] = o;
        aArray = newArray;
    }

    public boolean isIndexOk(int index) {
        if (index > 0 && index < aArray.length) {
            return true;
        } else {
            return false;
        }
    }

    public Object get(int index) {
        if (isIndexOk(index)) {
            return aArray[index];
        } else {
            return null;
        }
    }

    public void remove(int index) {
        if (isIndexOk(index)) {
            // 0 1 2 3 4 5
            // 0 1 2 3 4 5 6
            // 0 1 3 4 5 6
            Object[] newArray = new Object[aArray.length - 1];
            // 0 1 2 3 4 5
            // 0 1 2 3 4 5 6
            for (int i = 0; i < aArray.length; i++) {
                if (i < index) {
                    /*
                     * 0 ----- 0
                     * 1 ----- 1
                     * 2 ----- 2
                     */

                    newArray[i] = aArray[i];
                } else if (i == index) {
                } else {
                    /*
                     * 3 ----- 4
                     * 4 ----- 5
                     * 5 ----- 6
                     */
                    newArray[i - 1] = aArray[i];
                }

            }
            aArray = newArray;
        }
    }

    public void remove() {
        remove(aArray.length - 1);
    }

    public int size() {
        return aArray.length;
    }

    public String toString() {
        String returnVal = "";
        for (int i = 0; i < aArray.length; i++) {
            returnVal += aArray[i].toString() + " ";
        }
        return returnVal;
    }
}