import bs4
from bs4 import BeautifulSoup as soup
import requests
import json

my_url = 'https://www.wayfair.com/keyword.php?keyword=chair'
HEADERS = {"User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.87 Safari/537.36", "Accept-Encoding":"gzip, deflate", "Accept":"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8", "DNT":"1","Connection":"close", "Upgrade-Insecure-Requests":"1"}

# opening up connection and grabbing the page
url = requests.get(my_url, headers=HEADERS)

# downloads html from page
page_soup = soup(url.content, "lxml")

productContainer = page_soup.findAll("div", {"class":"TrackedProductCardWrapper"})
container = productContainer[0]
price = container.find("div", {"class":"SFPrice"})


with open("wayfairData.json", "w") as outfile:

    for container in productContainer:
        
        nameContainer = container.find("div", {"data-enzyme-id":"productNameSpacing"})
        name = nameContainer.text.strip()
        
        priceContainer = container.find("div", {"class":"SFPrice"})
        price = priceContainer.text.strip()
        
        imgContainer = container.find("div", {"data-enzyme-id":"FluidImage-wrapper"}).find("img")
        img = imgContainer["src"]

        # img["src"] to get image, remember if else, some dont have
        dict = {  
            "productName" : name,
            "price" : price,
            "img" : img
        }

        json.dump(dict, outfile, indent=4)
    
