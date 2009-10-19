/**
 * Copyright 2009 Alexander Kuznetsov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.lucene.morphology.russian;

import org.apache.lucene.morphology.Morphology;

import java.io.IOException;

public class RussianMorphology extends Morphology {

    public RussianMorphology() throws IOException {
        super(RussianMorphology.class.getResourceAsStream("/org/apache/lucene/morphology/english/morph.info"), new RussianLetterDecoderEncoder());
    }
}