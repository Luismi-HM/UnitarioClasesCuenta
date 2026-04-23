package practica;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    private Pedido pedido;
    private Pedido pedidoVacio;
    private Pedido pedidoNulo;
    private Producto prod1,prod2,prod3;

    @BeforeEach
    void setUp() {
        prod1 = new Producto("Caja Misteriosa", 0.75, 25);
        prod2 = new Producto("Galletas", 2.5, 8);
        prod3 = new Producto("Coca Cola", 1, 10);

        Producto[] lista = {prod1, prod2, prod3};

        pedido = new Pedido(1, "Messi", lista);

        pedidoVacio = new Pedido(2, "Pipo", new Producto[0]);
        pedidoNulo = new Pedido(3, "Homer Simpson", null);
    }

    @AfterEach
    void tearDown() {
        pedido = null;
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
        assertEquals(1, pedido.getNumeroPedido());
        assertEquals("Messi", pedido.getCliente());
        Producto[] lista = {prod1, prod2, prod3};
        assertArrayEquals(lista, pedido.getProductos());
        assertEquals(3,pedido.getProductos().length);
        assertFalse(pedido.isUrgente());
    }

    @Test
    void setNumeroPedido() {
    }

    @Test
    void setCliente() {
    }

    @Test
    void setProductos() {
    }

    @Test
    void setUrgente() {
    }

    @Test
    void reiniciarContador() {
    }

    @Test
    void calcularTotal() {
        assertEquals(48.75, pedido.calcularTotal());
        pedido.setUrgente(true);
        assertEquals(48.75, pedido.calcularTotal());
        prod2.setPrecio(30);
        assertEquals(0.75*25+30*8+10+10, pedido.calcularTotal());


    }

    @Test
    void contarProductosValidos() {
    }

    @Test
    void aplicarDescuentoSiCorresponde() {
    }

    @Test
    void generarResumen() {
    }

    @Test
    void contieneProducto() {
    }

    @Test
    void eliminarProductosSinStock() {
    }
}