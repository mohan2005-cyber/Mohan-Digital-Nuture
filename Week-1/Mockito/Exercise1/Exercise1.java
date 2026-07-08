package Mockito.Exercise1;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class Exercise1 {
    @Test
    public void mockito() {
        MyExternalApi api = Mockito.mock(MyExternalApi.class);
        //Arrange
        when(api.getData()).thenReturn("mockito");
        MyService service = new MyService(api);
        //Act
        String result = service.getData();
        //Assert
        assertEquals("mockito", result);
    }
}