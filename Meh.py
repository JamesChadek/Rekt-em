import requests
from lxml import html
import sys
import urlparse
import os, shutil

folder = 'Downloaded_Images'
for the_file in os.listdir(folder):
    file_path = os.path.join(folder, the_file)
    try:
        if os.path.isfile(file_path):
            os.unlink(file_path)
        #elif os.path.isdir(file_path): shutil.rmtree(file_path)
    except Exception, e:
        print e

site = str(sys.argv[1]) 

#site = raw_input('Where should we scrape? > ')
#str(site)
#'http://google.com'

response = requests.get(site)
parsed_body = html.fromstring(response.text)

# Grab links to all images
images = parsed_body.xpath('//img/@src')
if not images:
    sys.exit("Found No Images")

# Convert any relative urls to absolute urls
images = [urlparse.urljoin(response.url, url) for url in images]
print ('Found %s images' % len(images))

#if not os.path.exists(directory):
    #os.makedirs(directory)

# Only download first 100
for url in images[0:100]:
    r = requests.get(url)
    f = open('Downloaded_Images/%s' % url.split('/')[-1], 'w')
    f.write(r.content)
    f.close()
    