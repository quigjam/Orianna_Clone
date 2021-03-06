package com.merakianalytics.orianna.types.data.staticdata;

import com.merakianalytics.orianna.types.data.CoreData;

public class ReforgedRune extends CoreData {
    private static final long serialVersionUID = -5553876628279119221L;
    private int id, path, slot;
    private String key, name, shortDescription, longDescription, image, platform, version, locale;

    @Override
    public boolean equals(final Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(getClass() != obj.getClass()) {
            return false;
        }
        final ReforgedRune other = (ReforgedRune)obj;
        if(id != other.id) {
            return false;
        }
        if(image == null) {
            if(other.image != null) {
                return false;
            }
        } else if(!image.equals(other.image)) {
            return false;
        }
        if(key == null) {
            if(other.key != null) {
                return false;
            }
        } else if(!key.equals(other.key)) {
            return false;
        }
        if(locale == null) {
            if(other.locale != null) {
                return false;
            }
        } else if(!locale.equals(other.locale)) {
            return false;
        }
        if(longDescription == null) {
            if(other.longDescription != null) {
                return false;
            }
        } else if(!longDescription.equals(other.longDescription)) {
            return false;
        }
        if(name == null) {
            if(other.name != null) {
                return false;
            }
        } else if(!name.equals(other.name)) {
            return false;
        }
        if(path != other.path) {
            return false;
        }
        if(platform == null) {
            if(other.platform != null) {
                return false;
            }
        } else if(!platform.equals(other.platform)) {
            return false;
        }
        if(shortDescription == null) {
            if(other.shortDescription != null) {
                return false;
            }
        } else if(!shortDescription.equals(other.shortDescription)) {
            return false;
        }
        if(slot != other.slot) {
            return false;
        }
        if(version == null) {
            if(other.version != null) {
                return false;
            }
        } else if(!version.equals(other.version)) {
            return false;
        }
        return true;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * @return the locale
     */
    public String getLocale() {
        return locale;
    }

    /**
     * @return the longDescription
     */
    public String getLongDescription() {
        return longDescription;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the path
     */
    public int getPath() {
        return path;
    }

    /**
     * @return the platform
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * @return the shortDescription
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * @return the slot
     */
    public int getSlot() {
        return slot;
    }

    /**
     * @return the version
     */
    public String getVersion() {
        return version;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + (image == null ? 0 : image.hashCode());
        result = prime * result + (key == null ? 0 : key.hashCode());
        result = prime * result + (locale == null ? 0 : locale.hashCode());
        result = prime * result + (longDescription == null ? 0 : longDescription.hashCode());
        result = prime * result + (name == null ? 0 : name.hashCode());
        result = prime * result + path;
        result = prime * result + (platform == null ? 0 : platform.hashCode());
        result = prime * result + (shortDescription == null ? 0 : shortDescription.hashCode());
        result = prime * result + slot;
        result = prime * result + (version == null ? 0 : version.hashCode());
        return result;
    }

    /**
     * @param id
     *        the id to set
     */
    public void setId(final int id) {
        this.id = id;
    }

    /**
     * @param image
     *        the image to set
     */
    public void setImage(final String image) {
        this.image = image;
    }

    /**
     * @param key
     *        the key to set
     */
    public void setKey(final String key) {
        this.key = key;
    }

    /**
     * @param locale
     *        the locale to set
     */
    public void setLocale(final String locale) {
        this.locale = locale;
    }

    /**
     * @param longDescription
     *        the longDescription to set
     */
    public void setLongDescription(final String longDescription) {
        this.longDescription = longDescription;
    }

    /**
     * @param name
     *        the name to set
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * @param path
     *        the path to set
     */
    public void setPath(final int path) {
        this.path = path;
    }

    /**
     * @param platform
     *        the platform to set
     */
    public void setPlatform(final String platform) {
        this.platform = platform;
    }

    /**
     * @param shortDescription
     *        the shortDescription to set
     */
    public void setShortDescription(final String shortDescription) {
        this.shortDescription = shortDescription;
    }

    /**
     * @param slot
     *        the slot to set
     */
    public void setSlot(final int slot) {
        this.slot = slot;
    }

    /**
     * @param version
     *        the version to set
     */
    public void setVersion(final String version) {
        this.version = version;
    }
}
