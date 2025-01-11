public class Generic<T extends Animal,K extends Number> {

    T someanimalvariable;
    K somenumbervariable;

    public Generic(T somevariable) {
        this.someanimalvariable = somevariable;
    }

    public T getSomeanimalvariable() {
        return someanimalvariable;
    }
}
