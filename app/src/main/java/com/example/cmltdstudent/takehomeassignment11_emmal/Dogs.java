package com.example.cmltdstudent.takehomeassignment11_emmal;

import java.io.Serializable;

/**
 * Created by cmltdstudent on 4/17/17.
 */

public class Dogs implements Serializable
{
    public String breedName;
    public String lifespan;
    public int photoId;

    public Dogs(String breedName, String lifespan, int photoId) {
        this.breedName = breedName;
        this.lifespan = lifespan;
        this.photoId = photoId;
    }

    public String getBreedName() {
        return breedName;
    }

    public String getLifespan() {
        return lifespan;
    }

    public int getPhotoId() {
        return photoId;
    }

    @Override
    public String toString() {
        return breedName + "\n" + lifespan + "\n" + photoId;
    }
}
