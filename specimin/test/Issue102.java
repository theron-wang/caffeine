import javax.annotation.Nullable;

public class Issue102 {
    static class TestAnon {
        TestAnon(Object p) {}
    }
    
    static TestAnon testAnon(@Nullable Object q) {
    return new TestAnon(q) {};
    }
}