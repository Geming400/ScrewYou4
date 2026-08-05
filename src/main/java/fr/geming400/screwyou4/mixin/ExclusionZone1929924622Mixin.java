package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.placement.StructurePlacement.ExclusionZone.class)
public class ExclusionZone1929924622Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__979530415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-979530415L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_794464647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(794464647L))
            info.setReturnValue("D\"㑊i;M+[ⰬunS◕픰!ocmSY랟lG(;:檈4[#rF࿃F>xs%iV{Gື9`㧖恭*");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1968187364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1968187364L))
            info.setReturnValue(-435181885);
    }

    @Inject(at = @At("HEAD"), method = "chunkCount()I", cancellable = true)
    private void chunkCount_1968186868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1968186868L))
            info.setReturnValue(-232034466);
    }

    @Inject(at = @At("HEAD"), method = "otherSet()Lnet/minecraft/core/Holder;", cancellable = true)
    private void otherSet__816166902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-816166902L))
            info.setReturnValue(null);
    }


}
