package ChainOfResponsibility;

import Facade.Convertor;

public class Client {
    public static void main(String[] args) {
        AuthenticationHandler auth  = new AuthenticationHandler("123445");
        ContentTypeHeader typeHeader = new ContentTypeHeader("json");
        PayloadHandeler payloadHandeler = new PayloadHandeler("Body: {\"username\"=\"john\"}");

        auth.next = typeHeader;
        typeHeader.next = payloadHandeler;
        String withAuth = auth.addHandler("Header with authentication");
        System.out.println(withAuth);

        System.out.println();
        String withoutAuth = typeHeader.addHandler("Header without authentication");
        System.out.println(withoutAuth);
    }
}
