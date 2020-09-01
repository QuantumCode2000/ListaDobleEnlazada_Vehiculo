public class Operaciones {
    // Insertar N nodos
    public void insertarN(Lista L)
    { System.out.println("No. nodos= ");
        int nn=Leer.datoInt();
        for(int i=1;i<=nn;i++) {
            System.out.print("Dato= ");
            Vehiculo d= new Vehiculo();
            d.leer();
            L.insertar(d);
        }
    }


    // MOSTRAR
    public void mostrar(Lista L) {
        Nodo p=L.primero;
        while(p!=null) {
            System.out.println("Dato:  ");
            p.dato.mostrar();
            p=p.sig;
        }
    }
    // Placa de los vehículos de una marca dada
    public void placaMarca(Lista L, String md) {
        if (!L.listaVacia()) {
            Nodo p = L.primero;
            while(p!=null) {
                if(md.compareTo(p.dato.marca)==0)
                    System.out.println("placa="+p.dato.placa);
                p=p.sig;
            }
        }
    }

    // Por MODELO MAS ANTIGUO  mas antiguo
    public int botarMenor(Lista L) {
        Nodo p = L.primero;
        int menor = p.dato.modelo;
        while(p!=null) {
            if( p.dato.modelo < menor)
                menor =  p.dato.modelo;
            p=p.sig;
        }
        return menor;
    }

    public void porModeloMasAntiguo (Lista L, int menor) {
        if (!L.listaVacia()) {
            Nodo p = L.primero;
            while(p!=null) {
                if(p.dato.modelo == menor)
                    System.out.println(" POR ANIO DE INGRESO \n" +
                            " ci ="+p.dato.marca+" nombre = "+p.dato.placa);
                p=p.sig;
            }
        }
    }
}


