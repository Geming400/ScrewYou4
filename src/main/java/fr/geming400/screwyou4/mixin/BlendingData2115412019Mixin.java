package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.blending.BlendingData.class)
public class BlendingData2115412019Mixin {
        @Inject(at = @At("HEAD"), method = "pack()Lnet/minecraft/world/level/levelgen/blending/BlendingData$Packed;", cancellable = true)
    private void pack__1577800595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1577800595L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOrUpdateBlendingData(Lnet/minecraft/server/level/WorldGenRegion;II)Lnet/minecraft/world/level/levelgen/blending/BlendingData;", cancellable = true)
    private static void getOrUpdateBlendingData__313442811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-313442811L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAreaWithOldGeneration()Lnet/minecraft/world/level/LevelHeightAccessor;", cancellable = true)
    private void getAreaWithOldGeneration__2142334879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2142334879L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sideByGenerationAge(Lnet/minecraft/world/level/WorldGenLevel;IIZ)Ljava/util/Set;", cancellable = true)
    private static void sideByGenerationAge__1547051158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1547051158L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lnet/minecraft/world/level/levelgen/blending/BlendingData$Packed;)Lnet/minecraft/world/level/levelgen/blending/BlendingData;", cancellable = true)
    private static void unpack_1945181978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1945181978L))
            info.setReturnValue(null);
    }


}
