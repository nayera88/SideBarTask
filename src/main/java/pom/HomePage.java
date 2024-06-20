package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import utils.SeleniumActions;
import utils.SeleniumBase;


public class HomePage extends SeleniumBase {

    public void openOverViewPage() throws InterruptedException {
        SeleniumActions actions = new SeleniumActions();
        Thread.sleep(4000);
       // actions.waitUntil(SeleniumActions.Waits.VISIBILITY_OF_ELEMENT, (By) driver.findElement(By.cssSelector("convertedin-sidebar")));
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
        Thread.sleep(4000);
        WebElement element = (WebElement) driver.findElement(By.cssSelector("convertedin-sidebar"));
        SearchContext context = element.getShadowRoot();
        context.findElement(By.cssSelector(".p-accordion .ng-tns-c823280842-2"));
        context.findElement(By.cssSelector("#p-accordiontab-2")).click();
        context.findElement(By.cssSelector("#p-accordiontab-2-content"));
        context.findElement(By.cssSelector("[role=tablist]"));
        context.findElement(By.cssSelector(".ng-tns-c823280842-3"));
        context.findElement(By.cssSelector("#p-accordiontab-3")).click();
        context.findElement(By.cssSelector("#p-accordiontab-3-content"));
        //context.findElement(By.cssSelector(".flex .sidebar__subroute"));
    }
}
