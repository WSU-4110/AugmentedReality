from bs4 import BeautifulSoup
import requests
import json

count = 0
URL = "https://www.ikea.com/us/en/cat/chairs-fu002/?" 

#class to get html parse of url
def getdata(URL):
	page = requests.get(URL)
	page_soup = BeautifulSoup(page.content, "html.parser")
	return page_soup
page_soup = getdata(URL)

#huge grid with all chairs
page_grid = page_soup.findAll("div", {"class": "plp-product-list__products"})
#spot in array with all chair info
page_grid2 = page_grid[1]

#each furniture box in grid
containers = page_grid2.findAll("div", {"class": "plp-fragment-wrapper"})


#create file
with open("ikea_scrape.json", "w", encoding="utf8") as f:

	#loop thru each chair in the entire page
	for container in containers:

		count = count + 1

		#get picture
		if container.findAll("span", {"class": "range-revamp-aspect-ratio-image range-revamp-aspect-ratio-image--square"}): 
			img_container = container.findAll("span", {"class": "range-revamp-aspect-ratio-image range-revamp-aspect-ratio-image--square"})
			img = img_container[0].find("img")["src"]
		else:
			continue

        #get product name
		if container.findAll("div", {"class": "range-revamp-header-section"}): 
			name_container = container.findAll("div", {"class": "range-revamp-header-section"})
			name = name_container[0].text
			#Extract only the name of the chair and remove type of chair
			extracted_name = [char for char in name if char.isupper()]
			#the last letter of the name needs to be deleted since its the first word of the type of chair
			del extracted_name[-1]
			display_name = ''.join(extracted_name)

			#section with just the type of chair
			type_container = container.findAll("span", {"class": "range-revamp-header-section__description-text"})
			type = type_container[0].text
		else:
			continue
        
        #get cost
		if container.findAll("span", {"class": "range-revamp-price"}): 
			price_container = container.findAll("span", {"class": "range-revamp-price"})
			price = price_container[0].text
		else:
			continue

		#print values to terminal	
		print("Name: " + display_name + " " + type)
		print("Price: " + price)
		print("Img: " + img + "\n")

		data = {

			"Product Name" : display_name + " " + type,
			"Price" : price,
			"Image" : img
		}

		json.dump(data, f, indent=4, ensure_ascii=False)

print(count)
f.close()
