package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.placement.HeightmapPlacement.class)
public class HeightmapPlacement232294344Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/placement/PlacementModifierType;", cancellable = true)
    private void type_893937291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(893937291L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPositions(Lnet/minecraft/world/level/levelgen/placement/PlacementContext;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;)Ljava/util/stream/Stream;", cancellable = true)
    private void getPositions_16911777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(16911777L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onHeightmap(Lnet/minecraft/world/level/levelgen/Heightmap$Types;)Lnet/minecraft/world/level/levelgen/placement/HeightmapPlacement;", cancellable = true)
    private static void onHeightmap_180738617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(180738617L))
            info.setReturnValue(null);
    }


}
