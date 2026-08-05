package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.Climate.Sampler.class)
public class Sampler_462042861Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1847555119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1847555119L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__673417115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-673417115L))
            info.setReturnValue("\uD306$Hr$b#VN,[8LF96o9J\u71CD\u0F5Bd`z_zA (Y\"PjPiHE!,9`-");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_500305602(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(500305602L))
            info.setReturnValue(1539479122);
    }

    @Inject(at = @At("HEAD"), method = "depth()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void depth_1941082529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1941082529L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "continentalness()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void continentalness_1941082529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1941082529L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findSpawnPosition()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void findSpawnPosition__1431344019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1431344019L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "erosion()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void erosion_1941082529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1941082529L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "humidity()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void humidity_1941082529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1941082529L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "weirdness()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void weirdness_1941082529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1941082529L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sample(III)Lnet/minecraft/world/level/biome/Climate$TargetPoint;", cancellable = true)
    private void sample_510628116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(510628116L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "temperature()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void temperature_1941082529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1941082529L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnTarget()Ljava/util/List;", cancellable = true)
    private void spawnTarget_2088379676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2088379676L))
            info.setReturnValue(null);
    }


}
