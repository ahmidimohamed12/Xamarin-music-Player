package crc64e4f2de3961e06b46;


public class PlaybackController
	extends com.google.android.exoplayer2.ext.mediasession.DefaultPlaybackController
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("MediaManager.Platforms.Android.Player.PlaybackController, MediaManager", PlaybackController.class, __md_methods);
	}


	public PlaybackController ()
	{
		super ();
		if (getClass () == PlaybackController.class)
			mono.android.TypeManager.Activate ("MediaManager.Platforms.Android.Player.PlaybackController, MediaManager", "", this, new java.lang.Object[] {  });
	}


	public PlaybackController (long p0, long p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == PlaybackController.class)
			mono.android.TypeManager.Activate ("MediaManager.Platforms.Android.Player.PlaybackController, MediaManager", "System.Int64, mscorlib:System.Int64, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}

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
