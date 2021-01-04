package crc64e4f2de3961e06b46;


public class MediaSessionConnectorPlaybackPreparer
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.PlaybackPreparer,
		com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.CommandReceiver
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getSupportedPrepareActions:()J:GetGetSupportedPrepareActionsHandler:Com.Google.Android.Exoplayer2.Ext.Mediasession.MediaSessionConnector/IPlaybackPreparerInvoker, ExoPlayer.Ext.MediaSession\n" +
			"n_onPrepare:()V:GetOnPrepareHandler:Com.Google.Android.Exoplayer2.Ext.Mediasession.MediaSessionConnector/IPlaybackPreparerInvoker, ExoPlayer.Ext.MediaSession\n" +
			"n_onPrepareFromMediaId:(Ljava/lang/String;Landroid/os/Bundle;)V:GetOnPrepareFromMediaId_Ljava_lang_String_Landroid_os_Bundle_Handler:Com.Google.Android.Exoplayer2.Ext.Mediasession.MediaSessionConnector/IPlaybackPreparerInvoker, ExoPlayer.Ext.MediaSession\n" +
			"n_onPrepareFromSearch:(Ljava/lang/String;Landroid/os/Bundle;)V:GetOnPrepareFromSearch_Ljava_lang_String_Landroid_os_Bundle_Handler:Com.Google.Android.Exoplayer2.Ext.Mediasession.MediaSessionConnector/IPlaybackPreparerInvoker, ExoPlayer.Ext.MediaSession\n" +
			"n_onPrepareFromUri:(Landroid/net/Uri;Landroid/os/Bundle;)V:GetOnPrepareFromUri_Landroid_net_Uri_Landroid_os_Bundle_Handler:Com.Google.Android.Exoplayer2.Ext.Mediasession.MediaSessionConnector/IPlaybackPreparerInvoker, ExoPlayer.Ext.MediaSession\n" +
			"n_getCommands:()[Ljava/lang/String;:GetGetCommandsHandler:Com.Google.Android.Exoplayer2.Ext.Mediasession.MediaSessionConnector/ICommandReceiverInvoker, ExoPlayer.Ext.MediaSession\n" +
			"n_onCommand:(Lcom/google/android/exoplayer2/Player;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V:GetOnCommand_Lcom_google_android_exoplayer2_Player_Ljava_lang_String_Landroid_os_Bundle_Landroid_os_ResultReceiver_Handler:Com.Google.Android.Exoplayer2.Ext.Mediasession.MediaSessionConnector/ICommandReceiverInvoker, ExoPlayer.Ext.MediaSession\n" +
			"";
		mono.android.Runtime.register ("MediaManager.Platforms.Android.Player.MediaSessionConnectorPlaybackPreparer, MediaManager", MediaSessionConnectorPlaybackPreparer.class, __md_methods);
	}


	public MediaSessionConnectorPlaybackPreparer ()
	{
		super ();
		if (getClass () == MediaSessionConnectorPlaybackPreparer.class)
			mono.android.TypeManager.Activate ("MediaManager.Platforms.Android.Player.MediaSessionConnectorPlaybackPreparer, MediaManager", "", this, new java.lang.Object[] {  });
	}

	public MediaSessionConnectorPlaybackPreparer (com.google.android.exoplayer2.ExoPlayer p0, com.google.android.exoplayer2.source.ConcatenatingMediaSource p1)
	{
		super ();
		if (getClass () == MediaSessionConnectorPlaybackPreparer.class)
			mono.android.TypeManager.Activate ("MediaManager.Platforms.Android.Player.MediaSessionConnectorPlaybackPreparer, MediaManager", "Com.Google.Android.Exoplayer2.IExoPlayer, ExoPlayer.Core:Com.Google.Android.Exoplayer2.Source.ConcatenatingMediaSource, ExoPlayer.Core", this, new java.lang.Object[] { p0, p1 });
	}


	public long getSupportedPrepareActions ()
	{
		return n_getSupportedPrepareActions ();
	}

	private native long n_getSupportedPrepareActions ();


	public void onPrepare ()
	{
		n_onPrepare ();
	}

	private native void n_onPrepare ();


	public void onPrepareFromMediaId (java.lang.String p0, android.os.Bundle p1)
	{
		n_onPrepareFromMediaId (p0, p1);
	}

	private native void n_onPrepareFromMediaId (java.lang.String p0, android.os.Bundle p1);


	public void onPrepareFromSearch (java.lang.String p0, android.os.Bundle p1)
	{
		n_onPrepareFromSearch (p0, p1);
	}

	private native void n_onPrepareFromSearch (java.lang.String p0, android.os.Bundle p1);


	public void onPrepareFromUri (android.net.Uri p0, android.os.Bundle p1)
	{
		n_onPrepareFromUri (p0, p1);
	}

	private native void n_onPrepareFromUri (android.net.Uri p0, android.os.Bundle p1);


	public java.lang.String[] getCommands ()
	{
		return n_getCommands ();
	}

	private native java.lang.String[] n_getCommands ();


	public void onCommand (com.google.android.exoplayer2.Player p0, java.lang.String p1, android.os.Bundle p2, android.os.ResultReceiver p3)
	{
		n_onCommand (p0, p1, p2, p3);
	}

	private native void n_onCommand (com.google.android.exoplayer2.Player p0, java.lang.String p1, android.os.Bundle p2, android.os.ResultReceiver p3);

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
