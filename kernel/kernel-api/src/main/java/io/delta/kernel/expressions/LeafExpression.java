/*
 * Copyright (2023) The Delta Lake Project Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.delta.kernel.expressions;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * An {@link Expression} with no children.
 */
public abstract class LeafExpression implements Expression {

    protected LeafExpression() {}

    @Override
    public List<Expression> children() {
        return Collections.emptyList();
    }

    @Override
    public Set<String> references() {
        return Collections.emptySet();
    }

    public abstract boolean equals(Object o);

    public abstract int hashCode();
}