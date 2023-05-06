package log;

import java.util.List;


public class Log {

    List<String> informacoes;

    public Log(List<String> informacoes) {
        this.informacoes = informacoes;
    }

    public void registro(String status){
        informacoes.add(status);
    }

    public List<String> getInformacoes() {
        return informacoes;
    }

    public void setInformacoes(List<String> informacoes) {
        this.informacoes = informacoes;
    }

    @Override
    public String toString() {
        return "Log [informacoes=" + informacoes + "]";
    }

    
}