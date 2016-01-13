// getTransformToElement() polyfill
// courtesy of http://jointjs.com/blog/get-transform-to-element-polyfill.html
	
(function() { "use strict";
SVGElement.prototype.getTransformToElement = SVGElement.prototype.getTransformToElement || function(toElement) {
    return toElement.getScreenCTM().inverse().multiply(this.getScreenCTM());
};
}());