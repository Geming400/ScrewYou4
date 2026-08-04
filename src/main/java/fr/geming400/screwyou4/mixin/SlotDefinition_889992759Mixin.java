package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.ItemCombinerMenuSlotDefinition.SlotDefinition.class)
public class SlotDefinition_889992759Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2019462279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2019462279L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__245467217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-245467217L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_928255500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(928255500L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "x()I", cancellable = true)
    private void x_928255004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(928255004L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "y()I", cancellable = true)
    private void y_928255004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(928255004L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slotIndex()I", cancellable = true)
    private void slotIndex_928255004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(928255004L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mayPlace()Ljava/util/function/Predicate;", cancellable = true)
    private void mayPlace_240107780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(240107780L))
            info.setReturnValue(null);
    }


}
