# Interactive-Cookbook
The goal is to create an interactive cookbook where plan meals for the future, create shopping lists, and add personal recipes. At this stage this README is mainly for me so that I know the things that I need to do. Once I reach completion, this will be more for users to see how everything works.

## The Main Concerns

So, of course in order to complete this project the way that it needs to be done, we need to handle the frontend & the backend.

### The Frontend

This can be broken up into even more degrees of separation:

#### HTML

1. NavBar
It doesn't need to be pretty but it should function about the way that we want it to.

2. Header Section
Here maybe we should have an introduction, so the user understands what the service can do, & what the user is capable of doing as well.

3. The Form Section?
This is where the user should be able to add or modify the recipes, not sure exactly how to handle this spot but this is where most of the HTML problems will be handled.
At this stage we need to validate all recipes that are coming in, ensuring that every recipe has at least a name. Later decide what other items are required for entry (Not all items will be )

4. The recipe section
This place is where all the recipes should be located. The user should be able to scroll through all the recipes & filter through them based on various types
TODO: Think about what things you should allow the user to filter from all the recipes, likely the type/style of cuisine, as well as if it is breakfast, lunch, dinner or snack.

5. Calendar (this item may not be exactly right here)
This will allow the user to put their meals in for a particular day, as well as look at the totals of the nutritional information that they would have if they stick to to the plan for this particular day.
The functionality: The user selects a particular day, then they select the recipes they want to put in for that day. They need to also be able to remove or deselect the recipe so that it would not be on the day. Somewhere (no idea where yet), there should be a total of the more relevant pieces of information (total calories, carbohydrates, protein, fats) with the option of showing the other nutrition information.

6. Shopping List
When user fully submits segment of calendar, then we want to generate a shopping list that has the sum of all the ingredients that are needed for the recipes that were previously selected on the calendar. At this stage, we want to allow the user to remove items, & maybe at a later stage add items as well. We need to find a way to have this output to the user, (maybe text it to them???).



#### CSS/BOOTSTRAP

1. Place the Navbar in the navbar section, so that it doesn't collide with other elements on page

2. Fill out space for the header section, but not so much that it takes up an entire viewport
At this stage we also need to understand how the website will change depending on different viewport options. Will we allow the user to scroll? or will it collapse depending on viewport size?

3. Recipe Section
Likely will want this to be done with cards, maybe with a carousel that flips through all the cards. Consider more options than this though.

4. Calendar (No idea how to do this one at this time)


#### JS

1. Handling form display different funtionalities
Have button that will allow for different input fields to show. If they select the button to add recipe then the input for the entire recipe will show.
If they select to modify recipe then they need to provide the name of the recipe that they want to modify &  then we have to fetch that & provide it on the screen. At this point they should be able to modify the contents of this recipe object.

2.



### The Backend



#### Java Algorithms? / Object Creation?

#### Javascript if Java doesn't work out
