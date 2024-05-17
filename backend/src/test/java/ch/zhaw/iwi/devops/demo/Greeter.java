package ch.zhaw.iwi.devops.demo;

public class Greeter {

        // Methode zum Ausgeben einer Begrüßung
        public void greet() {
            System.out.println("Hallo, willkommen bei DevOps, Meike!");
        }
    
        // Hauptmethode, die beim Start der Anwendung ausgeführt wird
        public static void main(String[] args) {
            Greeter greeter = new Greeter();  // Erzeugt ein Objekt der Klasse Greeter
            greeter.greet();  // Ruft die greet-Methode auf
    }
     
}
