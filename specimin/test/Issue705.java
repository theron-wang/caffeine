package com.uber;

import com.google.common.collect.ForwardingConcurrentMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentHashMap;
import org.checkerframework.checker.nullness.qual.Nullable;

class Issue705<K, V> {
    @Nullable Foo f;
    
    final class Foo { }
}
