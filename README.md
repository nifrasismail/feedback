FeedBack API - Hand written JSON
===================


This is a handcraft JSON API gives you to create and collaborate more specific feedback templates to the world. From this JSON template, we give more specific feed templates by crowdsourcing. If you are a web developer or mobile content developer you can easily download the relevant JSON and free to use for your feedback engines templates.


----------


Problem & Solution
-------------

![Android Widget Sample](designs/Android.png =250x "Sample Widget FeedBack from JSON")

While you are creating a web site to for restaurant, while users visit to the restaurant, you wish to getting the feedback of the restaurant. You offered. How did you measure. Using existing 5 star rating system is enough?


We come with a solution that we are enabling the feedback through our small chunk of JSON API **feed_resturnat.json**

```javascript
{
  "product" : "resturant",
  "features" : [
    {
      "feature_name" : "clean",
      "weight" : "1",
      "locality" : [ "all" ]
    },
    {
      "feature_name" : "humanity",
      "weight" : "1",
      "locality" : [ "all" ]
    },
    {
      "feature_name" : "on-time-serving",
      "weight" : "1",
      "locality" : [ "all" ]
    },
    {
      "feature_name" : "healthy-food",
      "weight" : "1",
      "locality" : [ "all" ]
    },
    {
      "feature_name" : "spicy",
      "weight" : "1",
      "locality" : [ "lk" ]
    },
    {
      "feature_name" : "richness",
      "weight" : "1",
      "locality" : [ "all" ]
    }
  ]
}
```
Like this we can create each and categorised based feedback templates to the world.

Want to get the Country short Codes here : [Country short Codes](http://www.nationsonline.org/oneworld/country_code_list.htm)
We are following **ISO Alpha 2 Code ** Standards on locality tag

---------------------

How to Participate
-------------
Check on the [Mozilla Particiaption Guide Line](https://www.mozilla.org/en-US/about/governance/policies/participation/)

How to Contribute ?
-------------
Shall we together make millions of feedback api engines how? just check on [Contributing.md](https://github.com/nifrasismail/feedback/blob/master/Contributing.md)
