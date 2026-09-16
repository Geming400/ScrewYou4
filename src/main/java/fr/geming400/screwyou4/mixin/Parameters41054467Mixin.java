package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetPlayerTeamPacket.Parameters.class)
public class Parameters41054467Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__867571801(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-867571801L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_811477992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(811477992L))
            info.setReturnValue("f");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_598406558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(598406558L))
            info.setReturnValue(888967822);
    }

    @Inject(at = @At("HEAD"), method = "options()B", cancellable = true)
    private void options__1980426044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1980426044L))
            info.setReturnValue(-62);
    }

    @Inject(at = @At("HEAD"), method = "color()Ljava/util/Optional;", cancellable = true)
    private void color_1317787924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1317787924L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "displayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void displayName_1351479235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1351479235L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerPrefix()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void playerPrefix__2112387415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2112387415L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "collisionRule()Lnet/minecraft/world/scores/Team$CollisionRule;", cancellable = true)
    private void collisionRule_242189429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(242189429L))
            info.setReturnValue(net.minecraft.world.scores.Team.CollisionRule.NEVER);
    }

    @Inject(at = @At("HEAD"), method = "playerSuffix()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void playerSuffix_1230859432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1230859432L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nameTagVisibility()Lnet/minecraft/world/scores/Team$Visibility;", cancellable = true)
    private void nameTagVisibility__989980490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-989980490L))
            info.setReturnValue(net.minecraft.world.scores.Team.Visibility.ALWAYS);
    }


}
