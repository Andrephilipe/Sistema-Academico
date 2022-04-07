package acc.br.cadastro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class SistemaAcademicoController {
    
    @GetMapping("/")
    public String home()
    {
        return "home";
    }

    @GetMapping("/mensagem")
    public ModelAndView mensagem()
    {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("mensagem");
        modelAndView.addObject("mensagem", "Outra mensagem do sistema");

        return modelAndView;
    }

    @GetMapping("/saudacao")
    public ModelAndView saudacao(
        @RequestParam(required = false, defaultValue = "Treinamento") String nome)
    {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("saudacao");
        modelAndView.addObject("nome", nome);
        
        return modelAndView;
    }
}
