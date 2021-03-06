/*
 *  Copyright 1999-2018 Alibaba Group Holding Ltd.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.alibaba.fescar.rm.datasource.sql.struct;

public enum IndexType {
    /**
     *
     */
    PRIMARY(0),
    /**
     *
     */
    Normal(1),
    /**
     *
     */
    Unique(2),
    /**
     *
     */
    FullText(3);

    private int i;

    IndexType(int i) {
        this.i = i;
    }

    public static IndexType valueOf(int i) {
        for (IndexType t : values()) {
            if (t.value() == i) {
                return t;
            }
        }
        throw new IllegalArgumentException("Invalid IndexType:" + i);
    }

    public int value() {
        return this.i;
    }
}