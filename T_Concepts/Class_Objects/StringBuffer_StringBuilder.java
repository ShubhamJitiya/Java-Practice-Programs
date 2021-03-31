//Class String buffer and String builder
package Class_Objects;

public class StringBuffer_StringBuilder {
    public static void main(String[] args) {

        StringBuffer sbf = new StringBuffer("Navin");

        sbf.append("Reddy");
        sbf.replace(0,5,"Manoj");
        sbf.delete(8,10);

        System.out.println(sbf);

    }
}
