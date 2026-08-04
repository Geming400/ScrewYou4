package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.network.ConfigurationTask.Type.class)
public class Type537496799Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1923009058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1923009058L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__597963672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-597963672L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_575759541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(575759541L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/lang/String;", cancellable = true)
    private void id__597963672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-597963672L))
            info.setReturnValue(null);
    }


}
