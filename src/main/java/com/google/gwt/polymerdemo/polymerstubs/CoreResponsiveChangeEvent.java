package com.google.gwt.polymerdemo.polymerstubs;

import com.google.gwt.polymerdemo.myelemental.Event;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public interface CoreResponsiveChangeEvent extends Event {

  @Override
  @JsProperty
  Detail getDetail();

  @JsType
  interface Detail extends Event.Detail {
    // TODO(digi): Fix JsProperty bean parsing to allow this to be renamed isNarrow.
    @JsProperty boolean getNarrow();
  }

  interface Handler {
    void onCoreResponsiveChange(CoreResponsiveChangeEvent event);
  }
}
