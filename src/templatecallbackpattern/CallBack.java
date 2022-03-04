package templatecallbackpattern;

@FunctionalInterface
public interface CallBack<T> {
    public T call();
}
