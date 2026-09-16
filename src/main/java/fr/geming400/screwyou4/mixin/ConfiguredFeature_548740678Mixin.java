package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.ConfiguredFeature.class)
public class ConfiguredFeature_548740678Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__359885591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-359885591L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1319163706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1319163706L))
            info.setReturnValue(".<,&]GF\"$\u1F4D\u8FA5D{y(L@-|9r:/J");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1106092768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1106092768L))
            info.setReturnValue(937575560);
    }

    @Inject(at = @At("HEAD"), method = "config()Lnet/minecraft/world/level/levelgen/feature/configurations/FeatureConfiguration;", cancellable = true)
    private void config__1153334365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1153334365L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "feature()Lnet/minecraft/world/level/levelgen/feature/Feature;", cancellable = true)
    private void feature__1916107565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1916107565L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSubFeatures()Ljava/util/stream/Stream;", cancellable = true)
    private void getSubFeatures__258400589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-258400589L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void place_2091465743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2091465743L))
            info.setReturnValue(true);
    }


}
