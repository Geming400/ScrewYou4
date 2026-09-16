package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.pools.alias.RandomGroupPoolAlias.class)
public class RandomGroupPoolAlias_814447410Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__94178859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-94178859L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1584870934(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1584870934L))
            info.setReturnValue("\u5068<Gc*4}Y)bZk2\u8EA4$4yrl5\u0D289\"+EOiGvU)X=TqgG\uB1299i\uBEF9fHl-\uB850gF\u38FE[\"rX\u647Eg;{E%d$f");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1371799500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1371799500L))
            info.setReturnValue(-1945130612);
    }

    @Inject(at = @At("HEAD"), method = "groups()Lnet/minecraft/util/random/WeightedList;", cancellable = true)
    private void groups_1930990187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1930990187L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forEachResolved(Lnet/minecraft/util/RandomSource;Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void forEachResolved__2099881371(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2099881371L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1880892663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1880892663L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allTargets()Ljava/util/stream/Stream;", cancellable = true)
    private void allTargets_535266085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(535266085L))
            info.setReturnValue(null);
    }


}
