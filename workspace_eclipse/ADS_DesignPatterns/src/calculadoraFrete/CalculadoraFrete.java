package strategy.frete;

public class CalculadoraFrete{
    //------------------------Antes de refatorar--------------------
    // public double calcularValor(String servico, double pesoEmKg){
    //     //sedex
    //     if(servico.equals("sedex")){
    //         if(pesoEmKg < 10.0){
    //             return 50.00;
    //         }else if(pesoEmKg < 20.0){
    //             return 70.00;
    //         }else{
    //             return 90.00;
    //         }
    //     }
    //     //dhl
    //     if(servico.equals("dhl")){
    //         if(pesoEmKg < 20.0){
    //             return 100.00;
    //         }else{
    //             return 90.00;
    //         }
    //     }
    //     //jadlog
    //     if(servico.equals("jadlog")){
    //         if(pesoEmKg < 30.0){
    //             return 0.00;
    //         }else{
    //             return 150.00;
    //         }
    //     }

    //     throw new RuntimeException("Serviço desconhecido: "+servico);
    // }

    public double calcular(Fretavel fretavel, double pesoEmKg){
        return fretavel.calcularValor(pesoEmKg);
    }
}