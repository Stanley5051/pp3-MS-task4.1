package com.itm.space.backendresources.mapper;

import com.itm.space.backendresources.api.response.UserResponse;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;
import org.keycloak.representations.idm.GroupRepresentation;
import org.keycloak.representations.idm.RoleRepresentation;
import org.keycloak.representations.idm.UserRepresentation;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-22T16:27:07+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19.0.2 (Amazon.com Inc.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserResponse userRepresentationToUserResponse(UserRepresentation userRepresentation, List<RoleRepresentation> roleList, List<GroupRepresentation> groupList) {
        if ( userRepresentation == null && roleList == null && groupList == null ) {
            return null;
        }

        UserResponse.UserResponseBuilder userResponse = UserResponse.builder();

        if ( userRepresentation != null ) {
            userResponse.firstName( userRepresentation.getFirstName() );
            userResponse.lastName( userRepresentation.getLastName() );
            userResponse.email( userRepresentation.getEmail() );
        }
        userResponse.roles( mapRoleRepresentationToString( roleList ) );
        userResponse.groups( mapGroupRepresentationToString( groupList ) );

        return userResponse.build();
    }
}
