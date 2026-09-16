package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.ActiveTextCollector.Parameters.class)
public class Parameters5129318Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__903496950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-903496950L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_775552843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(775552843L))
            info.setReturnValue("yeM`{\uD19F(H>@R2\"IC)\u69BFK+)f{@9+\u40BA>c}n");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_562481409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(562481409L))
            info.setReturnValue(91607725);
    }

    @Inject(at = @At("HEAD"), method = "pose()Lorg/joml/Matrix3x2fc;", cancellable = true)
    private void pose__74139908(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-74139908L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "opacity()F", cancellable = true)
    private void opacity__987863586(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-987863586L))
            info.setReturnValue(6.595083E8F);
    }

    @Inject(at = @At("HEAD"), method = "withOpacity(F)Lnet/minecraft/client/gui/ActiveTextCollector$Parameters;", cancellable = true)
    private void withOpacity__1710853811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1710853811L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withScissor(IIII)Lnet/minecraft/client/gui/ActiveTextCollector$Parameters;", cancellable = true)
    private void withScissor_1912837244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1912837244L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withScissor(Lnet/minecraft/client/gui/navigation/ScreenRectangle;)Lnet/minecraft/client/gui/ActiveTextCollector$Parameters;", cancellable = true)
    private void withScissor__265333869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-265333869L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withScale(F)Lnet/minecraft/client/gui/ActiveTextCollector$Parameters;", cancellable = true)
    private void withScale_365444300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(365444300L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withPose(Lorg/joml/Matrix3x2fc;)Lnet/minecraft/client/gui/ActiveTextCollector$Parameters;", cancellable = true)
    private void withPose__158693087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-158693087L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scissor()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void scissor__2130973022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2130973022L))
            info.setReturnValue(null);
    }


}
