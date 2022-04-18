from urllib import request
from wsgiref.headers import Headers
from bs4 import BeautifulSoup as soup
from urllib.request import urlopen as ureq
url = "https://www.etsy.com/search?q=chair"


class websearcher:


    def __init__(self):
        self.url = url
        self.Headers= Headers
    
    def find_container(self):
        url2 = request.get(self.url , headers=self.Headers)

        # downloads html from page
        page_soup = soup(url2.content,"lxml")
        self.productContainer = page_soup.findAll("div", {"class":"TrackedProductCardWrapper"})

    def transfer(self):
        with open(f"{web_name}.json","w") as outfile:

            for container in self.productContainer:
                nameContainer = container.find("div",{"data-enzyme id":"productNameSpaceing"})
                name = nameContainer.text.strip()

                priceContainer = container.find("div", {"class":"SFPrice"})
                price = priceContainer.text.strip()

                imgContainer = container.find("div", {"class":"SFPrice"})
                img = imgContainer["src"]

                # img["src"] to get image, remember if else , some donot have

                dict = {
                    "productName" : name,
                    "price": price,
                    "image": img
                }     