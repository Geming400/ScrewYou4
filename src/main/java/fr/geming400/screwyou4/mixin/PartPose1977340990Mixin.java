package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.geom.PartPose.class)
public class PartPose1977340990Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__932114047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-932114047L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_841881015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(841881015L))
            info.setReturnValue("we\u56A9O]\u0A89YDJWh5YLoCNpgO6i&}\u8790umz0ZP[o{GW)0{C\u020DV\"R*)L2!<Up;H%(a{C\uB01FvJdeLu\u59EBuK\u0FDA4$q\uAE16AhXbv+r0f(:PtMi");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2015603732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2015603732L))
            info.setReturnValue(535985079);
    }

    @Inject(at = @At("HEAD"), method = "offset(FFF)Lnet/minecraft/client/model/geom/PartPose;", cancellable = true)
    private static void offset_1106314733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1106314733L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "x()F", cancellable = true)
    private void x_2015600353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2015600353L))
            info.setReturnValue(1.951424E8F);
    }

    @Inject(at = @At("HEAD"), method = "z()F", cancellable = true)
    private void z_2015600353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2015600353L))
            info.setReturnValue(1.951424E8F);
    }

    @Inject(at = @At("HEAD"), method = "y()F", cancellable = true)
    private void y_2015600353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2015600353L))
            info.setReturnValue(1.951424E8F);
    }

    @Inject(at = @At("HEAD"), method = "yScale()F", cancellable = true)
    private void yScale_2015600353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2015600353L))
            info.setReturnValue(1.951424E8F);
    }

    @Inject(at = @At("HEAD"), method = "xScale()F", cancellable = true)
    private void xScale_2015600353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2015600353L))
            info.setReturnValue(1.951424E8F);
    }

    @Inject(at = @At("HEAD"), method = "zScale()F", cancellable = true)
    private void zScale_2015600353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2015600353L))
            info.setReturnValue(1.951424E8F);
    }

    @Inject(at = @At("HEAD"), method = "yRot()F", cancellable = true)
    private void yRot_2015600353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2015600353L))
            info.setReturnValue(1.951424E8F);
    }

    @Inject(at = @At("HEAD"), method = "xRot()F", cancellable = true)
    private void xRot_2015600353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2015600353L))
            info.setReturnValue(1.951424E8F);
    }

    @Inject(at = @At("HEAD"), method = "zRot()F", cancellable = true)
    private void zRot_2015600353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2015600353L))
            info.setReturnValue(1.951424E8F);
    }

    @Inject(at = @At("HEAD"), method = "rotation(FFF)Lnet/minecraft/client/model/geom/PartPose;", cancellable = true)
    private static void rotation_1106314733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1106314733L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scaled(F)Lnet/minecraft/client/model/geom/PartPose;", cancellable = true)
    private void scaled__1028114891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1028114891L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scaled(FFF)Lnet/minecraft/client/model/geom/PartPose;", cancellable = true)
    private void scaled_1106314485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1106314485L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withScale(F)Lnet/minecraft/client/model/geom/PartPose;", cancellable = true)
    private void withScale__1028114891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1028114891L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offsetAndRotation(FFFFFF)Lnet/minecraft/client/model/geom/PartPose;", cancellable = true)
    private static void offsetAndRotation__363413469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-363413469L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "translated(FFF)Lnet/minecraft/client/model/geom/PartPose;", cancellable = true)
    private void translated_1106314485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1106314485L))
            info.setReturnValue(null);
    }


}
