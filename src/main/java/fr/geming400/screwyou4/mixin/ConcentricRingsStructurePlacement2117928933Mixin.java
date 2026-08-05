package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.placement.ConcentricRingsStructurePlacement.class)
public class ConcentricRingsStructurePlacement2117928933Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/structure/placement/StructurePlacementType;", cancellable = true)
    private void type__246018832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-246018832L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "count()I", cancellable = true)
    private void count__2138776117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2138776117L))
            info.setReturnValue(-1100348136);
    }

    @Inject(at = @At("HEAD"), method = "spread()I", cancellable = true)
    private void spread__2138776117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2138776117L))
            info.setReturnValue(-1100348136);
    }

    @Inject(at = @At("HEAD"), method = "distance()I", cancellable = true)
    private void distance__2138776117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2138776117L))
            info.setReturnValue(-1100348136);
    }

    @Inject(at = @At("HEAD"), method = "preferredBiomes()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void preferredBiomes__557085319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-557085319L))
            info.setReturnValue(null);
    }


}
