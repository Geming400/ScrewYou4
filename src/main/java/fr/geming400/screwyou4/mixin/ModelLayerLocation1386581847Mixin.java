package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.geom.ModelLayerLocation.class)
public class ModelLayerLocation1386581847Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1522873190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1522873190L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_251121376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(251121376L))
            info.setReturnValue(")rZ\uB86BQ9Y0\u6784f<m\uFF7Dv(wC\u82F45\u25CD@\u1FB7/n\u230C\u88068-x/CBv\u94F2I!3c}e;x8{;9X=\uC4429\uB121\u50FA)");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1424844589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1424844589L))
            info.setReturnValue(785337387);
    }

    @Inject(at = @At("HEAD"), method = "layer()Ljava/lang/String;", cancellable = true)
    private void layer_251121376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(251121376L))
            info.setReturnValue(")rZ\uB86BQ9Y0\u6784f<m\uFF7Dv(wC\u82F45\u25CD@\u1FB7/n\u230C\u88068-x/CBv\u94F2I!3c}e;x8{;9X=\uC4429\uB121\u50FA)");
    }

    @Inject(at = @At("HEAD"), method = "model()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void model__1056484706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1056484706L))
            info.setReturnValue(null);
    }


}
