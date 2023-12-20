import facade.Facade;
import singleton.App;
import singleton.AppHolder;
import strategy.Comportamento;
import strategy.ComportamentoAgressivo;
import strategy.ComportamentoNormal;
import strategy.Robo;

public class Program {
    public static void main(String[] args) {
        App app = App.getApp();
        System.out.println(app);

        AppHolder appHolder = AppHolder.getAppHolder();
        System.out.println(appHolder);

        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();

        Facade facade = new Facade();
        facade.migrarCliente("Aly", "77779999");
    }
}
