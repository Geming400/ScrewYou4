package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.HashedStack.ActualItem.class)
public class ActualItem1783819096Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1125635941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1125635941L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_648359121(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(648359121L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1822081838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1822081838L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/network/HashedPatchMap$HashGenerator;)Z", cancellable = true)
    private void matches_252141740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(252141740L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "count()I", cancellable = true)
    private void count_1822081342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1822081342L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "item()Lnet/minecraft/core/Holder;", cancellable = true)
    private void item__962272428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-962272428L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "components()Lnet/minecraft/network/HashedPatchMap;", cancellable = true)
    private void components__729145456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-729145456L))
            info.setReturnValue(null);
    }


}
