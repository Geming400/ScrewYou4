package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.gizmos.DrawableGizmoPrimitives.Group.class)
public class Group_1904181811Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_995555542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(995555542L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1620361961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1620361961L))
            info.setReturnValue("$P%DA\uBAFF\u853A\u4AC4Z@`5^{[i`YT&vL\uBE7C=X`:.:Af\u5CD7;-H=");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1833433395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1833433395L))
            info.setReturnValue(1490039467);
    }

    @Inject(at = @At("HEAD"), method = "lines()Ljava/util/List;", cancellable = true)
    private void lines__1875097119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1875097119L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "points()Ljava/util/List;", cancellable = true)
    private void points__843612731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-843612731L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "triangleFans()Ljava/util/List;", cancellable = true)
    private void triangleFans__1180795318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1180795318L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "quads()Ljava/util/List;", cancellable = true)
    private void quads__1439303058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1439303058L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "opaque()Z", cancellable = true)
    private void opaque__990379928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-990379928L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "texts()Ljava/util/List;", cancellable = true)
    private void texts__1988206008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1988206008L))
            info.setReturnValue(null);
    }


}
