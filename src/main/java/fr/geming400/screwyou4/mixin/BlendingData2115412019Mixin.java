package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.blending.BlendingData.class)
public class BlendingData2115412019Mixin {
        @Inject(at = @At("HEAD"), method = "pack()Lnet/minecraft/world/level/levelgen/blending/BlendingData$Packed;", cancellable = true)
    private void pack__1255736844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1255736844L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lnet/minecraft/world/level/levelgen/blending/BlendingData$Packed;)Lnet/minecraft/world/level/levelgen/blending/BlendingData;", cancellable = true)
    private static void unpack__381193048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-381193048L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOrUpdateBlendingData(Lnet/minecraft/server/level/WorldGenRegion;II)Lnet/minecraft/world/level/levelgen/blending/BlendingData;", cancellable = true)
    private static void getOrUpdateBlendingData_66028936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(66028936L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAreaWithOldGeneration()Lnet/minecraft/world/level/LevelHeightAccessor;", cancellable = true)
    private void getAreaWithOldGeneration_544056299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(544056299L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sideByGenerationAge(Lnet/minecraft/world/level/WorldGenLevel;IIZ)Ljava/util/Set;", cancellable = true)
    private static void sideByGenerationAge__638554895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-638554895L))
            info.setReturnValue(null);
    }


}
