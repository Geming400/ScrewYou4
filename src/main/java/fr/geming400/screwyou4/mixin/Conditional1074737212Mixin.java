package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.providers.GlyphProviderDefinition.Conditional.class)
public class Conditional1074737212Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1834717825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1834717825L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__60722763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-60722763L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1112999954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1112999954L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "filter()Lnet/minecraft/client/gui/font/FontOption$Filter;", cancellable = true)
    private void filter_1502764004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1502764004L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "definition()Lnet/minecraft/client/gui/font/providers/GlyphProviderDefinition;", cancellable = true)
    private void definition_626312857(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(626312857L))
            info.setReturnValue(null);
    }


}
