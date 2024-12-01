//package aa;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//
//public class TT1Test {
//
//    @Mock
//    private TT2 tt2mock;
//
//    @InjectMocks
//    private TT1 tt1;
//
//    @BeforeEach
//    void setUp() {
//        tt2mock = mock(TT2.class);
//        tt1 = new TT1(tt2mock);
//
//        // Mock 객체 초기화
//        when(tt2mock.getA()).thenReturn(1);
//    }
//
//    @Test
//    void a() {
//        assertEquals(1, tt1.getnum());
//    }
//
//
//}
