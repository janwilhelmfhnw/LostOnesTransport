package ch.fhnw.acrm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/shop")

public class ShopController {

    @GetMapping
    public String getShopView(){
        return "shop/shop.html";
    }

    @GetMapping("/create")
    public String getDashboardCreateView(){
        return "shop/dashboard.html";
    }

    @GetMapping("/edit")
    public String getSettingsView(){
        return "shop/settings";
    }
}
