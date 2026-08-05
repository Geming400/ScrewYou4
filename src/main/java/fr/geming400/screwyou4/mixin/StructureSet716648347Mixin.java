package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.StructureSet.class)
public class StructureSet716648347Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2102160606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2102160606L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__418811628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-418811628L))
            info.setReturnValue("hTAB*$W'sC*#P1+a\uA908EW||I?$L0M+AgiV\"");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_754911089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(754911089L))
            info.setReturnValue(679213458);
    }

    @Inject(at = @At("HEAD"), method = "entry(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/level/levelgen/structure/StructureSet$StructureSelectionEntry;", cancellable = true)
    private static void entry__1101439585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1101439585L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entry(Lnet/minecraft/core/Holder;I)Lnet/minecraft/world/level/levelgen/structure/StructureSet$StructureSelectionEntry;", cancellable = true)
    private static void entry_1268328346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1268328346L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "structures()Ljava/util/List;", cancellable = true)
    private void structures__1951982133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1951982133L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "placement()Lnet/minecraft/world/level/levelgen/structure/placement/StructurePlacement;", cancellable = true)
    private void placement__2076482496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2076482496L))
            info.setReturnValue(null);
    }


}
