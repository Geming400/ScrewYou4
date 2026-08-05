package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.ClientAsset.DownloadedTexture.class)
public class DownloadedTexture_698617313Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2084129571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2084129571L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__436842663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-436842663L))
            info.setReturnValue("I{;)U,,wj&1 62= G\u49FBn\uC287>!0-H)2393\u2B8B\"UH4|,(\u12A6{%C\u7AC8B'/\u7333DXuolE9\u7287\u44773%`V$Op{5");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_736880054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(736880054L))
            info.setReturnValue(-1557450605);
    }

    @Inject(at = @At("HEAD"), method = "url()Ljava/lang/String;", cancellable = true)
    private void url__436843159(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-436843159L))
            info.setReturnValue("\u2988O,\uC5DCA`h^mU\"");
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__1744449241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1744449241L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "texturePath()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void texturePath__1744449241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1744449241L))
            info.setReturnValue(null);
    }


}
