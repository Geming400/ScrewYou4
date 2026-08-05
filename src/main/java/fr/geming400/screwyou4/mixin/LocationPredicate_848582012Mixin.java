package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.LocationPredicate.class)
public class LocationPredicate_848582012Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__60044257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-60044257L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1619005536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1619005536L))
            info.setReturnValue("krU@ 4-rOVU)Sz3;2sAK6[(TVNz\u234C s.-3\u53F2B[-<6\uBCD9K=\u51A4YC\u7974YC^U");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1405934102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1405934102L))
            info.setReturnValue(1312067040);
    }

    @Inject(at = @At("HEAD"), method = "position()Ljava/util/Optional;", cancellable = true)
    private void position_1636414802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1636414802L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/server/level/ServerLevel;DDD)Z", cancellable = true)
    private void matches__1054720152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1054720152L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "block()Ljava/util/Optional;", cancellable = true)
    private void block_2069623990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2069623990L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "light()Ljava/util/Optional;", cancellable = true)
    private void light_712022591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(712022591L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "structures()Ljava/util/Optional;", cancellable = true)
    private void structures__1658312567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1658312567L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canSeeSky()Ljava/util/Optional;", cancellable = true)
    private void canSeeSky__555941657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-555941657L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dimension()Ljava/util/Optional;", cancellable = true)
    private void dimension_2063131279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2063131279L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fluid()Ljava/util/Optional;", cancellable = true)
    private void fluid__431504653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-431504653L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "biomes()Ljava/util/Optional;", cancellable = true)
    private void biomes_1672145404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1672145404L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "smokey()Ljava/util/Optional;", cancellable = true)
    private void smokey__1159623149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1159623149L))
            info.setReturnValue(null);
    }


}
