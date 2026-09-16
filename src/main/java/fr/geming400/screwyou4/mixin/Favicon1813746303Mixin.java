package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.status.ServerStatus.Favicon.class)
public class Favicon1813746303Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_905120035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(905120035L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1710797468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1710797468L))
            info.setReturnValue("Mh");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1923868902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1923868902L))
            info.setReturnValue(812633371);
    }

    @Inject(at = @At("HEAD"), method = "iconBytes()[B", cancellable = true)
    private void iconBytes_1738838775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1738838775L))
            info.setReturnValue(null);
    }


}
