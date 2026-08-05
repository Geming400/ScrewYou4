package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.ActiveTextCollector.Parameters.class)
public class Parameters5129318Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1390641577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1390641577L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1130330657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1130330657L))
            info.setReturnValue("4J+)");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_43392060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(43392060L))
            info.setReturnValue(1100505781);
    }

    @Inject(at = @At("HEAD"), method = "pose()Lorg/joml/Matrix3x2fc;", cancellable = true)
    private void pose__75259477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-75259477L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "opacity()F", cancellable = true)
    private void opacity_43388681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(43388681L))
            info.setReturnValue(8.218882E8F);
    }

    @Inject(at = @At("HEAD"), method = "withScale(F)Lnet/minecraft/client/gui/ActiveTextCollector$Parameters;", cancellable = true)
    private void withScale_345419688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(345419688L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withPose(Lorg/joml/Matrix3x2fc;)Lnet/minecraft/client/gui/ActiveTextCollector$Parameters;", cancellable = true)
    private void withPose__1738681096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1738681096L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scissor()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void scissor_1180154622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1180154622L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withScissor(IIII)Lnet/minecraft/client/gui/ActiveTextCollector$Parameters;", cancellable = true)
    private void withScissor_59082226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(59082226L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withScissor(Lnet/minecraft/client/gui/navigation/ScreenRectangle;)Lnet/minecraft/client/gui/ActiveTextCollector$Parameters;", cancellable = true)
    private void withScissor_1315181789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1315181789L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withOpacity(F)Lnet/minecraft/client/gui/ActiveTextCollector$Parameters;", cancellable = true)
    private void withOpacity_345419688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(345419688L))
            info.setReturnValue(null);
    }


}
