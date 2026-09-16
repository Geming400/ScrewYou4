package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.PostChainConfig.InternalTarget.class)
public class InternalTarget_664729971Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__243896298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-243896298L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1435153495(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1435153495L))
            info.setReturnValue("AG\">\uB2F5\u5994\u07939,B2pb^>@Agh/oR4OV*\u03DE:l1N1\u30B6w12");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1222082061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1222082061L))
            info.setReturnValue(1000238190);
    }

    @Inject(at = @At("HEAD"), method = "width()Ljava/util/Optional;", cancellable = true)
    private void width_501425894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(501425894L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "persistent()Z", cancellable = true)
    private void persistent__1139800334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1139800334L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "height()Ljava/util/Optional;", cancellable = true)
    private void height_1148303175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1148303175L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clearColor()I", cancellable = true)
    private void clearColor_1131060226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1131060226L))
            info.setReturnValue(1435186749);
    }


}
