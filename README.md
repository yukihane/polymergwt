# Maven Polymergwt

Maven fork of
- https://github.com/cristcost/polymergwt
- https://github.com/cdigiano/polymergwt 


## Instructions:

Clone the project change to the project dir

```
git clone https://github.com/yukihane/polymergwt.git
cd polymergwt
```

Build with maven
```
mvn clean gwt:compile war:exploded
```
or simply
```
mvn clean package
```

Run with maven's jetty plugin

```
mvn jetty:run
```

Open http://localhost:8888/ with your browser


## Notes

- This maven version is using GWT 2.8.2
- Firefox 57.0.4 works well with this demo, but Chromium 63.0.3239.84 does not

