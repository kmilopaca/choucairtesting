package com.everis.ct.web.step;

import com.everis.ct.web.page.StepPages;
import com.everis.ct.web.service.aspect.evidence.ScreenShot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@ScreenShot
@Component
public class ExitoStep {
    @Autowired
    private StepPages page;

    public void MenuInicial() {
        page.symExitoRequest().MenuAction(); }

    public void SeleccionArticulo() {
        page.symExitoRequest().SelectArticulo(); }




}
