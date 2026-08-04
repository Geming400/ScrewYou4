package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.providers.TrueTypeGlyphProviderDefinition.class)
public class TrueTypeGlyphProviderDefinition_1172795286Mixin {
        @Inject(at = @At("HEAD"), method = "size()F", cancellable = true)
    private void size_1211054648(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1211054648L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/gui/font/providers/GlyphProviderType;", cancellable = true)
    private void type__623735829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-623735829L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1736659752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1736659752L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_37335310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(37335310L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1211058027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1211058027L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "location()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void location__1270271268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1270271268L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shift()Lnet/minecraft/client/gui/font/providers/TrueTypeGlyphProviderDefinition$Shift;", cancellable = true)
    private void shift__160585348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-160585348L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "skip()Ljava/lang/String;", cancellable = true)
    private void skip_37334814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(37334814L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack()Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private void unpack_1996070572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1996070572L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "oversample()F", cancellable = true)
    private void oversample_1211054648(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1211054648L))
            info.setReturnValue(null);
    }


}
