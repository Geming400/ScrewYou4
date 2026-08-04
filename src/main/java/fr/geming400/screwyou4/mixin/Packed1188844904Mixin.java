package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.scores.PlayerTeam.Packed.class)
public class Packed1188844904Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_53384433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(53384433L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1720610133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1720610133L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_53384929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(53384929L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1227107646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1227107646L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "color()Ljava/util/Optional;", cancellable = true)
    private void color_1434306326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1434306326L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "displayName()Ljava/util/Optional;", cancellable = true)
    private void displayName_1434306326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1434306326L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "collisionRule()Lnet/minecraft/world/scores/Team$CollisionRule;", cancellable = true)
    private void collisionRule_911763688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(911763688L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nameTagVisibility()Lnet/minecraft/world/scores/Team$Visibility;", cancellable = true)
    private void nameTagVisibility__567923302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-567923302L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "players()Ljava/util/List;", cancellable = true)
    private void players__1479785576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1479785576L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "memberNameSuffix()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void memberNameSuffix__988064261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-988064261L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deathMessageVisibility()Lnet/minecraft/world/scores/Team$Visibility;", cancellable = true)
    private void deathMessageVisibility__567923302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-567923302L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "seeFriendlyInvisibles()Z", cancellable = true)
    private void seeFriendlyInvisibles_1227123487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1227123487L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allowFriendlyFire()Z", cancellable = true)
    private void allowFriendlyFire_1227123487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1227123487L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "memberNamePrefix()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void memberNamePrefix__988064261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-988064261L))
            info.setReturnValue(null);
    }


}
