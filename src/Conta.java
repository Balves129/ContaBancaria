
public class Conta {
    //Classe conta possui 3 variaveis de instancia
    int numero;  //numero da conta
    double saldo;
//classe Cliente => que tem uma variavel cliente => que recebe meu objeto Cliente
    Cliente cliente;
    
    //Construtor
    public Conta(double saldo, int numero, Cliente cliente){
        this.saldo=saldo;
        this.numero = numero;
        this.cliente = cliente;
    }
}
   
