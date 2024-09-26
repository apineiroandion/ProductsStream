import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String file = "/home/dam/Documentos/producto.txt";
        Product product = new Product("cod1", "parafusos", 3.0);
        saveProduct(product, file);
        Product product2 = new Product("cod2", "cravos", 4.0);
        saveProduct(product2, file);
        Product product3 = new Product("cod3", "tachas", 6.0);
        saveProduct(product3, file);
        Product product4 = new Product("cod4", "grapas", 2.0);
        saveProduct(product4, file);
        List<Product> products = readProducts(file);
        for (Product p : products) {
            System.out.println(p.getCodigo() + " " + p.getDescripcion() + " " + p.getPrecio());
        }
    }

    /**
     * Metodo que guarda un prodcuto en un fichero que recibe como parametro
     * @param product producto a guardar
     * @param file fichero donde se guardara el producto
     * @return true si se ha guardado correctamente, false en caso contrario
     */
    public static boolean saveProduct(Product product, String file) {
        try (
             FileOutputStream fos = new FileOutputStream(file, true);
             BufferedOutputStream bos = new BufferedOutputStream(fos);
             DataOutputStream dos = new DataOutputStream(bos);
            ){
            dos.writeUTF(product.getCodigo());
            dos.writeUTF(product.getDescripcion());
            dos.writeDouble(product.getPrecio());
            System.out.println("Producto guardado correctamente");
            return true;
        } catch (Exception e) {
            System.out.println("Error al guardar el producto");
            return false;
        }
    }
    /**
     * Metodo que lee un producto de un fichero que recibe como parametro y lo mete en un objeto de la clase Product
     * @param file fichero donde se encuentra el producto
     * @return ArrayList con los productos leidos
     */
    public static List<Product> readProducts(String file) {
        List<Product> products = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(file);
             BufferedInputStream bis = new BufferedInputStream(fis);
             DataInputStream dis = new DataInputStream(bis)) {
            while (dis.available() > 0) {
                Product product = new Product();
                product.setCodigo(dis.readUTF());
                product.setDescripcion(dis.readUTF());
                product.setPrecio(dis.readDouble());
                products.add(product);
            }
            System.out.println("Productos leidos correctamente");
        } catch (Exception e) {
            System.out.println("Error al leer los productos");
        }
        return products;
    }
}
