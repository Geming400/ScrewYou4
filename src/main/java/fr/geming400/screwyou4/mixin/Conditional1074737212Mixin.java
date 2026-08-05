package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.providers.GlyphProviderDefinition.Conditional.class)
public class Conditional1074737212Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_166110944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(166110944L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1845160737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1845160737L))
            info.setReturnValue("Gsjhn\u402CU\u897BFw;\"/\u5C607Ul1d9\u9129UL(.-\uFA21>eu\uC901M\u7A5Bb>#mTsbA1");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1632089303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1632089303L))
            info.setReturnValue(898478441);
    }

    @Inject(at = @At("HEAD"), method = "filter()Lnet/minecraft/client/gui/font/FontOption$Filter;", cancellable = true)
    private void filter_617991020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(617991020L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "definition()Lnet/minecraft/client/gui/font/providers/GlyphProviderDefinition;", cancellable = true)
    private void definition__601094874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-601094874L))
            info.setReturnValue(null);
    }


}
