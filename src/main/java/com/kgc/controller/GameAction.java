package com.kgc.controller;

import com.kgc.entity.Allgames;
import com.kgc.service.IAllGamesService;
import com.opensymphony.xwork2.ActionSupport;
import net.sf.json.JSONArray;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by  王帆 on 2017/3/2.
 */
public class GameAction extends ActionSupport {
    @Autowired
    private IAllGamesService allGamesService;
    private String result;
    private HttpServletRequest request;
    private List<String> list = new ArrayList<String>();
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setAllGamesService(IAllGamesService allGamesService) {

        this.allGamesService = allGamesService;
    }

//    @Override
//    public String execute() throws Exception {
//        List<Allgames> allgames = allGamesService.listAll(Allgames.class);
//        JSONArray jsonArray = JSONArray.fromObject(allgames);
//        result = jsonArray.toString();
//        return SUCCESS;
//    }

    public String getGameByFirstWord() throws IOException {
        request = ServletActionContext.getRequest();
        List<Allgames> allgames = allGamesService.listByInitial(request.getParameter("value"));
        for (Allgames games : allgames) {
            list.add(games.getCname());
        }

        JSONArray jsonArray = JSONArray.fromObject(list);
        System.out.println(jsonArray.toString());
        result = jsonArray.toString();
        return SUCCESS;
    }

    public String getGameNameByIsHot(){
        request = ServletActionContext.getRequest();
        System.out.println(request.getParameter("value"));
        if(request.getParameter("value").equals("热门游戏")){
            List<Allgames> allgames = allGamesService.listByHot("S");
            JSONArray jsonArray = JSONArray.fromObject(allgames);
            result = jsonArray.toString();
            System.out.println(result);
        }
        return SUCCESS;
    }
}
