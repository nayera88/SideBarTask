package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SeleniumActions extends SeleniumBase{

    Actions actions = new Actions(driver) ;

    public void click(By path){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement element = driver.findElement(path);
        wait.until(ExpectedConditions.elementToBeClickable(path));
        element.click();

    }

    public void sendKey(By path, String key){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement sendkey = driver.findElement(path);
        wait.until(ExpectedConditions.visibilityOfElementLocated(path));
        sendkey.sendKeys(key);
    }
    public void hover(By path) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement Hover = driver.findElement(path);
        waitUntil(Waits.VISIBILITY_OF_ELEMENT, path);
        actions.moveToElement(Hover).perform();
    }

    public void clear(By path){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement Clear = driver.findElement(path);
        wait.until(ExpectedConditions.visibilityOfElementLocated(path));
        Clear.clear();
    }
    public void doubleClick(By path){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement doubleClick = driver.findElement(path);
        wait.until(ExpectedConditions.visibilityOfElementLocated(path));
        actions.doubleClick(doubleClick).perform();
    }
    public void scroll(int scrollHeight) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, arguments[0])", scrollHeight);
    }


    public String getText(By path ){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement text = driver.findElement(path);
        wait.until(ExpectedConditions.visibilityOfElementLocated(path));

        return text.getText();
    }
    public void waitUntil(Waits waits, By path) {
        switch (waits) {
            case VISIBILITY_OF_ELEMENT:
                wait.until(ExpectedConditions.visibilityOfElementLocated(path));
                break;
            case ELEMENT_TO_BE_CLICKABLE:
                wait.until(ExpectedConditions.elementToBeClickable(path));
                break;
        }
    }

    public enum Waits {
        VISIBILITY_OF_ELEMENT,
        ELEMENT_TO_BE_CLICKABLE
    }
}
