from selenium.webdriver.common.keys import Keys

from webdriver import *
import time

class Test1(WebDriverBase):

    def __init__(self):
        super().__init__()
        self.init_driver()
        self.driver.get("https://www.google.com/")
        self.driver.maximize_window()
        time.sleep(2)

        self.driver.find_element_by_name("q").send_keys("Testinium")
        time.sleep(2)

        self.driver.find_element_by_name("q").send_keys(Keys.Enter)
        time.sleep(2)

        self.driver.quit()


if __name__ == '__main__':
    Test1()
    print("TEST OK")