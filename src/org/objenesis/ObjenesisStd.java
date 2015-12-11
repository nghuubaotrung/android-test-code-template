package org.objenesis;

import org.objenesis.strategy.StdInstantiatorStrategy;

/**
 * Objenesis implementation using the {@link org.objenesis.strategy.StdInstantiatorStrategy}.
 *
 * このメソッドはmockito のキャッシュを無効にするためにある。
 * 無効にしなければ、同じクラスを連続でモックを作ることができない。
 *
 * <b>mockitoのバージョンについては1.9.5に準拠している。もしバージョンをあげる場合はこのクラスを変更する必要がある。</b>
 */
public class ObjenesisStd extends ObjenesisBase {

    /**
     * Default constructor using the {@link org.objenesis.strategy.StdInstantiatorStrategy}
     */
    public ObjenesisStd() {
        super(new StdInstantiatorStrategy());
    }

    /**
     * Instance using the {@link org.objenesis.strategy.StdInstantiatorStrategy} with or without
     * caching {@link org.objenesis.instantiator.ObjectInstantiator}s
     *
     * @param useCache If {@link org.objenesis.instantiator.ObjectInstantiator}s should be cached
     */
    public ObjenesisStd(boolean useCache) {
        super(new StdInstantiatorStrategy(), false);
    }
}
