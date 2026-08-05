package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.ConfiguredFeature.class)
public class ConfiguredFeature_548740678Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1934252936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1934252936L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__586719794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-586719794L))
            info.setReturnValue("f\"<A{uﻝG:m㯾 Zc/I#^ckᔦ㯚⪛)BI䊺椊#j:p]9Ds孬06I^b= %7^aNwM鼼]ጓDLF&A䢢:I&wA[srနh辸mosXi8ሣB (|<uC-\"Y趞&c");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_587003419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(587003419L))
            info.setReturnValue(900280805);
    }

    @Inject(at = @At("HEAD"), method = "config()Lnet/minecraft/world/level/levelgen/feature/configurations/FeatureConfiguration;", cancellable = true)
    private void config_847594849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(847594849L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "feature()Lnet/minecraft/world/level/levelgen/feature/Feature;", cancellable = true)
    private void feature_1839031261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1839031261L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void place__969141368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-969141368L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSubFeatures()Ljava/util/stream/Stream;", cancellable = true)
    private void getSubFeatures_338034362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(338034362L))
            info.setReturnValue(null);
    }


}
