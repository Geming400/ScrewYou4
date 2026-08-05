package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.placement.InSquarePlacement.class)
public class InSquarePlacement36379349Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/placement/PlacementModifierType;", cancellable = true)
    private void type_698022296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(698022296L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spread()Lnet/minecraft/world/level/levelgen/placement/InSquarePlacement;", cancellable = true)
    private static void spread__1287931652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1287931652L))
            info.setReturnValue(new net.minecraft.world.level.levelgen.placement.InSquarePlacement());
    }

    @Inject(at = @At("HEAD"), method = "getPositions(Lnet/minecraft/world/level/levelgen/placement/PlacementContext;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;)Ljava/util/stream/Stream;", cancellable = true)
    private void getPositions__179003218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-179003218L))
            info.setReturnValue(null);
    }


}
