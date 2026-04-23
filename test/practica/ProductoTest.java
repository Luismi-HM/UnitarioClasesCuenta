package practica;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {

    private Producto producto;

    @BeforeEach
    void setUp() {
        producto = new Producto("Agua", 10, 1000);
        System.out.println("Se vende agua a 10€, vale");
    }

    @AfterEach
    void tearDown() {
        producto = null;
    }

    @BeforeAll
    static void setUpClass() {
        System.out.println("Iniciando test...");
    }

    @AfterAll
    static void tearDownClass() {
        System.out.println("Finalizando test...");
    }

    @Test
    void testConstructor() {
        assertEquals("Agua", producto.getNombre());
        assertEquals(1000, producto.getUnidades());
        assertEquals(10, producto.getPrecio());
    }

    @Test
    void setNombre() {
        producto.setNombre("Agua");
        assertEquals("Agua", producto.getNombre());

        producto.setNombre(null);
        assertEquals("Agua", producto.getNombre());

        producto.setNombre("");
        assertEquals("Agua", producto.getNombre());
    }

    @Test
    void setPrecio() {
        producto.setPrecio(10);
        assertEquals(10, producto.getPrecio());

        producto.setPrecio(-10);
        assertEquals(10, producto.getPrecio());

        producto.setPrecio(0);
        assertEquals(0, producto.getPrecio());
    }

    @Test
    void setUnidades() {
        producto.setUnidades(100);
        assertEquals(100, producto.getUnidades());

        producto.setUnidades(-100);
        assertEquals(100, producto.getUnidades());

        producto.setUnidades(0);
        assertEquals(0, producto.getUnidades());
    }
}