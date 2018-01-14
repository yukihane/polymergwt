package com.google.gwt.polymerdemo.myelemental;

import jsinterop.annotations.JsType;

@JsType(isNative=true)
public interface EventListener {
  void handleEvent(Event event);
}
