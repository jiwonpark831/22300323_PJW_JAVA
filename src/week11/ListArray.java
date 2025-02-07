package week11;

public class ListArray<T> {
    // 필드 선언
    T[] a_array;

    // 생성자
    public ListArray() {
        a_array = (T[]) new Object[0];
    }

    // 리스트에 추가하기
    public void add(T o) {
        Object[] new_array = new Object[a_array.length + 1];
        for (int i = 0; i < a_array.length; i++) {
            new_array[i] = a_array[i];
        }
        /*
         * 위의 반복문과 같은 기능!
         * System.arraycopy(a_array, 0, new_array, 0, a_array.length);
         */
        new_array[a_array.length] = o;
        a_array = (T[]) new_array;
    }

    // 리스트에 있는 번호인지 확인하는 메서드
    public boolean ableToAccess(int i) {
        boolean returnValue = false;
        if (i < a_array.length && i >= 0) {
            returnValue = true;
        }
        return returnValue;
    }

    // 리스트에 있는 정보 하나 가져오기
    public Object get(int i) {
        Object returnValue = null;
        if (ableToAccess(i)) {
            returnValue = a_array[i];
        }
        return returnValue;
    }

    // 리스트에 있는 정보 하나 지우기
    public void remove(int each) {
        if (ableToAccess(each)) {
            Object[] new_array = new Object[a_array.length - 1];
            for (int i = 0; i < each; i++) {
                new_array[i] = a_array[i];
            }
            for (int i = each + 1; i < a_array.length; i++) {
                new_array[i - 1] = a_array[i];
            }
            a_array = (T[]) new_array;
        }
    }

    public void remove() {
        remove(a_array.length - 1);
    }

    public void printListArray() {
        System.out.println("length : " + a_array.length);
        for (int i = 0; i < a_array.length; i++) {
            System.out.println(i + " : " + a_array[i]);
        }
    }
}