package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.worldselection.WorldCreationUiState.WorldTypeEntry.class)
public class WorldTypeEntry2144380776Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1235754508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1235754508L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1380162995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1380162995L))
            info.setReturnValue("t\u4760@p\u69CEO\u8410e7O4GE[\u5678OlqX:Ngvr!JXfgp+OJEh[K@R-0H\uD73A[B\u51F0)o6|\u6665\u2682lTqpG\u9B80\u6CC2^,");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1593234429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1593234429L))
            info.setReturnValue(936398534);
    }

    @Inject(at = @At("HEAD"), method = "preset()Lnet/minecraft/core/Holder;", cancellable = true)
    private void preset__1636228955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1636228955L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAmplified()Z", cancellable = true)
    private void isAmplified__469485466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-469485466L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "describePreset()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void describePreset_1532960005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1532960005L))
            info.setReturnValue(null);
    }


}
