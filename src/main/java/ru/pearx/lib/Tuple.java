package ru.pearx.lib;

/*
 * Created by mrAppleXZ on 20.11.17 18:14.
 */

import java.util.Objects;

/**
 * A simple pair.
 * @param <L> Type of the first object.
 * @param <R> Type of the second object.
 */
public class Tuple<L, R>
{
    private L left;
    private R right;

    /**
     * Creates a new {@link Tuple} instance.
     * @param left First object.
     * @param right Second object.
     */
    public Tuple(L left, R right)
    {
        this.left = left;
        this.right = right;
    }

    /**
     * Creates a new {@link Tuple} instance. The objects will be null.
     */
    public Tuple()
    {
    }

    /**
     * Gets the first object.
     */
    public L getLeft()
    {
        return left;
    }

    /**
     * Sets the first object.
     * @param left First object.
     */
    public void setLeft(L left)
    {
        this.left = left;
    }

    /**
     * Gets the second object.
     */
    public R getRight()
    {
        return right;
    }

    /**
     * Sets the second object.
     * @param right Second object.
     */
    public void setRight(R right)
    {
        this.right = right;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tuple<?, ?> tuple = (Tuple<?, ?>) o;
        return Objects.equals(left, tuple.left) &&
                Objects.equals(right, tuple.right);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(left, right);
    }

    @Override
    public String toString()
    {
        return "Tuple{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}
