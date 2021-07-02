package teste.angular.domain.enums;

public enum Operadoras {

    oi(0, "OI"),
    vivo(1, "VIVO"),
    tim(2, "TIM"),
    gvt(3 ,"GVT"),
    embratel(4, "EMBRATEL");


    private Integer cod;
    private String descricao;

    Operadoras(Integer cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;

    }
    public static Operadoras toEnum(Integer cod){
        if(cod == null){
            return null;
        }
        for (Operadoras x :Operadoras.values()){
            if(cod.equals(x.getCod())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Invalido: "+cod);
    }
}
