public class Main {

    public static void main(String[] args) {
        int nums[] = new int [4];

        try {
            System.out.println("Start");
            nums[3] = 10;
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Error!!!");
        } catch (ArithmeticException exc) {
            System.out.println(exc);
        }


    }
//ArrayStoreException // ������������� ���
//ClassCastException // ������������ ���
//    IllegalAccessError // ������������ ������� ��� ������ ������
//NegativeArraySizeException // ������������� ������
//    NullPointerException // ������ �� ������
//    TypeNotPresentException // ����������� ��� �����
//    UnsupportedOperationException //
//CassNotFoundException
//InstantiationException






}

