import json
import gzip

def parse(path):
  g = gzip.open(path, 'r')
  for l in g:
    yield json.dumps(eval(l))

f = open("amazon_metadata.json", 'w')
for l in parse("metadata.json.gz"):
  f.write(l + '\n')
