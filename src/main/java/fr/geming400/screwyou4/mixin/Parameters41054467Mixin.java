package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetPlayerTeamPacket.Parameters.class)
public class Parameters41054467Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1426566726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1426566726L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1094405508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1094405508L))
            info.setReturnValue("@㜆vu}UQ5%㗬+.%F+;i庿yꈺe3Fn`E:<彞!nRv>MQi3FB'U**rt(⇣daHr鞩]OL!VFS5>(xg톰L9x!!Ot:$^Qu=.");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_79317209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(79317209L))
            info.setReturnValue(1237237330);
    }

    @Inject(at = @At("HEAD"), method = "options()B", cancellable = true)
    private void options_79309986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(79309986L))
            info.setReturnValue(-58);
    }

    @Inject(at = @At("HEAD"), method = "color()Ljava/util/Optional;", cancellable = true)
    private void color_286515889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(286515889L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "displayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void displayName__2135854698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2135854698L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerPrefix()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void playerPrefix__2135854698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2135854698L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nameTagVisibility()Lnet/minecraft/world/scores/Team$Visibility;", cancellable = true)
    private void nameTagVisibility__1715713739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1715713739L))
            info.setReturnValue(net.minecraft.world.scores.Team.Visibility.HIDE_FOR_OWN_TEAM);
    }

    @Inject(at = @At("HEAD"), method = "playerSuffix()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void playerSuffix__2135854698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2135854698L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "collisionRule()Lnet/minecraft/world/scores/Team$CollisionRule;", cancellable = true)
    private void collisionRule__236026749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-236026749L))
            info.setReturnValue(net.minecraft.world.scores.Team.CollisionRule.ALWAYS);
    }


}
