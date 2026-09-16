package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.providers.ProviderReferenceDefinition.class)
public class ProviderReferenceDefinition1966856079Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/gui/font/providers/GlyphProviderType;", cancellable = true)
    private void type__1370135189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1370135189L))
            info.setReturnValue(net.minecraft.client.gui.font.providers.GlyphProviderType.UNIHEX);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1058229811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1058229811L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1557687692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1557687692L))
            info.setReturnValue("Z");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1770759126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1770759126L))
            info.setReturnValue(354592911);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__625921807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-625921807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack()Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private void unpack__120973772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-120973772L))
            info.setReturnValue(null);
    }


}
