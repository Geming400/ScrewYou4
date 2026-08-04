package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.MultiNoiseBiomeSource.class)
public class MultiNoiseBiomeSource_1824742516Mixin {
        @Inject(at = @At("HEAD"), method = "stable(Lnet/minecraft/resources/ResourceKey;)Z", cancellable = true)
    private void stable_2012415662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2012415662L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addDebugInfo(Ljava/util/List;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/biome/Climate$Sampler;)V", cancellable = true)
    private void addDebugInfo__341259012(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-341259012L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createFromList(Lnet/minecraft/world/level/biome/Climate$ParameterList;)Lnet/minecraft/world/level/biome/MultiNoiseBiomeSource;", cancellable = true)
    private static void createFromList_1932145242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1932145242L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNoiseBiome(IIILnet/minecraft/world/level/biome/Climate$Sampler;)Lnet/minecraft/core/Holder;", cancellable = true)
    private void getNoiseBiome__1090821009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1090821009L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNoiseBiome(Lnet/minecraft/world/level/biome/Climate$TargetPoint;)Lnet/minecraft/core/Holder;", cancellable = true)
    private void getNoiseBiome_2011764497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2011764497L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFromPreset(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/level/biome/MultiNoiseBiomeSource;", cancellable = true)
    private static void createFromPreset_234159919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(234159919L))
            info.setReturnValue(null);
    }


}
