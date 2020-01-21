package module;

public abstract class ContaBancaria {

    private Double valorEmConta;

    public ContaBancaria(Double valorEmConta){
        this.valorEmConta = valorEmConta;
    }

    public ContaBancaria(){

    }



    public Double getValorEmConta() {
        return valorEmConta;
    }

    public void setValorEmConta(Double valorEmConta) {
        this.valorEmConta = valorEmConta;
    }


}
