package Mockito.Exercise2;

import Mockito.Exercise1.MyExternalApi;
import Mockito.Exercise1.MyService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class Exercise2 {

    private static MyExternalApi api;
    private static MyService service;

    @BeforeEach
    void setUp() {
        api = Mockito.mock(MyExternalApi.class);
        service = new MyService(api);
        when(api.getData()).thenReturn("mockito");
    }

    @Test
    public void TestInteraction() {
        String result = service.getData();
        Assertions.assertEquals("mockito", result);
        verify(api).getData();
    }

    @Test
    public void call2Times() {
        service.getData();
        service.getData();
        verify(api, times(2)).getData();
    }
}