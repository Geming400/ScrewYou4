package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.geom.PartPose.class)
public class PartPose1977340990Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1068714722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1068714722L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1547202781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1547202781L))
            info.setReturnValue("c@\u53717/3I");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1760274215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1760274215L))
            info.setReturnValue(-2055747534);
    }

    @Inject(at = @At("HEAD"), method = "offset(FFF)Lnet/minecraft/client/model/geom/PartPose;", cancellable = true)
    private static void offset__1729591878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1729591878L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "x()F", cancellable = true)
    private void x_1156131177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1156131177L))
            info.setReturnValue(1.549865E8F);
    }

    @Inject(at = @At("HEAD"), method = "z()F", cancellable = true)
    private void z_1213389479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1213389479L))
            info.setReturnValue(1.549865E8F);
    }

    @Inject(at = @At("HEAD"), method = "y()F", cancellable = true)
    private void y_1184760328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1184760328L))
            info.setReturnValue(1.549865E8F);
    }

    @Inject(at = @At("HEAD"), method = "offsetAndRotation(FFFFFF)Lnet/minecraft/client/model/geom/PartPose;", cancellable = true)
    private static void offsetAndRotation_966316805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(966316805L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotation(FFF)Lnet/minecraft/client/model/geom/PartPose;", cancellable = true)
    private static void rotation_263428655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(263428655L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "yScale()F", cancellable = true)
    private void yScale__1135661776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1135661776L))
            info.setReturnValue(1.549865E8F);
    }

    @Inject(at = @At("HEAD"), method = "xScale()F", cancellable = true)
    private void xScale_661289583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(661289583L))
            info.setReturnValue(1.549865E8F);
    }

    @Inject(at = @At("HEAD"), method = "zScale()F", cancellable = true)
    private void zScale_1362354161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1362354161L))
            info.setReturnValue(1.549865E8F);
    }

    @Inject(at = @At("HEAD"), method = "yRot()F", cancellable = true)
    private void yRot__2006823165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2006823165L))
            info.setReturnValue(1.549865E8F);
    }

    @Inject(at = @At("HEAD"), method = "xRot()F", cancellable = true)
    private void xRot__199368702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-199368702L))
            info.setReturnValue(1.549865E8F);
    }

    @Inject(at = @At("HEAD"), method = "scaled(F)Lnet/minecraft/client/model/geom/PartPose;", cancellable = true)
    private void scaled__560791909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-560791909L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scaled(FFF)Lnet/minecraft/client/model/geom/PartPose;", cancellable = true)
    private void scaled__767865893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-767865893L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "zRot()F", cancellable = true)
    private void zRot_480689668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(480689668L))
            info.setReturnValue(1.549865E8F);
    }

    @Inject(at = @At("HEAD"), method = "translated(FFF)Lnet/minecraft/client/model/geom/PartPose;", cancellable = true)
    private void translated_1113303775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1113303775L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withScale(F)Lnet/minecraft/client/model/geom/PartPose;", cancellable = true)
    private void withScale__1557494383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1557494383L))
            info.setReturnValue(null);
    }


}
