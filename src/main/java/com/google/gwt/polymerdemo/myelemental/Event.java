package com.google.gwt.polymerdemo.myelemental;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true)
public interface Event {
  
  @JsProperty Detail getDetail();

  @JsType(isNative=true)
  public interface Detail {
  }
}
