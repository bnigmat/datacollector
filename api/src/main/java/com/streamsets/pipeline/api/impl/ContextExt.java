/**
 * (c) 2014 StreamSets, Inc. All rights reserved. May not
 * be copied, modified, or distributed in whole or part without
 * written consent of StreamSets, Inc.
 */
package com.streamsets.pipeline.api.impl;

import java.io.IOException;
import java.io.Reader;

public interface ContextExt {

  public JsonRecordParser createMultiObjectJsonRecordParser(Reader reader, long initialPosition, int maxObjectLen)
      throws IOException;

}
