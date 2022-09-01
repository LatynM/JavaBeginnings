public class Main
{

    public static void main(String[] args) {

        CuentaCorriente Cuenta1 = new CuentaCorriente("Tobias", 5000);
        CuentaCorriente Cuenta2 = new CuentaCorriente("Lucia", 5000);

        System.out.println("SALDO DE AMBAS CUENTAS:");
        System.out.println(Cuenta1.getSaldo());
        System.out.println(Cuenta2.getSaldo());

        CuentaCorriente.Transferencia(Cuenta1, Cuenta2, 2500);

        System.out.println("SALDO DE AMBAS CUENTAS LUEGO DE TRANSFERIR:");
        System.out.println(Cuenta1.getSaldo());
        System.out.println(Cuenta2.getSaldo());
    }
}
