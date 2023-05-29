
# Rapport

At first I started by implementing the recyclerview widget into the activity main along with the recycler item layout. Next up I created the mountain class to store the json data,
and created getters and setters for it. Then I created a new JSONtask to fetch the online json-file. Afterwards the MountainAdapter class was created in order to add things to the
recyclerview. After that I added the code:

        "Gson gson = new Gson();

        Type type = new TypeToken<ArrayList<Mountain>>() {}.getType();
        ArrayList<Mountain> dynastyArrayList = gson.fromJson(json, type);"

which used gson in order to parse the data and put it into the recyclerview. Since the adapter updated the titles of the recycler_item, the names of the mountains were now displayed

## Följande grundsyn gäller dugga-svar:

- Ett kortfattat svar är att föredra. Svar som är längre än en sida text (skärmdumpar och programkod exkluderat) är onödigt långt.
- Svaret skall ha minst en snutt programkod.
- Svaret skall inkludera en kort övergripande förklarande text som redogör för vad respektive snutt programkod gör eller som svarar på annan teorifråga.
- Svaret skall ha minst en skärmdump. Skärmdumpar skall illustrera exekvering av relevant programkod. Eventuell text i skärmdumpar måste vara läsbar.
- I de fall detta efterfrågas, dela upp delar av ditt svar i för- och nackdelar. Dina för- respektive nackdelar skall vara i form av punktlistor med kortare stycken (3-4 meningar).

Programkod ska se ut som exemplet nedan. Koden måste vara korrekt indenterad då den blir lättare att läsa vilket gör det lättare att hitta syntaktiska fel.

```
    public void onPostExecute(String json) {
        Log.d("MainActivity", json);
        Gson gson = new Gson();

        Type type = new TypeToken<ArrayList<Mountain>>() {}.getType();
        ArrayList<Mountain> dynastyArrayList = gson.fromJson(json, type);

        RecyclerView view = findViewById(R.id.recycler_view);
        MountainAdapter adapter = new MountainAdapter(MainActivity.this, dynastyArrayList, new MountainAdapter.OnClickListener() {
            @Override
            public void onClick(Mountain item) {
                Log.d("==>","On Click works");
            }
        });

        view.setAdapter(adapter);
        view.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }
```

Bilder läggs i samma mapp som markdown-filen.

![](mountain names.png)

Läs gärna:

- Boulos, M.N.K., Warren, J., Gong, J. & Yue, P. (2010) Web GIS in practice VIII: HTML5 and the canvas element for interactive online mapping. International journal of health geographics 9, 14. Shin, Y. &
- Wunsche, B.C. (2013) A smartphone-based golf simulation exercise game for supporting arthritis patients. 2013 28th International Conference of Image and Vision Computing New Zealand (IVCNZ), IEEE, pp. 459–464.
- Wohlin, C., Runeson, P., Höst, M., Ohlsson, M.C., Regnell, B., Wesslén, A. (2012) Experimentation in Software Engineering, Berlin, Heidelberg: Springer Berlin Heidelberg.
