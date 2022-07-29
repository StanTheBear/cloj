# cloj
# Whilst learning functional programming and Clojure I had written a stumbling realisation of M.O'Neil Real Sieve of Eratosthenes which sifts 
# by tracking composite numbers. [https://web.archive.org/web/20150710134640/http://diditwith.net/2009/01/20/YAPESProblemSevenPart2.aspx]
# I could feel my lack of FP thinking spoiling something, but what? Many thanks to Clojurians on Slack especially Sean Corfield who 
# helped showing my shadowing in my IF-LET and poor Clojure layout and naming which you can see corrected on his fork...
#
# To satisfy my mechanistic mind I had built up the erato function from two functions sum-keys & sumaddfacts that reflected the o'Neil composite
# table update options. Originally I called them from a single (candidate prime number) step (Let [sieve ... ) form with full before and after printouts. Really to confirm 
# to myself what Clojure data elements did.
