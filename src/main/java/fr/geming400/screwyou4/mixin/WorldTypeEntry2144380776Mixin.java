package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.worldselection.WorldCreationUiState.WorldTypeEntry.class)
public class WorldTypeEntry2144380776Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__765074261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-765074261L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1008920801(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1008920801L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2112323778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2112323778L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "preset()Lnet/minecraft/core/Holder;", cancellable = true)
    private void preset__601710748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-601710748L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAmplified()Z", cancellable = true)
    private void isAmplified__2112307937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2112307937L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "describePreset()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void describePreset__32528389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-32528389L))
            info.setReturnValue(null);
    }


}
