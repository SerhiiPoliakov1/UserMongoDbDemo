package service;


import entity.User;
import io.grpc.stub.StreamObserver;
import org.example.grpc.UserOuterClass;
import org.example.grpc.userGrpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserRepository;

@Service
public class UserService extends userGrpc.userImplBase {

    @Autowired
    UserRepository repository;

    @Override
    public void findUserById(UserOuterClass.UserIdRequest request, StreamObserver<UserOuterClass.UserResponse> responseObserver) {

    }

    @Override
    public void create(UserOuterClass.UserRequest request, StreamObserver<UserOuterClass.UserResponse> responseObserver) {

        User user = new User(request.getUser().getId(), request.getUser().getUsername(), request.getUser().getEmail());
        System.out.println(user.toString());
        repository.save(user);


        UserOuterClass.UserResponse.Builder response = UserOuterClass.UserResponse.newBuilder();
        UserOuterClass.User.Builder userSuccess = UserOuterClass.User.newBuilder();

        userSuccess.setEmail(user.getEmail());
        userSuccess.setId(user.getId());
        userSuccess.setUsername(user.getUserName());

        response.setUser(userSuccess);
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getAllUsers(UserOuterClass.Empty request, StreamObserver<UserOuterClass.AllUsersResponse> responseObserver) {

    }

    @Override
    public void update(UserOuterClass.UserRequest request, StreamObserver<UserOuterClass.UserResponse> responseObserver) {

    }

    @Override
    public void delete(UserOuterClass.UserIdRequest request, StreamObserver<UserOuterClass.UserResponse> responseObserver) {

    }
}
