package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.NoticeDialog.class)
public class NoticeDialog_1814274180Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_905647911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(905647911L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1710269592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1710269592L))
            info.setReturnValue("\"2\u5590G0Mo\u677Bu*,Q%#\uA826a^P y=(nP\u880A+r0\uB377gf(U\u23D3`\u66E6\uCE05'y!jd\u86EF4\u9F3A\u2A5FU`ZZ^pm\uA3BE");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1923341026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1923341026L))
            info.setReturnValue(1240814900);
    }

    @Inject(at = @At("HEAD"), method = "action()Lnet/minecraft/server/dialog/ActionButton;", cancellable = true)
    private void action__1988579856(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1988579856L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "common()Lnet/minecraft/server/dialog/CommonDialogData;", cancellable = true)
    private void common_1096835056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1096835056L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1414247863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1414247863L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mainActions()Ljava/util/List;", cancellable = true)
    private void mainActions__1979150921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1979150921L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onCancel()Ljava/util/Optional;", cancellable = true)
    private void onCancel_2071346282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2071346282L))
            info.setReturnValue(null);
    }


}
