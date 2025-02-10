# Groovy Implicit Type Coercion Bug

This repository demonstrates a subtle bug in Groovy related to implicit type coercion with null values and lists. The `+` operator's behavior changes depending on whether the operands are null or lists, leading to unexpected results.

## Problem

The `myMethod` function aims to add two values.  However, when either input is null,  it surprisingly returns a list instead of null or throws an exception.

## Solution

The solution involves explicitly handling null values and performing type checking to avoid implicit coercion issues.