// CONFIGURATION
// Configures the data loader to create the schema
config create_schema: true, load_threads: 3, load_new: true

inputfiledir = '/home/sequoyha/graph_testing/'
itemInput = File.json(inputfiledir + 'metadata.json')

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