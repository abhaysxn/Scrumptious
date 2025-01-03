// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package scrumptious.proxies;

public class Photo extends system.proxies.Image
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Scrumptious.Photo";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		PublicThumbnailPath("PublicThumbnailPath"),
		EnableCaching("EnableCaching"),
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		Size("Size"),
		Recipe_Photo("Scrumptious.Recipe_Photo");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Photo(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Photo(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject photoMendixObject)
	{
		super(context, photoMendixObject);
		if (!com.mendix.core.Core.isSubClassOf(entityName, photoMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static scrumptious.proxies.Photo initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new scrumptious.proxies.Photo(context, mendixObject);
	}

	public static scrumptious.proxies.Photo load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return scrumptious.proxies.Photo.initialize(context, mendixObject);
	}

	public static java.util.List<scrumptious.proxies.Photo> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> scrumptious.proxies.Photo.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Recipe_Photo
	 */
	public final scrumptious.proxies.Recipe getRecipe_Photo() throws com.mendix.core.CoreException
	{
		return getRecipe_Photo(getContext());
	}

	/**
	 * @param context
	 * @return value of Recipe_Photo
	 * @throws com.mendix.core.CoreException
	 */
	public final scrumptious.proxies.Recipe getRecipe_Photo(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		scrumptious.proxies.Recipe result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Recipe_Photo.toString());
		if (identifier != null) {
			result = scrumptious.proxies.Recipe.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Recipe_Photo
	 * @param recipe_photo
	 */
	public final void setRecipe_Photo(scrumptious.proxies.Recipe recipe_photo)
	{
		setRecipe_Photo(getContext(), recipe_photo);
	}

	/**
	 * Set value of Recipe_Photo
	 * @param context
	 * @param recipe_photo
	 */
	public final void setRecipe_Photo(com.mendix.systemwideinterfaces.core.IContext context, scrumptious.proxies.Recipe recipe_photo)
	{
		if (recipe_photo == null) {
			getMendixObject().setValue(context, MemberNames.Recipe_Photo.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Recipe_Photo.toString(), recipe_photo.getMendixObject().getId());
		}
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final scrumptious.proxies.Photo that = (scrumptious.proxies.Photo) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

  /**
   * Gives full name ("Module.Entity" name) of the type of the entity.
   *
   * @return the name
   */
	public static java.lang.String getType()
	{
		return entityName;
	}
}
