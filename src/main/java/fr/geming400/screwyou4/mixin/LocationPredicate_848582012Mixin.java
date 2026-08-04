package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.LocationPredicate.class)
public class LocationPredicate_848582012Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2060873026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2060873026L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__286877964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-286877964L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_886844753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(886844753L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "position()Ljava/util/Optional;", cancellable = true)
    private void position_1094043433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1094043433L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/server/level/ServerLevel;DDD)Z", cancellable = true)
    private void matches__147847115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-147847115L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "block()Ljava/util/Optional;", cancellable = true)
    private void block_1094043433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1094043433L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "biomes()Ljava/util/Optional;", cancellable = true)
    private void biomes_1094043433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1094043433L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canSeeSky()Ljava/util/Optional;", cancellable = true)
    private void canSeeSky_1094043433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1094043433L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dimension()Ljava/util/Optional;", cancellable = true)
    private void dimension_1094043433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1094043433L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "structures()Ljava/util/Optional;", cancellable = true)
    private void structures_1094043433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1094043433L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "smokey()Ljava/util/Optional;", cancellable = true)
    private void smokey_1094043433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1094043433L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "light()Ljava/util/Optional;", cancellable = true)
    private void light_1094043433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1094043433L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fluid()Ljava/util/Optional;", cancellable = true)
    private void fluid_1094043433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1094043433L))
            info.setReturnValue(null);
    }


}
