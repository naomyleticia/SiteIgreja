package com.igreja.igreja.controle;

@RestController
public class ControlladorNavegacao{
    
    @RequestMapping("/")
    public ModelAndView index(){
        ModelAndView retorno = new ModelAndView("index.html");
        return retorno;
    }

    @RequestMapping("/eventos")
    public ModelAndView eventos(){
        ModelAndView retorno = new ModelAndView("eventos.html");
        return retorno;
    }

    @RequestMapping("/ensaios")
    public ModelAndView ensaios(){
        ModelAndView retorno = new ModelAndView("ensaios.html");
        return retorno;
    }

    @RequestMapping("/devocional")
    public ModelAndView devocional(){
        ModelAndView retorno = new ModelAndView("devocional.html");
        return retorno;
    }
}