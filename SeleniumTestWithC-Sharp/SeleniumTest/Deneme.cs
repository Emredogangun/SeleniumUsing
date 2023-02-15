using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using System;
using System.Collections.Generic;
using System.Text;
using System.Threading;

namespace SeleniumTest
{
    public class Deneme
    {
        public void ChromeTest()
        {
            IWebDriver driver = new ChromeDriver();
            driver.Navigate().GoToUrl("https://google.com/");
            Console.WriteLine("-------------------------------------------------------------------------");
            Console.WriteLine("Siteye Gidildi!");
            Thread.Sleep(2000);

            //------
            var searchText =driver.FindElement(By.Name("q"));
            searchText.SendKeys("KoçFinans");
            searchText.SendKeys(Keys.Enter);

            //----
            Thread.Sleep(2000);

            //----
            driver.Close();

        }
    }
}
