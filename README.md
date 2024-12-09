# springbootoauth

Oauth- (Open Authorization): 
OAuth 2 is an authorization framework that enables applications — such as Gmail, Facebook, 
GitHub — to obtain limited access to user accounts on an HTTP service. 
It works by delegating user authentication to the service that hosts a user account and authorizing 
third-party applications to access that user account. OAuth 2 provides authorization flows for 
web and desktop applications, as well as mobile devices.

Client ID and Client Secret- 
Once your application is registered, the service will issue client credentials in the form of a 
client identifier and a client secret. The Client ID is a publicly exposed string that is used by 
the service API to identify the application, and is also used to build authorization URLs that are 
presented to users. The Client Secret is used to authenticate the identity of the application to 
the service API when the application requests to access a user’s account, and must be kept private 
between the application and the API.

Google APIs use the OAuth 2.0 protocol for authentication and authorization. Google supports common 
OAuth 2.0 scenarios such as those for web server, client-side, installed, and limited-input device 
applications.

To begin, obtain OAuth 2.0 client credentials from the Google API Console. Then your client 
application requests an access token from the Google Authorization Server, extracts a token from 
the response, and sends the token to the Google API that you want to access.

OAuth (Open Authorization) is a simple way to publish and interact with protected data.

It is an open standard for token-based authentication and authorization on the Internet. 
It allows an end user's account information to be used by third-party services, such as Gmail, 
without exposing the user's password.

Steps-
1. Google Console

2. API & Services

3. Credentials

4. Create OAuth client ID

5. Select as Web Application

6. Give Application Name

7. URI's- http://localhost:9199

8. Redirect URI's- http://localhost:9199/login/oauth2/code/google

9. Click on Create

10. Copy the credentials ID and Secrete

11. Create Spring Boot Project and add Outh Client Dependency



Please use below content in appliaction.yml file-



spring:
  security:
    oauth2:
      client:
        registration:
          google :
            clientId: your_client_id
            clientSecret: your_client_secret





