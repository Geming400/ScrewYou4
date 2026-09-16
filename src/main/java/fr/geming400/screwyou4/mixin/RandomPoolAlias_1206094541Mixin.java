package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.pools.alias.RandomPoolAlias.class)
public class RandomPoolAlias_1206094541Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_297468272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(297468272L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1976518065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1976518065L))
            info.setReturnValue("D=,,E0G\u5CBBc\u00E5");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1763446631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1763446631L))
            info.setReturnValue(1287246114);
    }

    @Inject(at = @At("HEAD"), method = "targets()Lnet/minecraft/util/random/WeightedList;", cancellable = true)
    private void targets_996604980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(996604980L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "alias()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void alias_493610925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(493610925L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forEachResolved(Lnet/minecraft/util/RandomSource;Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void forEachResolved__1708234240(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1708234240L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2022427502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2022427502L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allTargets()Ljava/util/stream/Stream;", cancellable = true)
    private void allTargets_926913216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(926913216L))
            info.setReturnValue(null);
    }


}
