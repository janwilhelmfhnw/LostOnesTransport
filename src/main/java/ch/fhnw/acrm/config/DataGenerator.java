package ch.fhnw.acrm.config;

import ch.fhnw.acrm.business.service.AgentService;
import ch.fhnw.acrm.data.domain.Agent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;


@Configuration
public class DataGenerator {

    @Autowired
    private AgentService agentService;

    @PostConstruct
    private void init() throws Exception {
        demoUser();
    }

    private void demoUser() throws Exception {
        Agent agentUser = new Agent();
        agentUser.setEmail("user@u");
        agentUser.setPassword("pas");
        agentUser.setName("user");
        agentService.saveAgent(agentUser);
    }
}
