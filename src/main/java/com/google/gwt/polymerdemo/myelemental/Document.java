package com.google.gwt.polymerdemo.myelemental;

import jsinterop.annotations.JsType;

@JsType(isNative=true)
public interface Document extends Node {

  EventTarget getElementById(String id);
}