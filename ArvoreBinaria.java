public class ArvoreBinaria<T> {
    
    private T raiz;

    public ArvoreBinaria(){
        this.raiz = null;
    }

    public void setRaiz(NoArvoreBinaria<T> raiz){
        this.raiz = (T) raiz;
    }

    public T getRaiz(){
        return raiz;
    }

    public boolean estaVazia(){
        if (this.raiz == null){
            return true;
        }

        return false;
    }

    public boolean pertence(T info){
        return pertence((NoArvoreBinaria<T>) raiz, info);    
    }

    private boolean pertence(NoArvoreBinaria<T> no, T info){
        if(no == null){
            return false;
        }else{
            return(no.getInfo().equals(info)) ||
            pertence(no.getEsquerda(), info) ||
            pertence(no.getDireita(), info);
        }
    }

    public String toString(){
        return "pendente";
    }

    public int contarNos(){
        return contarNos((NoArvoreBinaria<T>) getRaiz());
    }

    private int contarNos(NoArvoreBinaria<T> no){
        if (no == null) {
            return 0;
        }else{
            return 1 + contarNos(no.getEsquerda()) + contarNos(no.getDireita());
        }
    }
}
