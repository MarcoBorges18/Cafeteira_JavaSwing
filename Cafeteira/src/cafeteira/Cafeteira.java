package cafeteira;

import java.time.LocalTime;


public class Cafeteira {
    
    private int quantidadeAgua;
    private int quantidadeCafe;
    private Status status = Status.DESLIGADA;
    
    public Cafeteira(int quantidadeAgua, int quantidadeCafe, Status status) {
        this.quantidadeAgua = quantidadeAgua;
        this.quantidadeCafe = quantidadeCafe;
        this.status = status;
    }

    
    public Cafeteira() {
    }


    public void ligar(){
        this.status = Status.PRONTO;
        System.out.println("A quantidade de café é: "+this.quantidadeCafe);
        System.out.println("A quantidade de agua é: "+this.quantidadeAgua);
    }

    public void desligar(){
        this.status = Status.DESLIGADA;
    }

    public void encherCafe(int quantidade){
        if(quantidade > 0 ){
            this.quantidadeCafe += quantidade;
        }else{
            System.out.println("Quantidade invalida");
        }
    }

    public void encherAgua(int quantidade){
        if(quantidade > 0 ){
            this.quantidadeAgua += quantidade;
        }else{
            System.out.println("Quantidade invalida");
        }
    }

    public void status(){
        System.out.println("Sua cafeteira esta: "+this.status);
        System.out.println("A quantidade de agua é: "+this.quantidadeAgua);
        System.out.println("A quantidade de café é: "+this.quantidadeCafe);
        if(this.quantidadeAgua/30 > this.quantidadeCafe/7){
            System.out.println("Você consegue fazer: "+ (int)(this.quantidadeCafe/7) +" xicaras");
        }else{
            System.out.println("Você consegue fazer: "+ (int)(this.quantidadeAgua/30) +" xicaras");
        }
    }

    public String toLog(){
        if(this.quantidadeAgua/30 > this.quantidadeCafe/7){
            return "Status: "+ this.status+"\n"+
            "Quantidade de Cafe: "+ this.quantidadeCafe+"\n"+
            "Quantidade de Agua: "+ this.quantidadeAgua+"\n"+
            "Xicaras: "+ (int)(this.quantidadeCafe/7)+"\n"+
            "Data: "+ LocalTime.now();
        }else{
            return "Status: "+ this.status+"\n"+
            "Quantidade de Cafe: "+ this.quantidadeCafe+"\n"+
            "Quantidade de Agua: "+ this.quantidadeAgua+"\n"+
            "Xicaras: "+ (int)(this.quantidadeCafe/30)+"\n"+
            "Data: "+ LocalTime.now();
        }
        
    }

    public void fazerCafe(int quantidadeXicaras){
        if(this.status == Status.PRONTO && this.quantidadeCafe >= quantidadeXicaras*7 && this.quantidadeAgua >= quantidadeXicaras*30){
            this.quantidadeAgua -= quantidadeXicaras*30;
            this.quantidadeCafe -= quantidadeXicaras*7;
            System.out.println(("HMMMM!!! Café prontinhoooo"));
        }else{
            System.out.println("Verifique o status da cafereira");
        }

    }

    public int getQuantidadeAgua() {
        return quantidadeAgua;
    }

    public void setQuantidadeAgua(int quantidadeAgua) {
        this.quantidadeAgua = quantidadeAgua;
    }

    public int getQuantidadeCafe() {
        return quantidadeCafe;
    }

    public void setQuantidadeCafe(int quantidadeCafe) {
        this.quantidadeCafe = quantidadeCafe;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Cafeteira [quantidadeAgua=" + quantidadeAgua + ", quantidadeCafe=" + quantidadeCafe + ", status="
                + status + "]";
    }

    
}