public class ArvoreBinaria<T> {
    
    private T raiz;

    public ArvoreBinaria(){
        this.raiz = null;
    }

    public void setRaiz(NoArvoreBinaria<T> raiz){
        this.raiz = (T) raiz;
    }

    public boolean estaVazia(){
        if (this.raiz == null){
            return true;
        }

        return false;
    }

    public boolean pertence(T info){
        return pertence(raiz, info);
    }
}
