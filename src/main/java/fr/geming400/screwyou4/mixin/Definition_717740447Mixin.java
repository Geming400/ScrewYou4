package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.providers.BitmapProvider.Definition.class)
public class Definition_717740447Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/gui/font/providers/GlyphProviderType;", cancellable = true)
    private void type__1078790668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1078790668L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2103252705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2103252705L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__417719529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-417719529L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_756003188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(756003188L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "file()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void file__1725326107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1725326107L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack()Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private void unpack_1541015733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1541015733L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codepointGrid()[[I", cancellable = true)
    private void codepointGrid__1176171420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1176171420L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height_756002692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(756002692L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ascent()I", cancellable = true)
    private void ascent_756002692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(756002692L))
            info.setReturnValue(null);
    }


}
