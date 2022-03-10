import bs4
from bs4 import BeautifulSoup as soup
import requests
import json

class Logger(object):
    _instance = None

    def __init__(self):
        raise RuntimeError("Please call instance() to initialize object")

    @classmethod
    def instance(objDetails, name, price, img):
        if objDetails._instance is None:
            print("Creating new instance")
            objDetails._instance = objDetails.__new__(objDetails)
            objDetails.name = name
            objDetails.price = price
            objDetails.img = img
        return objDetails._instance

# get url and supply headers for bot detection
my_url = 'https://www.wayfair.com/keyword.php?keyword=chair'
HEADERS = {"User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.87 Safari/537.36", "Accept-Encoding":"gzip, deflate", "Accept":"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8", "DNT":"1","Connection":"close", "Upgrade-Insecure-Requests":"1"}

# opening up connection and grabbing the page
url = requests.get(my_url, headers=HEADERS)

# downloads html from page
page_soup = soup(url.content, "lxml")

# get each container on the page and set the first one as the loop object
productContainer = page_soup.findAll("div", {"class":"TrackedProductCardWrapper"})
container = productContainer[0]


with open("wayfairData.json", "w") as outfile:

    for container in productContainer:
        
        nameContainer = container.find("div", {"data-enzyme-id":"productNameSpacing"})
        imgContainer = container.find("div", {"data-enzyme-id":"FluidImage-wrapper"}).find("img")
        priceContainer = container.find("div", {"class":"SFPrice"})

        name = nameContainer.text.strip()
        price = priceContainer.text.strip()
        img = imgContainer["src"]

        # Create object instance for manipulation
        obj = Logger.instance(name, price, img)
        
        dict = {  
            "productName" : obj.name,
            "price" : obj.price,
            "img" : obj.img
        }
        json.dump(dict, outfile, indent=4)

        # Clear instance of object
        Logger._instance = None
  
