package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.custom.CustomPacketPayload.Type.class)
public class Type_335866609Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1721378867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1721378867L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__799593367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-799593367L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_374129350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(374129350L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__2107199945(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2107199945L))
            info.setReturnValue(null);
    }


}
