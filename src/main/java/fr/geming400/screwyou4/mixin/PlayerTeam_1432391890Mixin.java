package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.scores.PlayerTeam.class)
public class PlayerTeam_1432391890Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__456455013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-456455013L))
            info.setReturnValue("3Ov(J|W[\uA326neKk\u01E59GNCK,$X3EB3\u365Avu8Pgh{7[e7x\"");
    }

    @Inject(at = @At("HEAD"), method = "getDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDisplayName__1682163237(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1682163237L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setColor(Ljava/util/Optional;)V", cancellable = true)
    private void setColor__1979393614(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1979393614L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pack()Lnet/minecraft/world/scores/PlayerTeam$Packed;", cancellable = true)
    private void pack__1223114505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1223114505L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAllowFriendlyFire()Z", cancellable = true)
    private void isAllowFriendlyFire_1690468136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1690468136L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "formatNameForTeam(Lnet/minecraft/world/scores/Team;Lnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private static void formatNameForTeam__1976140535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1976140535L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canSeeFriendlyInvisibles()Z", cancellable = true)
    private void canSeeFriendlyInvisibles__42374700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-42374700L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getDeathMessageVisibility()Lnet/minecraft/world/scores/Team$Visibility;", cancellable = true)
    private void getDeathMessageVisibility_296559710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(296559710L))
            info.setReturnValue(net.minecraft.world.scores.Team.Visibility.ALWAYS);
    }

    @Inject(at = @At("HEAD"), method = "getScoreboard()Lnet/minecraft/world/scores/Scoreboard;", cancellable = true)
    private void getScoreboard_1295133946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1295133946L))
            info.setReturnValue(new net.minecraft.world.scores.Scoreboard());
    }

    @Inject(at = @At("HEAD"), method = "getColor()Ljava/util/Optional;", cancellable = true)
    private void getColor__788799188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-788799188L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayers()Ljava/util/Collection;", cancellable = true)
    private void getPlayers_1127897021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1127897021L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFormattedDisplayName()Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void getFormattedDisplayName_438924469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(438924469L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPlayerPrefix(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setPlayerPrefix__1821949149(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1821949149L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDisplayName(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setDisplayName__495471859(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-495471859L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSeeFriendlyInvisibles(Z)V", cancellable = true)
    private void setSeeFriendlyInvisibles_132326896(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(132326896L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPlayerPrefix()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getPlayerPrefix__456473235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-456473235L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPlayerSuffix(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setPlayerSuffix__1260511996(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1260511996L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPlayerSuffix()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getPlayerSuffix__1408193684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1408193684L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setNameTagVisibility(Lnet/minecraft/world/scores/Team$Visibility;)V", cancellable = true)
    private void setNameTagVisibility_665050072(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(665050072L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNameTagVisibility()Lnet/minecraft/world/scores/Team$Visibility;", cancellable = true)
    private void getNameTagVisibility_555566030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(555566030L))
            info.setReturnValue(net.minecraft.world.scores.Team.Visibility.ALWAYS);
    }

    @Inject(at = @At("HEAD"), method = "setDeathMessageVisibility(Lnet/minecraft/world/scores/Team$Visibility;)V", cancellable = true)
    private void setDeathMessageVisibility_914948272(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(914948272L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFormattedName(Lnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void getFormattedName_1682367647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1682367647L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setAllowFriendlyFire(Z)V", cancellable = true)
    private void setAllowFriendlyFire__189991754(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-189991754L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCollisionRule()Lnet/minecraft/world/scores/Team$CollisionRule;", cancellable = true)
    private void getCollisionRule_530122681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(530122681L))
            info.setReturnValue(net.minecraft.world.scores.Team.CollisionRule.ALWAYS);
    }

    @Inject(at = @At("HEAD"), method = "setCollisionRule(Lnet/minecraft/world/scores/Team$CollisionRule;)V", cancellable = true)
    private void setCollisionRule__411543197(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-411543197L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "unpackOptions(B)V", cancellable = true)
    private void unpackOptions_1321992322(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1321992322L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "packOptions()B", cancellable = true)
    private void packOptions__1406430901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1406430901L))
            info.setReturnValue(29);
    }


}
