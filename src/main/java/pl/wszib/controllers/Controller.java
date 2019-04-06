package pl.wszib.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.wszib.domains.Samochod;

import javax.xml.ws.RequestWrapper;
import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    List<Samochod> listaSamochodow;

     public Controller(){
         listaSamochodow = listaSamochodw();
     }


    @RequestMapping("car/list")
    public String list (Model model){
        List<Samochod> list = listaSamochodw();
        model.addAttribute("list", list);
        return "listTemplate";
    }


    private List<Samochod> listaSamochodw (){
        List<Samochod> list = new ArrayList<>();
        for (int i = 1; i < 12; i++){
            Samochod samochod = new Samochod();
            samochod.setMarka("Marka" + i);
            samochod.setModel("Model" + i);
            samochod.setCena("1000" + i);
            samochod.setRocznik("200" + i);
            samochod.setPzrebiegKM("10000" + i);
            list.add(samochod);
        }
        return list;
    }



    @RequestMapping("car/single/{index}")
    public String single (@PathVariable int index, Model model){
        //List<Samochod> list = listaSamochodw();
        model.addAttribute("samochod", listaSamochodow.get(index));
        return "singleCar";
    }



    @GetMapping("forms")
    public String froms(Model model){
        model.addAttribute("car", new Samochod());
        return "formsTemplate";
    }


    @PostMapping("formsSave")
    public String formsSave(Samochod samochod, Model model){
        listaSamochodow.add(samochod);
        return "successTemplate";

    }




}
