package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.placement.ConcentricRingsStructurePlacement.class)
public class ConcentricRingsStructurePlacement2117928933Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/structure/placement/StructurePlacementType;", cancellable = true)
    private void type__822968458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-822968458L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "count()I", cancellable = true)
    private void count_1029758492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1029758492L))
            info.setReturnValue(-660706871);
    }

    @Inject(at = @At("HEAD"), method = "spread()I", cancellable = true)
    private void spread__74195912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-74195912L))
            info.setReturnValue(-671332316);
    }

    @Inject(at = @At("HEAD"), method = "distance()I", cancellable = true)
    private void distance_1504019190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1504019190L))
            info.setReturnValue(1628846523);
    }

    @Inject(at = @At("HEAD"), method = "preferredBiomes()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void preferredBiomes__300408787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-300408787L))
            info.setReturnValue(null);
    }


}
