package learning.shinesdev.myfirebase.repository;

import com.google.firebase.auth.FirebaseAuth;

public class Repository {
    private FirebaseAuth mAuth;
    private Repository mInstance;

    public Repository getInstance(){
        if(mInstance == null){
            mInstance = new Repository();
        }
        return mInstance;
    }

    public Repository(){
        mAuth = FirebaseAuth.getInstance();
    }

}
