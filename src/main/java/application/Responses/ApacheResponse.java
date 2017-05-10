package application.Responses;

/**
 * Created by sanyam on 11/5/17.
 */
public class ApacheResponse {

    private long id;
    private String content;

    public ApacheResponse(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public ApacheResponse(){};

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
