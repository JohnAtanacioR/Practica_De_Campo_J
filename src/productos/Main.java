package Productos;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int productosNum;
        System.out.println("¿Cuántos productos desea ingresar?");
        productosNum = sc.nextInt();
        
        Productos[] productos = new Productos[productosNum];
        
        for (int i = 0; i < productosNum; i++) {
            System.out.println("Ingrese el nombre del producto:");
            String nombre = sc.next();
            System.out.println("Ingrese el precio del producto:");
            double precio = sc.nextDouble();
            System.out.println("Ingrese el código del producto:");
            int codigo = sc.nextInt();
            productos[i] = new Productos(codigo, precio, nombre);
        }
        
        prodPrecioAlto(productos);
        OrdenarProductos(productos);
    }
    
    static void prodPrecioAlto(Productos[] prods) {
        Arrays.sort(prods, new Comparator<Productos>() {
            public int compare(Productos a, Productos b) {
                return Double.compare(b.getPrecio(), a.getPrecio());
            }
        });
        System.out.println("El producto con el precio más alto es:");
        prods[0].MostrarDatos();
    }
    
    static void OrdenarProductos(Productos[] prods) {
        System.out.println("Artículos ordenados por precio:");
        Arrays.sort(prods, new Comparator<Productos>() {
            public int compare(Productos a, Productos b) {
                return Double.compare(b.getPrecio(), a.getPrecio());
            }
        });
        
        for (Productos e : prods) {
            e.MostrarDatos();
        }
    }
}