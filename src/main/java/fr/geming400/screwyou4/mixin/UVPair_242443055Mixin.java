package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.geom.builders.UVPair.class)
public class UVPair_242443055Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1627955313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1627955313L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__893017417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-893017417L))
            info.setReturnValue("COq");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_280705796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(280705796L))
            info.setReturnValue(724926809);
    }

    @Inject(at = @At("HEAD"), method = "v()F", cancellable = true)
    private void v_280702417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(280702417L))
            info.setReturnValue(8.605886E8F);
    }

    @Inject(at = @At("HEAD"), method = "u()F", cancellable = true)
    private void u_280702417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(280702417L))
            info.setReturnValue(8.605886E8F);
    }

    @Inject(at = @At("HEAD"), method = "pack(FF)J", cancellable = true)
    private static void pack__842105715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-842105715L))
            info.setReturnValue(6287099165641860516L);
    }

    @Inject(at = @At("HEAD"), method = "unpackV(J)F", cancellable = true)
    private static void unpackV_1457268419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1457268419L))
            info.setReturnValue(8.605886E8F);
    }

    @Inject(at = @At("HEAD"), method = "unpackU(J)F", cancellable = true)
    private static void unpackU_1457268419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1457268419L))
            info.setReturnValue(8.605886E8F);
    }


}
