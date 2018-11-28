// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/workflow_templates.proto

package com.google.cloud.dataproc.v1;

public interface WorkflowGraphOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.WorkflowGraph)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The workflow nodes.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.WorkflowNode nodes = 1;</code>
   */
  java.util.List<com.google.cloud.dataproc.v1.WorkflowNode> 
      getNodesList();
  /**
   * <pre>
   * Output only. The workflow nodes.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.WorkflowNode nodes = 1;</code>
   */
  com.google.cloud.dataproc.v1.WorkflowNode getNodes(int index);
  /**
   * <pre>
   * Output only. The workflow nodes.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.WorkflowNode nodes = 1;</code>
   */
  int getNodesCount();
  /**
   * <pre>
   * Output only. The workflow nodes.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.WorkflowNode nodes = 1;</code>
   */
  java.util.List<? extends com.google.cloud.dataproc.v1.WorkflowNodeOrBuilder> 
      getNodesOrBuilderList();
  /**
   * <pre>
   * Output only. The workflow nodes.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.WorkflowNode nodes = 1;</code>
   */
  com.google.cloud.dataproc.v1.WorkflowNodeOrBuilder getNodesOrBuilder(
      int index);
}