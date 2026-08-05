package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.scores.PlayerTeam.class)
public class PlayerTeam_1432391890Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName_296931418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(296931418L))
            info.setReturnValue("?HE믛d難h_^sS^A9Y)䰹ldKv]BTGP놳㻵TA;]_mKa랴Yc6..ᅤ<4n맩?*M1尀Uu2!k");
    }

    @Inject(at = @At("HEAD"), method = "getDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDisplayName__744517276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-744517276L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setColor(Ljava/util/Optional;)V", cancellable = true)
    private void setColor_1906709171(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1906709171L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pack()Lnet/minecraft/world/scores/PlayerTeam$Packed;", cancellable = true)
    private void pack__773130466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-773130466L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getColor()Ljava/util/Optional;", cancellable = true)
    private void getColor_1677853311(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1677853311L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDeathMessageVisibility()Lnet/minecraft/world/scores/Team$Visibility;", cancellable = true)
    private void getDeathMessageVisibility__324376317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-324376317L))
            info.setReturnValue(net.minecraft.world.scores.Team.Visibility.ALWAYS);
    }

    @Inject(at = @At("HEAD"), method = "getCollisionRule()Lnet/minecraft/world/scores/Team$CollisionRule;", cancellable = true)
    private void getCollisionRule_1155310673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1155310673L))
            info.setReturnValue(net.minecraft.world.scores.Team.CollisionRule.NEVER);
    }

    @Inject(at = @At("HEAD"), method = "getNameTagVisibility()Lnet/minecraft/world/scores/Team$Visibility;", cancellable = true)
    private void getNameTagVisibility__324376317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-324376317L))
            info.setReturnValue(net.minecraft.world.scores.Team.Visibility.ALWAYS);
    }

    @Inject(at = @At("HEAD"), method = "getFormattedName(Lnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void getFormattedName__1119530640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1119530640L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpackOptions(B)V", cancellable = true)
    private void unpackOptions__1655123082(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1655123082L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "packOptions()B", cancellable = true)
    private void packOptions_1470647408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1470647408L))
            info.setReturnValue(101);
    }

    @Inject(at = @At("HEAD"), method = "setPlayerPrefix(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setPlayerPrefix__468787048(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-468787048L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPlayerSuffix(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setPlayerSuffix__468787048(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-468787048L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFormattedDisplayName()Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void getFormattedDisplayName__975612324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-975612324L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setNameTagVisibility(Lnet/minecraft/world/scores/Team$Visibility;)V", cancellable = true)
    private void setNameTagVisibility_2112398135(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2112398135L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDisplayName(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setDisplayName__468787048(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-468787048L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSeeFriendlyInvisibles(Z)V", cancellable = true)
    private void setSeeFriendlyInvisibles__1632958578(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1632958578L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDeathMessageVisibility(Lnet/minecraft/world/scores/Team$Visibility;)V", cancellable = true)
    private void setDeathMessageVisibility_2112398135(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2112398135L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setAllowFriendlyFire(Z)V", cancellable = true)
    private void setAllowFriendlyFire__1632958578(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1632958578L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPlayerSuffix()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getPlayerSuffix__744517276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-744517276L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setCollisionRule(Lnet/minecraft/world/scores/Team$CollisionRule;)V", cancellable = true)
    private void setCollisionRule_360741719(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(360741719L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPlayerPrefix()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getPlayerPrefix__744517276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-744517276L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getScoreboard()Lnet/minecraft/world/scores/Scoreboard;", cancellable = true)
    private void getScoreboard_451146436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(451146436L))
            info.setReturnValue(new net.minecraft.world.scores.Scoreboard());
    }

    @Inject(at = @At("HEAD"), method = "canSeeFriendlyInvisibles()Z", cancellable = true)
    private void canSeeFriendlyInvisibles_1470670472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1470670472L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "formatNameForTeam(Lnet/minecraft/world/scores/Team;Lnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private static void formatNameForTeam_140011461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(140011461L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAllowFriendlyFire()Z", cancellable = true)
    private void isAllowFriendlyFire_1470670472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1470670472L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getPlayers()Ljava/util/Collection;", cancellable = true)
    private void getPlayers__381256383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-381256383L))
            info.setReturnValue(null);
    }


}
