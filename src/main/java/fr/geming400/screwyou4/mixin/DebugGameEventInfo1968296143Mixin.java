package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.DebugGameEventInfo.class)
public class DebugGameEventInfo1968296143Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1059669875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1059669875L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1556247628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1556247628L))
            info.setReturnValue("Be|\"`TK\u506FO}A8&LfhFw3g'[\u2F78EQ!4>Ww\u5E77LUuZ\u2211scciP'/p}}k");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1769319062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1769319062L))
            info.setReturnValue(905500326);
    }

    @Inject(at = @At("HEAD"), method = "event()Lnet/minecraft/core/Holder;", cancellable = true)
    private void event__57310479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-57310479L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void pos_152003572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(152003572L))
            info.setReturnValue(null);
    }


}
