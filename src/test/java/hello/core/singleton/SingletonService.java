package hello.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService(); // 자기자신의 private static 생성자

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {

    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
