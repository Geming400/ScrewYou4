package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.MultiNoiseBiomeSource.class)
public class MultiNoiseBiomeSource_1824742516Mixin {
        @Inject(at = @At("HEAD"), method = "stable(Lnet/minecraft/resources/ResourceKey;)Z", cancellable = true)
    private void stable__810067927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-810067927L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "addDebugInfo(Ljava/util/List;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/biome/Climate$Sampler;)V", cancellable = true)
    private void addDebugInfo_367571708(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(367571708L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createFromPreset(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/level/biome/MultiNoiseBiomeSource;", cancellable = true)
    private static void createFromPreset__1981196620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1981196620L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFromList(Lnet/minecraft/world/level/biome/Climate$ParameterList;)Lnet/minecraft/world/level/biome/MultiNoiseBiomeSource;", cancellable = true)
    private static void createFromList_1971915230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1971915230L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNoiseBiome(IIILnet/minecraft/world/level/biome/Climate$Sampler;)Lnet/minecraft/core/Holder;", cancellable = true)
    private void getNoiseBiome__1478632109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1478632109L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNoiseBiome(Lnet/minecraft/world/level/biome/Climate$TargetPoint;)Lnet/minecraft/core/Holder;", cancellable = true)
    private void getNoiseBiome__1420445011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1420445011L))
            info.setReturnValue(null);
    }


}
