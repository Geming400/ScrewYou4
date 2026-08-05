package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.Climate.Sampler.class)
public class Sampler_462042861Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__446583408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-446583408L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1232466385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1232466385L))
            info.setReturnValue("V\u1022bYG\u81BCKCeJ{DSN\u5AFFj|2rmb15n[c5,v?,H<p\uC7E2<)o,yuTl.pzsw'1[<3g14&>lI\u45815mjs),HQV}9Z\"T/S'$`. P\u5238");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1019394951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1019394951L))
            info.setReturnValue(245428962);
    }

    @Inject(at = @At("HEAD"), method = "depth()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void depth_406861668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(406861668L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "temperature()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void temperature_81816341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(81816341L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sample(III)Lnet/minecraft/world/level/biome/Climate$TargetPoint;", cancellable = true)
    private void sample__1070720066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1070720066L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findSpawnPosition()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void findSpawnPosition_1057559874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1057559874L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "continentalness()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void continentalness__697067689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-697067689L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnTarget()Ljava/util/List;", cancellable = true)
    private void spawnTarget__231669752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-231669752L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "humidity()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void humidity__2030364332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2030364332L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "erosion()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void erosion_919488440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(919488440L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "weirdness()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void weirdness__1863049147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1863049147L))
            info.setReturnValue(null);
    }


}
