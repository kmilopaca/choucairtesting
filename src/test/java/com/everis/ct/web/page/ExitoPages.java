package com.everis.ct.web.page;

import com.everis.ct.web.base.WebBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
public class ExitoPages extends WebBase {
    @FindBy(xpath = "//div[@id='category-menu']")
    protected WebElement btnMenu;
    @FindBy(xpath = "//p[@id='categorias-nivel2-Tecnología']")
    protected WebElement lblTecnologia;
    @FindBy(xpath = "//p[@id='categorias-nivel2-Televisores']")
    protected WebElement lblTelevisores;
    @FindBy(xpath = "//a[@id='categorias-nivel3-44 a 50 Pulgadas']")
    protected WebElement lblTamaño;

    @FindBy(xpath = "//span[@class='exito-vtex-components-4-x-buttonText']")
    protected WebElement btnAgregar;

    @FindBy(xpath = "//span[@class='shelf-exito-vtex-components-buy-button-manager-more']")
    protected WebElement btnMas;

    public void MenuAction() {
        var wait = webDriverWait(Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(btnMenu));
        click(lblTecnologia);
        click(lblTelevisores);
        click(lblTamaño);
    }

    public void SelectArticulo() {
        var wait = webDriverWait(Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(btnAgregar));
        click(btnAgregar);
        click(btnMas);

    }
}
