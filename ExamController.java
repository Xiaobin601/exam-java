import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ExamController {

    @GetMapping("/status")
    public void getStatus() {
    }

    @PostMapping("/run")
    public void run() {
    }
}
