package com.google.gwt.polymerdemo.myelemental;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true)
public interface HTMLElement extends Node {
  
  @JsProperty void setHidden(boolean visible);
  @JsProperty Document getShadowRoot();
}
