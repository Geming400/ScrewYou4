package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.resources.RegistryOps.RegistryInfo.class)
public class RegistryInfo_709079462Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__199546807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-199546807L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1479502986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1479502986L))
            info.setReturnValue("!\u81A9T>yr\u5FA6k");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1266431552(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1266431552L))
            info.setReturnValue(-1652227187);
    }

    @Inject(at = @At("HEAD"), method = "owner()Lnet/minecraft/core/HolderOwner;", cancellable = true)
    private void owner__1381954245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1381954245L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getter()Lnet/minecraft/core/HolderGetter;", cancellable = true)
    private void getter__786504661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-786504661L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "elementsLifecycle()Lcom/mojang/serialization/Lifecycle;", cancellable = true)
    private void elementsLifecycle_7795146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(7795146L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromRegistryLookup(Lnet/minecraft/core/HolderLookup$RegistryLookup;)Lnet/minecraft/resources/RegistryOps$RegistryInfo;", cancellable = true)
    private static void fromRegistryLookup_400538718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(400538718L))
            info.setReturnValue(null);
    }


}
