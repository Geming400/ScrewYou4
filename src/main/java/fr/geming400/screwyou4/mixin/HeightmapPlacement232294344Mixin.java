package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.placement.HeightmapPlacement.class)
public class HeightmapPlacement232294344Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/placement/PlacementModifierType;", cancellable = true)
    private void type__1135181487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1135181487L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onHeightmap(Lnet/minecraft/world/level/levelgen/Heightmap$Types;)Lnet/minecraft/world/level/levelgen/placement/HeightmapPlacement;", cancellable = true)
    private static void onHeightmap_1556727087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1556727087L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPositions(Lnet/minecraft/world/level/levelgen/placement/PlacementContext;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;)Ljava/util/stream/Stream;", cancellable = true)
    private void getPositions__1719285523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1719285523L))
            info.setReturnValue(null);
    }


}
