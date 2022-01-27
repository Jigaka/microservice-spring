package academy.digitallab.demo01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data @AllArgsConstructor
@RequiredArgsConstructor
public class Greeting {
    private Long id;
    private String message;

}
