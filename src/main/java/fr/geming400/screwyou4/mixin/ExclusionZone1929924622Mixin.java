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
            info.setReturnValue("D\"\u344Ai;M+[\u2C2CunS\u25D5\uD530!ocmSY\uB79FlG(;:\u6A884[#rF\u0FC3F>xs%iV{G\u0EB79`\u39D6\u606D*");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1968187364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1968187364L))
            info.setReturnValue(495471215);
    }

    @Inject(at = @At("HEAD"), method = "chunkCount()I", cancellable = true)
    private void chunkCount_1968186868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1968186868L))
            info.setReturnValue(698618634);
    }

    @Inject(at = @At("HEAD"), method = "otherSet()Lnet/minecraft/core/Holder;", cancellable = true)
    private void otherSet__816166902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-816166902L))
            info.setReturnValue(null);
    }


}
