package co.clarap.al.allPatternDesign.estructural.proyx.v1;

public class ProxyTester {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        try {
            internet.connectTo("forbidden2.com");
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
    }
}
