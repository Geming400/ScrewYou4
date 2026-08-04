package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.StructureSet.StructureSelectionEntry.class)
public class StructureSelectionEntry1368691768Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1540763269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1540763269L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_233231793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(233231793L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1406954510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1406954510L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "weight()I", cancellable = true)
    private void weight_1406954014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1406954014L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "structure()Lnet/minecraft/core/Holder;", cancellable = true)
    private void structure__1377399756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1377399756L))
            info.setReturnValue(null);
    }


}
