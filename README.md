# Introduction
lib-gwt-svg is a library to add SVG graphics to GWT applications.

It offers the following features:

* GWT exposition of 100% of the JavaScript APIs defined in the [SVG 1.1 W3C recommendation (August 11, 2011)](http://www.w3.org/TR/SVG/ "Scalable Vector Graphics (SVG) 1.1 (Second Edition)").
* Many additional helper methods to improve development productivity.
* Tight integration with GWT, including: SVG resources (with XML validation), SVG in UiBinder definitions, integration with GWT event system, SVG Widgets (images, push and toggle buttons).
* Tight integration with Java, including: iteratable collections, subclassing of SVG elements, complete integration of W3C documentation in the javadocs.
* Open source [LGPLv3](http://www.gnu.org/licenses/lgpl.html "LGPLv3 homepage") license.
* Based on modern tools: maven, sonatype, git, jenkins

# Demos, documentation, technical articles and other resources

Most of the documentation and support for the project is hosted by the [vectomatic](http://www.vectomatic.org/libs/lib-gwt-svg) website. This includes:

* [Release notes](http://www.vectomatic.org/libs/lib-gwt-svg/release-notes)
* [Javadoc](http://www.vectomatic.org/mvn-sites/lib-gwt-svg/apidocs/index.html)
* [Source x-ref](http://www.vectomatic.org/mvn-sites/lib-gwt-svg/xref/index.html)
* [Maven site](http://www.vectomatic.org/mvn-sites/lib-gwt-svg/)
* [Technical articles](http://www.vectomatic.org/category/lib-gwt-svg)

A few samples of applications developed with this library can be found here (all of them with full source code):

* [Basic samples](http://www.vectomatic.org/libs/lib-gwt-svg/samples)
* [SVG editor](http://www.vectomatic.org/apps/svgreal)
* [Basic usage](http://www.vectomatic.org/games/lib-gwt-svg-chess)
* [Educational games](http://www.vectomatic.org/games/lib-gwt-svg-edu)

The library can obtained from:

* The [Maven Central Repository](http://search.maven.org/#search|ga|1|a%3A%22lib-gwt-svg%22)
* The [vectomatic](http://www.vectomatic.org/mvn/org/vectomatic/lib-gwt-svg) local maven repository

Discussion group: 

* The [lib-gwt-svg Google group](https://groups.google.com/group/lib-gwt-svg) answers questions about lib-gwt-svg usage. I (or somebody else) will do my best to answer it as quickly as possible.

Development: 

* The main code repository is now hosted on [github](https://github.com/laaglu/lib-gwt-svg). The easiest way to contribute is to send pull requests there, or to provide patches to me by [email](mailto:laaglu@gmail.com)

# Compatibility
Lib-gwt-svg requires GWT 2.x. Depending on the version you GWT you are using, you must choose a version of lib-gwt-svg which matches it, as described in the following table:
<table border="0">
<tbody>
<tr>
<th>GWT version</th>
<th>lib-gwt-svg version</th>
</tr>
<tr>
<td>2.0.3</td>
<td>0.4.6</td>
</tr>
<tr>
<td>2.0.4</td>
<td>0.4.7</td>
</tr>
<tr>
<td>2.1.0M1</td>
<td>0.4.9</td>
</tr>
<tr>
<td>2.1.0 / 2.1.1</td>
<td>0.5.0</td>
</tr>
<tr>
<td>2.2.0</td>
<td>0.5.1</td>
</tr>
<tr>
<td>2.3.0</td>
<td>0.5.2</td>
</tr>
<tr>
<td>2.4.0</td>
<td>0.5.5, 0.5.4 or 0.5.3</td>
</tr>
</tbody>
</table>

lib-gwt-svg has been tested on the following SVG-enabled web browsers:
<table border="0">
<tbody>
<tr>
<th>Browser</th>
<th>Version</th>
</tr>
<tr>
<td>Firefox</td>
<td>3.x</td>
</tr>
<tr>
<td>Opera</td>
<td>10.x or greater</td>
</tr>
<tr>
<td>Chrome</td>
<td>5.x or greater</td>
</tr>
<tr>
<td>Safari</td>
<td>5.x</td>
</tr>
<tr>
<td>IE</td>
<td>9.x (NB: on IE, xpath support is provided by integrating the excellent, <a href="http://creativecommons.org/licenses/by-sa/2.0/" title="Creative Commons Licence">Creative-Commons</a>-licenced  <a href="http://mcc.id.au/xpathjs" title="xpath.js home">xpath.js</a> library, by Cameron McCormack)</td>
</tr>
<tr>
<td>Firefox for Android</td>
<td>10.x (NB: firefox supports touch events, but only single touch at the moment. Support for true multitouch is planned for 11.x)</td>
</tr>
<tr>
<td>Android browser</td>
<td>Android 3.2 (NB: Android does not implement touch events for SVG)</td>
</tr>
</tbody>
</table>

