package org.future.lkapp.wbproblem;

// @SpringBootApplication
// public class WbInterviewApplication {

//     public static void main(String[] args) {
//         SpringApplication.run(WbInterviewApplication.class, args);
//     }

// }
// Надо написать запрос который выберет имена сотрудников, которые знают SQL и
// ещё хотя бы один любой язык. Считать,
// что один сотрудник — одно имя. таблица employee

// | name   |  lang   |
// ——————————-—————————-
// | Nick    | C#      |
// | Nick    | SQL     |
// | Eva     | Rust    |
// | Vika    | SQL     |
// | Ivan    | Java   |
// | Ivan    | SQL     |

// select n.name from employee n
// join employee m on n.name = m.name and m.lang <> 'SQL'
// where n.lang='SQL'

// select distinct empl1.name from employee empl1
// join employee empl2 on empl2.name = empl1.name
// where empl1.lang = 'SQL' and empl2.lang <> 'SQL';

// select e.name from employee e
// group by e.name
// having count(lang)>1


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.util.Map;

public class InterviewService {
    // Реализовать бины и заинжектить в конструктор через @Autowired
    private final ScoreRepository scoreRepository;
    private final TransactionTemplate transactionTemplate;
    private final InterviewScoreMLService interviewScoreMLService;
    private final ObjectMapper objectMapper = new ObjectMapper();

    public InterviewService(ScoreRepository scoreRepository,
            TransactionTemplate transactionTemplate,
            InterviewScoreMLService interviewScoreMLService) {
        this.scoreRepository = scoreRepository;
        this.transactionTemplate = transactionTemplate;
        this.interviewScoreMLService = interviewScoreMLService;
    }

    /**
     *      * Метод считает сколько очков заработал кандидат,
     *      * сохраняет результат в базу и кидает callback об этом во внешний сервис
     *   
     **/

    // Распилить метод на три отдельных метода, где будет отдельно:

    // 1. Метод, который вычисляет очки;
    // 2. Метод, который отправялет запрос;
    // 3. Метод, который сохраняет в БД результат;
    // 4. Обернуть try-catch в методе process и поменять порядок выполнения request
    // и записи в БД.
    // 5. Запрос и вычисления надо делать вне рамок транзакции;

    public void process(Candidate c) {
        // transactionTemplate.executeWithoutResult(status -> {

            Score s = interviewScoreMLService.compute(c);

            String body = null;
            try {
                body = objectMapper.writeValueAsString(Map.of(c.getName(), s));
            } catch (JsonProcessingException e) {

                e.printStackTrace();
            }

            // Mono<ResponseEntity<Void>> request = WebClient.create()
        //             .post()
        //             .body(BodyInserters.fromValue(body))
        //             .retrieve()
        //             .toBodilessEntity();

        //     scoreRepository.saveScore(s);
        // });
    }
}
