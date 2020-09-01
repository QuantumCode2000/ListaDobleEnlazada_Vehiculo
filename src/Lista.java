public class Lista {
    Nodo primero;   // Campo

    public Lista() { // Constructor por defecto
        primero = null;
    }

    public void inicializar()  // Inicializar como lista vacía
    {
        primero = null;
    }

    public boolean listaVacia()  // Verificar si la lista está vacía
    {
        return primero == null;
    }

    public void insertar(Vehiculo x)   // insertar un nodo al principio
    {
        Nodo nuevo = new Nodo(x);   // Crear el nuevo nodo
        // Conectar el nuevo nodo a la lista
        nuevo.sig = primero;
        if (!listaVacia()) {
            primero.ant = nuevo;
        } //
        primero = nuevo;
    }

    public void eliminar() {
        if (!listaVacia()) { // Lista no vacía
            primero = primero.sig;
            if (!listaVacia()) {
                primero.ant = null;
            }
        }
    }

    // Insertar un nodo en una posición distinta de la primera
    // pos dirección nodo inmediato anterior
    public void insertar2(Nodo pos, Vehiculo x) {  // Crear el nuevo nodo
        Nodo nuevo=new Nodo(x);
        // Conectar el nuevo nodo a la lista
        nuevo.ant=pos;
        nuevo.sig=pos.sig;
        if(pos.sig!=null)  { // El nuevo nodo no será el último
            pos.sig.ant=nuevo;}
        pos.sig=nuevo;
    }

    // Eliminar un nodo distinto del primero
    // pos es la dirección del nodo a eliminar
    public void eliminar2(Nodo pos) {
        Nodo a=pos.ant; // a =dirección del nodo anterior al que se elimina
        Nodo s=pos.sig;  // s =dirección del nodo siguiente al que se elimina
        a.sig=s;
        if(s!=null) {
            s.ant=a; // Si el nuevo nodo no es el último
        }
    }

}
