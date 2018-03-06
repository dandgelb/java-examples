goto is to structural programming
assignment is to functional programming

## Functions with no side-effects
- functions have to be pure - don't have side-effect
    1. does not change anything
    2. does not depend on anything that changes
### Object orientation
- we can pass objects to function
- we can create objects within function
- we can return objects from function

### Higher-Order function - functions are first class citizens
- we can pass __function__ to function
- we can create __function__ within function
- we can return __function__ from function

## What are the benefits?
- 
## Functional style vs Purely functional
- java - functional style
- haskel - Purely functional - doesn't allow mutability

## What does it really mean to code in functional style?
- state transformation instead of state mutation
- method is a function which belongs to a class or to an object
- a function has 4 things
    1. name
    2. return type
    3. parameter list
    4. body
- lambda expression - constraint only two items from above
    - (parameter list) -> body
    - return type is inferred based on the context
    - name - who cares - anonymous 
- Re-factoring from external to internal iterator
- internal iterator is polymorphic - applies on the collection/list passed
- type is inferred at compile time
- lambdas which receives the data and simply passes it -- office space pattern => change to method references