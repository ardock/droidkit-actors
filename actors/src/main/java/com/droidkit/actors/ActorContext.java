package com.droidkit.actors;

/**
 * Context of actor
 *
 * @author Stepan Ex3NDR Korshakov (me@ex3ndr.com)
 */
public class ActorContext {
    private final ActorScope actorScope;

    /**
     * <p>INTERNAL API</p>
     * <p/>
     * Creating of actor context
     *
     * @param scope actor scope
     */
    public ActorContext(ActorScope scope) {
        this.actorScope = scope;
    }

    /**
     * Actor Reference
     *
     * @return reference
     */
    public ActorRef getSelf() {
        return actorScope.getActorRef();
    }

    /**
     * Actor system
     *
     * @return Actor system
     */
    public ActorSystem getSystem() {
        return actorScope.getActorSystem();
    }


    public ActorRef sender() {
        return actorScope.getSender();
    }

    /**
     * Stopping actor
     */
    public void stopSelf() {
        try {
            actorScope.shutdownActor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
