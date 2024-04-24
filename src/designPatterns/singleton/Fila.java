package designPatterns.singleton;

public class Fila {
    private char Documentos[];
    private boolean imprimir;
    private static Fila instancia;

        public char[] getDocumentos() {
            return Documentos;
        }

        public void setDocumentos(char[] documentos) {
            Documentos = documentos;
        }

        public boolean isImprimir() {
        return imprimir;
        }

        public void setImprimir(boolean imprimir) {
        this.imprimir = imprimir;
        }

        private Fila(){
        }

        public static Filaprint getInstance(){
            if(instancia == null){
                instancia = new Fila();
            }
            return instancia;
        }

        public void ImprimeDocumento() {

        }
        public void RemoveDocumento(){

        }
        public void RemoveTodosDocs(){
            
        }
    }
