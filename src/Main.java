//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Studente studente = new Studente("Mario", "Rossi", 12345);
        System.out.println("Studente: " + studente.getNome() + " " + studente.getCognome() + ", ID: " + studente.getIdentificativo());
    }
}