package com.interrupt.dungeoneer.gfx.animation.lerp3d;

import com.badlogic.gdx.math.Vector3;

public class LerpFrame {
	public Vector3 transform;
	public Vector3 rotation;
	public float length = 1f;
	public LerpFrame() { }
	public LerpFrame(Vector3 transform, Vector3 rotation) { this.transform = transform; this.rotation = rotation; }
	public LerpFrame(Vector3 transform, Vector3 rotation, float length) { this.transform = transform; this.rotation = rotation; this.length = length; }
}
