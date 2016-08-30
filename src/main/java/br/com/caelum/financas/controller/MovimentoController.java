package br.com.caelum.financas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.caelum.financas.dao.MovimentoDao;
import br.com.caelum.financas.model.Movimento;


@Controller
public class MovimentoController {

    private final MovimentoDao dao;

    @Autowired
    public MovimentoController(MovimentoDao dao) {
        this.dao = dao;
    }

    @RequestMapping("/novoMovimento")
    public String execute() {

        return "movimento/formulario";
    }

    @RequestMapping("/")
    public String lista(Model model) {

        model.addAttribute("movimentos", dao.lista());
        return "lista";

    }

    @RequestMapping("adicionaMovimento")
    public String adiciona(@Validated Movimento movimento, BindingResult result) {
        if (result.hasFieldErrors("descricao")) {
            return "movimento/formulario";
        }

        dao.adiciona(movimento);
        return "movimento/adicionada";

    }

}
