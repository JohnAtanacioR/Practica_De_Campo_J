package productos;

public class Productos {
    //Agregamos variables
    private int codigo;
    private double precio;
    private String nombre;
    
    public Productos() {
    	//Añadimos constructor vacío
        codigo = 0000000;
        precio = 0.0;
        nombre = "Empy";
    }
    
    public Productos(int codigo, double precio, String nombre) {
        super();
        //Creamos un super constructor para ingresar el codigo, precio y nombre
        this.codigo = codigo;
        if (precio < 0) {
            System.out.println("Precio incorrecto.");
        } else {
            this.precio = precio;
        }
        this.nombre = nombre;
    }
    // Getters y setters
    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void MostrarDatos() {
        System.out.println("----------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Código: " + codigo);
        System.out.println("----------------------------");
    }
}