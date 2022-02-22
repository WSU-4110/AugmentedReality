from bs4 import BeautifulSoup as soup
from urllib.request import urlopen as ureq
url = "https://www.etsy.com/search?q=chair"


uclient = ureq(url)
page_html = uclient.read()
uclient.close()


page_soup = soup(page_html, "html.parser")

print(page_soup)


containers = page_soup.find_all("div" , {"class":"listing-link wt-display-inline-block"})

for container in containers:
    price= container.find("div", {"class":""})