package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.ClientAsset.ResourceTexture.class)
public class ResourceTexture718755352Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2104267611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2104267611L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__416704623(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-416704623L))
            info.setReturnValue("$S]?K\"A\u11C19H\u101D^A\uB93D\u89FCX91u\u53F16H/\u662C\u2426<d}-\u08A3w\u9654C*");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_757018094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(757018094L))
            info.setReturnValue(-705851079);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__1724311201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1724311201L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "texturePath()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void texturePath__1724311201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1724311201L))
            info.setReturnValue(null);
    }


}
