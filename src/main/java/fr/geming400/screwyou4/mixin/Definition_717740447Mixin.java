package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.providers.BitmapProvider.Definition.class)
public class Definition_717740447Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/gui/font/providers/GlyphProviderType;", cancellable = true)
    private void type_1675716474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1675716474L))
            info.setReturnValue(net.minecraft.client.gui.font.providers.GlyphProviderType.SPACE);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__190885822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-190885822L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1488163971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1488163971L))
            info.setReturnValue("\u5FDAUXM;\uFB232'-He\u4DEF,$B|:X\u12FFU@^}e?ZRR,%c)GBUZ+4\u628A\u01F1M[9I+[+EtG4>l\"DZ4DRu#T]j`/;{eE@i|Lq");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1275092537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1275092537L))
            info.setReturnValue(-2032837591);
    }

    @Inject(at = @At("HEAD"), method = "file()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void file__451582367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-451582367L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height__367608131(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-367608131L))
            info.setReturnValue(-1547824010);
    }

    @Inject(at = @At("HEAD"), method = "ascent()I", cancellable = true)
    private void ascent_669154026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(669154026L))
            info.setReturnValue(-488315743);
    }

    @Inject(at = @At("HEAD"), method = "unpack()Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private void unpack__1370089405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1370089405L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codepointGrid()[[I", cancellable = true)
    private void codepointGrid__784543077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-784543077L))
            info.setReturnValue(null);
    }


}
