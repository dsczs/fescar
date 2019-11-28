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

package com.alibaba.fescar.server.session;

import com.alibaba.fescar.server.store.FileTransactionStoreManager;

import java.io.IOException;

public class FileBasedSessionManager extends AbstractSessionManager {

    public FileBasedSessionManager(String name, String sessionStoreFilePath) throws IOException {
        super(name);
        transactionStoreManager = new FileTransactionStoreManager(sessionStoreFilePath + name, this);
    }
}
