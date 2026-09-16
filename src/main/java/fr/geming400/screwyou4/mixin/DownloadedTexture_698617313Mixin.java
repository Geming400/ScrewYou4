package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.ClientAsset.DownloadedTexture.class)
public class DownloadedTexture_698617313Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__210008956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-210008956L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1469040837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1469040837L))
            info.setReturnValue("c ==_\u3A46E&<\u6E52>8Dh<L H");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1255969403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1255969403L))
            info.setReturnValue(-241591767);
    }

    @Inject(at = @At("HEAD"), method = "url()Ljava/lang/String;", cancellable = true)
    private void url__710425192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-710425192L))
            info.setReturnValue("$fR2JwO\uFA72");
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__1894160574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1894160574L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "texturePath()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void texturePath_258349319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(258349319L))
            info.setReturnValue(null);
    }


}
