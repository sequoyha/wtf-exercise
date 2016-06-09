For Graph

run wget http://snap.stanford.edu/data/amazon/productGraph/complete.json.gz to pull complete dataset
run wget http://snap.stanford.edu/data/amazon/productGraph/metadata.json.gz for item metadata
extract metadata to strict json (amazon\_metadata.json) by running the convertMetadata.py script
extract complete to strict json (amazon\_reviews.json) by running convertComplete.py script
have user run the graphloader for amazonItems.groovy
have user run the graphloader for amazonReviews.groovy


