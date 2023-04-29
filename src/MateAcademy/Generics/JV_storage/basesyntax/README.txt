@Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (o.getClass().equals(StorageImpl.class)) {
            StorageImpl current = (StorageImpl) o;
            if (current.keys.length != keys.length){
                return false;
            }for (int i = 0; i < keys.length;i++){
                if(!Objects.equals(keys[i], current.keys[i])){
                    return false;
                }
                if (!Objects.equals(values[i],current.values[i])){
                    return false;
                }
            }
            return true;
        }
        return false;
    }