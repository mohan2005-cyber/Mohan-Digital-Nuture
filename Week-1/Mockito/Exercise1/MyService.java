package Mockito.Exercise1;

public class MyService {

    private MyExternalApi Api;

    MyService(MyExternalApi Api) {
        this.Api = Api;
    }

    public String getData() {
        return Api.getData();
    }
}
