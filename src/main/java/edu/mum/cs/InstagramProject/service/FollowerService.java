package edu.mum.cs.InstagramProject.service;

import java.util.List;

import edu.mum.cs.InstagramProject.domain.Follower;

public interface FollowerService {
	public Follower getFollower(String postId);

	public Follower saveFollower(Follower follower);

	public Follower updateFollower(Follower follower);

	public Follower deleteFollower(String postId);

	public List<Follower> getFollowerList(String followerID);

}
