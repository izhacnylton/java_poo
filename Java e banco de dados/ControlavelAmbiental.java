// Declaração da interface que estabelece o contrato para controle ambiental dos veículos
public interface ControlavelAmbiental {
    // Declara o método abstrato para realização da vistoria de gases poluentes
    void realizarVistoriaGases();
    // Declara o método abstrato para emissão do laudo de segurança ambiental
    boolean emitirLaudoSeguranca();
}