package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.geom.ModelLayerLocation.class)
public class ModelLayerLocation1386581847Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_477955579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(477955579L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2137962420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2137962420L))
            info.setReturnValue("F&#J!hY\u2F4AWmv\"U/VX\u2E24_{tzz!J)m\u491822zgv=,-hidpYX\uD6DC3k 1i4vxc\uCAECRM: yZ[wb1|\uD622<\uB61BWk");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1943933938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1943933938L))
            info.setReturnValue(-789531705);
    }

    @Inject(at = @At("HEAD"), method = "layer()Ljava/lang/String;", cancellable = true)
    private void layer__502570639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-502570639L))
            info.setReturnValue("gX/wh?19S\uC5D9e\u8FE3O[\u9EFE/pYd]14\"a*!w/X/Ld-s;b+Xr8Zri'U");
    }

    @Inject(at = @At("HEAD"), method = "model()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void model__401919801(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-401919801L))
            info.setReturnValue(null);
    }


}
