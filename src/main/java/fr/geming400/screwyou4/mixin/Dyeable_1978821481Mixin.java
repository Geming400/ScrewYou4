package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.EquipmentClientInfo.Dyeable.class)
public class Dyeable_1978821481Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__930633557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-930633557L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_843361505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(843361505L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2017084222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2017084222L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "colorWhenUndyed()Ljava/util/Optional;", cancellable = true)
    private void colorWhenUndyed__2070684394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2070684394L))
            info.setReturnValue(null);
    }


}
