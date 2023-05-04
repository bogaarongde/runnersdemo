package hu.gde.runnersdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RunnerController {

    @Autowired
    private LapTimeRepository lapTimeRepository;
    private RunnerRepository runnerRepository;
    @Autowired
    public RunnerController(RunnerRepository runnerRepository, LapTimeRepository lapTimeRepository) {
        this.runnerRepository = runnerRepository;
        this.lapTimeRepository = lapTimeRepository;
    }

    @GetMapping("/runner")
    RunnerEntity getRunner(@RequestParam (value= "searchString", defaultValue = "") String searchString){
        RunnerEntity runnerEntity = new RunnerEntity();

        runnerEntity.setRunnerId(1);
        runnerEntity.setRunnerName("Tomi");
        runnerEntity.setAveragePace(310);


        LapTimeEntity laptime1 = new LapTimeEntity();
        laptime1.setLapNumber(1);
        laptime1.setTimeSeconds(120);
        laptime1.setRunner(runnerEntity);

        LapTimeEntity laptime2 = new LapTimeEntity();
        laptime2.setLapNumber(2);
        laptime2.setTimeSeconds(110);
        laptime2.setRunner(runnerEntity);
        runnerEntity.getLaptimes().add(laptime1);
        runnerEntity.getLaptimes().add(laptime2);

        runnerRepository.save(runnerEntity);

        return runnerEntity;
    }

}
