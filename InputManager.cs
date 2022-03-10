using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.XR.ARFoundation;

public class InputManager : MonoBehaviour
{
    [SerializeField] private GameObject arObj;  //need game object as our "visual object"
    [SerializeField] private Camera arCam;      //reference to camera where we cast our ray from (start point)                  
    [SerializeField] private ARRaycastManager _raycastManager;  //use private and seralizefield in order to assign value to object 
                                                                //to be able to add it into unity inspector (program were using)


    private List<ARRaycastHit> _hits = new List<ARRaycastHit>(); //list created to store all the detected hit points casted by user from raycast manager 

    void Start()
    {

    }


    void Update()
    {
        if (Input.GetMouseButtonDown(0))    //check for user input as to where they touch within their scene
        {
            Ray x = arCam.ScreenPointToRay(Input.mousePosition);  //casts ray from wherever the user is tapping from 
                                                                  //acts as our start point when casting ray (called x), camera needs to read location of the start point

            //take ray x calculated from input and store it into raycast to find hits
            if (_raycastManager.Raycast(x, _hits))
            {
                Pose pose = _hits[0].pose;
                Instantiate(arObj, pose.position, pose.rotation);
            }
        }
    }
}