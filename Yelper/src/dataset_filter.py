
import os, sys
import json
import fix_json

f = open('dataset_r.json', 'r')    

businesses = []
reviews = []
users = []
for line in f:
    yelp_object = json.loads(line)
    if yelp_object['type'] == 'user':
        users.append(yelp_object)
    elif yelp_object['type'] == 'review':
        reviews.append(yelp_object)
    elif yelp_object['type'] == 'business':
        if 'Virginia Tech' in yelp_object['schools']:
            businesses.append(yelp_object)
    else:
        print "Error, couldn't read type."
        print yelp_object
f.close()
    
vt_businesses = set([business['business_id'] for business in businesses])
    
vt_reviews = filter(lambda review : review['business_id'] in vt_businesses, 
                    reviews)

vt_reviewers = set([review['user_id'] for review in vt_reviews])

vt_users = filter(lambda user : user['user_id'] in vt_reviewers,
                  users)

f = open('dataset_filtered.json', 'w')
print "There are %d businesses" % (len(businesses),)
print "There are %d reviews" % (len(vt_reviews),)
print "There are %d users" % (len(vt_users),)
for line in businesses:
    f.write(str(line)+"\n")
for line in vt_reviews:
    f.write(str(line)+"\n")
for line in vt_users:
    f.write(str(line)+"\n")
f.close()