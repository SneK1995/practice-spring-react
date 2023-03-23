import React, { useEffect, useState } from 'react';
import { restGetCall } from '../RestApi/RestCall';

const PracticeComponent = () => {

    const [users, setUsers] = useState([]);

    useEffect(() => {
        let requestUrl = "http://localhost:9000/practice/getAllUsers";
        restGetCall(requestUrl, {}, callbackApi);
    }, []);

    const callbackApi = (response) => {
        console.log("API response ==>", response);
        setUsers(response);
    }
    
    if(users.length > 0) {
        return (
            <React.Fragment>
                All Users present in the Database = {JSON.stringify(users)}
            </React.Fragment>
        )
    } else {
        return null;
    }
}

export default PracticeComponent;