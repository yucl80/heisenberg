/*
 * Copyright 1999-2012 Alibaba Group.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.baidu.hsb.statistic;

/**
 * @author xianmao.hexm
 */
public final class SQLRecord implements Comparable<SQLRecord> {

    public String host;
    public String schema;
    public String statement;
    public long startTime;
    public long executeTime;
    public String dataNode;
    public int dataNodeIndex;

    @Override
    public int compareTo(SQLRecord o) {
        return (int) (executeTime - o.executeTime);
    }

}