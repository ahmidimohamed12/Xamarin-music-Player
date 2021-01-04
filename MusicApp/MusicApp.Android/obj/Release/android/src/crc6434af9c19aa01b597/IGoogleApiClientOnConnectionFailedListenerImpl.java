package crc6434af9c19aa01b597;


public class IGoogleApiClientOnConnectionFailedListenerImpl
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onConnectionFailed:(Lcom/google/android/gms/common/ConnectionResult;)V:GetOnConnectionFailed_Lcom_google_android_gms_common_ConnectionResult_Handler:Android.Gms.Common.Apis.IGoogleApiClientOnConnectionFailedListenerInvoker, Xamarin.GooglePlayServices.Base\n" +
			"";
		mono.android.Runtime.register ("Android.Gms.Common.Apis.IGoogleApiClientOnConnectionFailedListenerImpl, Xamarin.GooglePlayServices.Base", IGoogleApiClientOnConnectionFailedListenerImpl.class, __md_methods);
	}


	public IGoogleApiClientOnConnectionFailedListenerImpl ()
	{
		super ();
		if (getClass () == IGoogleApiClientOnConnectionFailedListenerImpl.class)
			mono.android.TypeManager.Activate ("Android.Gms.Common.Apis.IGoogleApiClientOnConnectionFailedListenerImpl, Xamarin.GooglePlayServices.Base", "", this, new java.lang.Object[] {  });
	}


	public void onConnectionFailed (com.google.android.gms.common.ConnectionResult p0)
	{
		n_onConnectionFailed (p0);
	}

	private native void n_onConnectionFailed (com.google.android.gms.common.ConnectionResult p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
