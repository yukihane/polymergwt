package com.google.gwt.polymerdemo.myelemental;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public interface Event {
  
  @JsProperty Detail getDetail();

  @JsType
  public interface Detail {
  }
}
