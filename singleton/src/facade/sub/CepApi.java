package facade.sub;

public class CepApi {
    private static CepApi inCepApi = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getApi(){
        return inCepApi;
    }

    public String recuperarCidade(String cep){
        return "Orizona";
    }
    
    public String recuperarEstado(String cep){
        return "Goiás";
    }
}
