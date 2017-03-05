package com.kgc.test;

import com.kgc.entity.Allgames;
import com.kgc.service.IAllGamesService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by  王帆 on 2017/2/25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml"})
public class TestAny {
    @Autowired
    private IAllGamesService allGamesService;

    public void setAllGamesService(IAllGamesService allGamesService) {

        this.allGamesService = allGamesService;
    }


    @Test
    public void test1() {
        List<Allgames> allGamesList = allGamesService.listAll(Allgames.class);
        for (Allgames games:allGamesList) {
            System.out.println(games.getCname());
        }
    }

    @Test
    public void test2() {
        List<Allgames> allGamesList = allGamesService.listByInitial("A");
        for (Allgames games:allGamesList) {
            System.out.println(games);
        }
    }

    @Test
    public void test3() {
        List<Allgames> allGamesList = allGamesService.listByHot("S");
        System.out.println(allGamesList.toString());
        for (Allgames games : allGamesList) {
            System.out.println(games.getCname());
        }
    }
}
