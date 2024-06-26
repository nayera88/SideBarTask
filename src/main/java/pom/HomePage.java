package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import utils.SeleniumActions;
import utils.SeleniumBase;
import utils.Locators;

import static utils.SeleniumActions.Waits.VISIBILITY_OF_ELEMENT;
import static utils.SeleniumActions.Waits.ELEMENT_TO_BE_CLICKABLE;


public class HomePage extends SeleniumBase {

    public void openOverViewPage() throws InterruptedException {
        SeleniumActions actions = new SeleniumActions();
        Locators home =new Locators();
        actions.waitUntil(VISIBILITY_OF_ELEMENT,home.sidebar);
        WebElement element = driver.findElement(By.cssSelector("convertedin-sidebar"));
        SearchContext context = element.getShadowRoot();
        context.findElement(By.cssSelector(".p-accordion .p-element"));
        context.findElement(By.cssSelector(".p-accordion-header-link")).click();
        context.findElement(By.cssSelector("#p-accordiontab-0-content"));
        context.findElement(By.cssSelector(".p-accordion-content .flex "));
        context.findElement(By.cssSelector(".sidebar__subroute")).click();
    }

    public void openCreateEmailCampaign() throws InterruptedException {
        SeleniumActions actions = new SeleniumActions();
        Locators home =new Locators();
        actions.waitUntil(VISIBILITY_OF_ELEMENT,home.sidebar);
        WebElement element = driver.findElement(By.cssSelector("convertedin-sidebar"));
        SearchContext context = element.getShadowRoot();
        context.findElement(By.cssSelector(".p-accordion .ng-tns-c823280842-2"));
        context.findElement(By.cssSelector("#p-accordiontab-2")).click();
        context.findElement(By.cssSelector("#p-accordiontab-2-content"));
        context.findElement(By.cssSelector("[role=tablist]"));
        context.findElement(By.cssSelector(".ng-tns-c823280842-3"));
        context.findElement(By.cssSelector("#p-accordiontab-3")).click();
        context.findElement(By.cssSelector("#p-accordiontab-3-content"));
        WebElement a = context.findElement(By.cssSelector("#email-create-campaign"));
        Thread.sleep(1000);
        a.click();
    }
}
