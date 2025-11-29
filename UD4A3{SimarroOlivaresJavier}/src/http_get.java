import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class http_get { public static void main(String[] args) throws Exception {
HttpClient cliente = HttpClient.newHttpClient();
HttpRequest peticion = HttpRequest.newBuilder()
.uri(URI.create("https://www.example.com"))
//.uri(URI.create("https://jsonplaceholder.typicode.com/todo"))
.GET()
.build();
HttpResponse<String> respuesta = cliente.send(peticion,
HttpResponse.BodyHandlers.ofString());
System.out.println("\nCabeceras:");
respuesta.headers().map().forEach((clave, valores) -> {
System.out.println(clave + ": " + valores);
});
System.out.println("---------------------------------");
System.out.println("\nDatos recibidos:");
System.out.println(respuesta.body());
System.out.println("---------------------------------");
System.out.println("\nDatos recibidos formateados:");
String html = respuesta.body();
String htmlConSaltos = html.replace("><", ">\n<");
System.out.println(htmlConSaltos);
System.out.println("---------------------------------");
System.out.println("Código respuesta: " + respuesta.statusCode());
System.out.println("Versión HTTP: "+ respuesta.version());
System.out.println("Request HTTP: "+ respuesta.request());
System.out.println("SSL session: "+ respuesta.sslSession());
System.out.println("---------------------------------");
}}