//PRIMERA PARTE
public class Main {

    public static void main(String[] args) {
        sumar(11,11,11);

        // Crear un nuevo objeto Coche y almacenarlo en la variable miCoche
        Coche miCoche = new Coche("Ford", "Mustang", 1967, 25000.0, 2);

        // Aumentar en uno el número de puertas del coche
        miCoche.incrementarNumPuertas();

        // Imprimir el número de puertas del coche
        System.out.println(miCoche.getNumPuertas()); // Imprime "3"
    }

    // Funcion sumar 3 numeros enteros
    public static int sumar(int a, int b, int c) {
        int resultado = a + b + c;

        System.out.println(resultado);

        return resultado;
    }

//SEGUNDA PARTE
    public class Coche {
        // Atributos de la clase (variables de instancia)
        private String marca;
        private String modelo;
        private int anio;
        private double precio;
        private int numPuertas;

        // Constructor de la clase
        public Coche(String marca, String modelo, int anio, double precio, int numPuertas) {
            this.marca = marca;
            this.modelo = modelo;
            this.anio = anio;
            this.precio = precio;
            this.numPuertas = numPuertas;
        }

        // Métodos de la clase (getters y setters para los atributos)
        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public int getanio() {
            return anio;
        }

        public void setanio(int anio) {
            this.anio = anio;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public int getNumPuertas() {
            return numPuertas;
        }

        public void setNumPuertas(int numPuertas) {
            this.numPuertas = numPuertas;
        }

        // Nueva función para incrementar el número de puertas
        public void incrementarNumPuertas() {
            numPuertas++;
        }
    }

}
