

import sys, os
import simplejson

in_file = open('raw_categories.txt', 'r')
categories = []
space_start = space_previous = 1
all_languages = ['ES', 'BE', 'CH', 'NL', 'DK', 'NO', 'SG', 'CA', 'DE', 'TR', 'FR', 'US', 'IT', 'PL', 'AU', 'AT', 'FI', 'IE', 'SE', 'GB']
current_list = previous_list = categories
list_stack = []
for line in in_file:
    full_name, data = line.rsplit("(", 1)
    space_start = len(full_name) - len(full_name.strip())
    full_name = full_name.strip()
    short_name, languages = data.split(",", 1)
    languages = languages.strip().strip("[)]")
    if languages == "All":
        languages = all_languages
    else:
        languages = languages.split(", ")
    # name : full_name
    # short_name : short_name
    # languages : [languages]
    # subcategories : [subcategories]
    new_sublist = []
    new_item = {"subcategories" : new_sublist,
                "title" : full_name,
                "alias" : short_name,
                "languages" : languages}
    if space_start > space_previous:
        list_stack.append(current_list)
        current_list = previous_list
    elif space_start < space_previous:
        current_list = list_stack.pop()
    space_previous = space_start
    previous_list = new_sublist
    current_list.append(new_item)
in_file.close()

out_file = open('categories.json', 'w')
simplejson.dump(categories, out_file)
out_file.close()