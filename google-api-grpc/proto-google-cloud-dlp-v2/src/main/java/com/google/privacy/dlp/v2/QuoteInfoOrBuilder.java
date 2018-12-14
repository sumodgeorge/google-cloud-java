// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface QuoteInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.QuoteInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The date time indicated by the quote.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DateTime date_time = 2;</code>
   */
  boolean hasDateTime();
  /**
   *
   *
   * <pre>
   * The date time indicated by the quote.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DateTime date_time = 2;</code>
   */
  com.google.privacy.dlp.v2.DateTime getDateTime();
  /**
   *
   *
   * <pre>
   * The date time indicated by the quote.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DateTime date_time = 2;</code>
   */
  com.google.privacy.dlp.v2.DateTimeOrBuilder getDateTimeOrBuilder();

  public com.google.privacy.dlp.v2.QuoteInfo.ParsedQuoteCase getParsedQuoteCase();
}