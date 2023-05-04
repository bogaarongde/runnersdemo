package hu.gde.runnersdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RunnerController {

    private RunnerRepository repository;
    @Autowired
    public RunnerController(RunnerRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/runner")
    Runner getRunner(@RequestParam (value= "searchString", defaultValue = "") String searchString){
        return new Runner(3, "Tomi",  320);
    }

}
