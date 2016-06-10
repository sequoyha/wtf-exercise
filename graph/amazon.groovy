// CONFIGURATION
// Configures the data loader to create the schema
config create_schema: true, load_threads: 3, load_new: true

inputfiledir = '/home/sequoyha/graph_testing/'
itemInput = File.json(inputfiledir + 'amazon_metadata.json')
reviewerInput = File.json(inputfiledir + 'reviews.json')

load(itemInput).asVertices	{
	label "item"
	key "asin"
	ignore "related"
	ignore "salesRank"
	ignore "also_viewed"
	ignore "buy_after_viewing"
	ignore "bought_together"
	ignore "also_bought"
	ignore "categories"
}

load(reviewerInput).asVertices  {
        label "reviewer"
        key "reviewerID"
        ignore "asin"
        ignore "unixReviewTime"
        ignore "reviewText"
        ignore "overall"
        ignore "reviewTime"
        ignore "summary"
}

load(reviewerInput).asEdges     {
        label "reviewed"
        outV "rname", {
                label "reviewer"
                key "reviewerID"
        }
}