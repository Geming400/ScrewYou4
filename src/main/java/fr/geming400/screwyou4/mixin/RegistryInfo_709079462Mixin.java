package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.resources.RegistryOps.RegistryInfo.class)
public class RegistryInfo_709079462Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2094591720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2094591720L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__426380514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-426380514L))
            info.setReturnValue(">zWꨪvZXrΰ_42r@C");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_747342203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(747342203L))
            info.setReturnValue(-891699444);
    }

    @Inject(at = @At("HEAD"), method = "owner()Lnet/minecraft/core/HolderOwner;", cancellable = true)
    private void owner__1333446648(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1333446648L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getter()Lnet/minecraft/core/HolderGetter;", cancellable = true)
    private void getter__762482090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-762482090L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "elementsLifecycle()Lcom/mojang/serialization/Lifecycle;", cancellable = true)
    private void elementsLifecycle__322308969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-322308969L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromRegistryLookup(Lnet/minecraft/core/HolderLookup$RegistryLookup;)Lnet/minecraft/resources/RegistryOps$RegistryInfo;", cancellable = true)
    private static void fromRegistryLookup__957088067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-957088067L))
            info.setReturnValue(null);
    }


}
