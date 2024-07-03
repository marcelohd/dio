package type;

public class IPhone implements IPod, InternetNavigator, Phone{
    private String imei;

    public IPhone (String imei){
        this.imei = imei;
    }

    @Override
    public void play() {
        System.out.println("EXECUTANDO A MUSICA ");
    }

    @Override
    public void pause() {
        System.out.println("PAUDANDO A MUSICA ");
    }

    @Override
    public void selectMusic(String music) {
        System.out.println("SELECIONANDO A MUSICA " + music);
    }

    @Override
    public void showPage(String url) {
        System.out.println("EXIBINDO A PAGINA " + url);
    }

    @Override
    public void addNewTab() {
        System.out.println("ADICIONANDO UMA NOVA PAGINA");
    }

    @Override
    public void refreshPage() {
        System.out.println("ATUALIZANDO PAGINA");
    }

    @Override
    public void call() {
        System.out.println("EFETUANDO CHAMADA");
    }

    @Override
    public void answer() {
        System.out.println("ATENDENDO CHAMADA");
    }

    @Override
    public void voiceMail() {
        System.out.println("INICIANDO CHAMADA DE VOZ");
    }
}
