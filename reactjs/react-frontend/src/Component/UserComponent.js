import React from 'react';
import UserService from '../Service/UserService';

class UserComponent extends React.Component {

    constructor(props){
        super(props)
        this.state = {
            users:[]
        }
    }

    componentDidMount(){
        UserService.getUsers().then((response) => {
            this.setState({ users: response.data})
        }
        
        );
    }

    render (){
        return (
            <div>
                <h1 className = "text-center"> Kullanıcılar</h1>
                <table className = "table table-striped">
                    <thead>
                        <tr>

                            <td> ID</td>
                            
                            <td> İsim</td>
                            
                            <td> Soy İsim</td>
                            
                            <td> e-mail </td>

                            <td> Tel No </td>
                            

                        </tr>

                    </thead>
                    <tbody>
                        {
                            this.state.users.map(
                                user => 
                                
                                <tr key = {user.id}>
                                    
                                     <td> {user.id}</td>  
                                     
                                     <td> {user.ad}</td> 
                                     
                                     <td> {user.soy_isim}</td>
                                     
                                     <td> {user.email}</td> 

                                     <td> {user.telNo}</td>  
                                     
                                </tr>
                            )
                        }

                    </tbody>
                </table>

            </div>

        )
    }
}

export default UserComponent