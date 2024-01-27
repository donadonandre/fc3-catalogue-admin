package com.fullcycle.catalogue.admin.domain.category;

import com.fullcycle.catalogue.admin.domain.AggregateRoot;

import java.time.Instant;
import java.util.UUID;

public class Category extends AggregateRoot<CategoryID> {

    private String name;
    private String description;
    private boolean active;
    private Instant createdAt;
    private Instant updatedAt;
    private Instant deletedAt;

    private Category(
            final CategoryID anId,
            final String anName,
            final String anDescription,
            final boolean isActive,
            final Instant anCreatedAt,
            final Instant anUpdatedAt,
            final Instant anDeletedAt
    ) {
        super(anId);
        this.name = anName;
        this.description = anDescription;
        this.active = isActive;
        this.createdAt = anCreatedAt;
        this.updatedAt = anUpdatedAt;
        this.deletedAt = anDeletedAt;
    }

    public static Category newCategory(final String aName, final String aDescription, final boolean isActive) {
        final var id = CategoryID.unique();
        final var now = Instant.now();
        return new Category(id, aName, aDescription, isActive, now, now, null);
    }

    public CategoryID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isActive() {
        return active;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public Instant getDeletedAt() {
        return deletedAt;
    }
}