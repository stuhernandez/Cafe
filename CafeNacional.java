public class CafeNacional extends Cafe{ 
    // Constantes 
    private final static boolean TOSTADO = false;
    // Atributos
    private boolean tostado;
    //Constructor 
    public CafeNacional(){ 
        // Código 
        this(PRECIO_BASE, PESO_BASE, CALIDAD_C, TOSTADO);
    } 
    public CafeNacional(Double precioBase, Integer peso){ 
        // Código 
        this(precioBase, peso, CALIDAD_C, TOSTADO);
    }
    public CafeNacional(Double precioBase, Integer peso, char calidadC, boolean tostado){ 
        // Código
        super(precioBase, peso, calidadC);
        this.tostado = tostado;
    } 
    // Métodos 
    public Double calcularPrecio(){ 
        // Código 
        Double adicion = super.calcularPrecio();
        if (tostado == true){
            adicion += 50.0;
        }
        return adicion;
    } 
}