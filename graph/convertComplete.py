import json
import gzip

def parse(path):
  g = gzip.open(path, 'r')
  for l in g:
    yield json.dumps(eval(l))

f = open("amazon_reviews.json", 'w')
for l in parse("complete.json.gz"):
  f.write(l + '\n')
