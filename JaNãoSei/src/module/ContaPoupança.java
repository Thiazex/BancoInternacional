package module;

public class ContaPoupança extends ContaBancaria{

    public ContaPoupança(Double valorEmConta){
        super(valorEmConta);
    }

    public void render(){
        this.setValorEmConta(this.getValorEmConta()*0.02);
    }
}
