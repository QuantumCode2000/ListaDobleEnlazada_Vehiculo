public class Principal {
    public static void main(String[] args) {

        Operaciones op=new Operaciones();
        Lista lis=new Lista();

        op.insertarN(lis);

        System.out.println("----------------------------------------------------------------------------------------");

        op.mostrar(lis);

        System.out.println("----------------------------------------------------------------------------------------");


        String marcaDada;
        System.out.println("Dame la marca para mostrarte la lista de las placas de los vehiculos que pertencen a esas marca");
        marcaDada = Leer.dato();
        op.placaMarca(lis, marcaDada);

        System.out.println("----------------------------------------------------------------------------------------");

        int a = op.botarMenor(lis);
        op.porModeloMasAntiguo(lis, a);

        System.out.println("----------------------------------------------------------------------------------------");




    }
}
