package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.cuboid.ItemTransform.class)
public class ItemTransform_2039486757Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__869968281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-869968281L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_904026781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(904026781L))
            info.setReturnValue("&荘3.NJ4r䈼cBI]:-6?U>9*<>绢9/fMkx%樌MtXknen;M<7l4EjLG/i4הּ쿚4)U'wlzW(h@aOT濣3o.=04wyWU)i7赗嬓O)g>-FHJw");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2077749498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2077749498L))
            info.setReturnValue(1152876228);
    }

    @Inject(at = @At("HEAD"), method = "scale()Lorg/joml/Vector3fc;", cancellable = true)
    private void scale__1709535835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1709535835L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "apply(ZLcom/mojang/blaze3d/vertex/PoseStack$Pose;)V", cancellable = true)
    private void apply_2011737426(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2011737426L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "translation()Lorg/joml/Vector3fc;", cancellable = true)
    private void translation__1709535835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1709535835L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotation()Lorg/joml/Vector3fc;", cancellable = true)
    private void rotation__1709535835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1709535835L))
            info.setReturnValue(null);
    }


}
