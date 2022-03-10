using UnityEngine;

public class ObjectSpawn : MonoBehaviour
{
    public GameObject objectToSpawn;
    private PlacementIndicator placementIndicator;
    // Start is called before the first frame update
    void Start()
    {
        placementIndicator = FindObjectOfType<PlacementIndicator>();

    }

    // Update is called once per frame
    void Update()
    {
        if (Input.touchCount > 0 && Input.touches[0].phase == TouchPhase.Began) //checking for where your finger touches and are there more than 0 touches? 
                                                                             //is this the first frame it touches?
                                                                            //optimizes priority of frame for object to not spawn multiple
        {
            GameObject obj = Instantiate(objectToSpawn,
            placementIndicator.transform.position, placementIndicator.transform.rotation);
        }
    }
}
