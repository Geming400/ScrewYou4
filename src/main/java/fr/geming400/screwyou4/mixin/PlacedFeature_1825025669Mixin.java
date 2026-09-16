package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.placement.PlacedFeature.class)
public class PlacedFeature_1825025669Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_916399400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(916399400L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1699518599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1699518599L))
            info.setReturnValue("o.7T\u66B1h4<H  \u1544`\u2E39j\u9002Y,5QzOJ\u9FE2='9M!\u664AC\u43FE\u52896MD\"'/NU{T\u64BC");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1912589537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1912589537L))
            info.setReturnValue(996258823);
    }

    @Inject(at = @At("HEAD"), method = "feature()Lnet/minecraft/core/Holder;", cancellable = true)
    private void feature__1408938806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1408938806L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "placement()Ljava/util/List;", cancellable = true)
    private void placement_598493977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(598493977L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFeatures()Ljava/util/stream/Stream;", cancellable = true)
    private void getFeatures_1911361062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1911361062L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "placeWithBiomeCheck(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void placeWithBiomeCheck__1578378020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1578378020L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void place__927216562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-927216562L))
            info.setReturnValue(true);
    }


}
