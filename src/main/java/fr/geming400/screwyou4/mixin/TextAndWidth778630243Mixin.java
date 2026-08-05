package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.MultiLineLabel.TextAndWidth.class)
public class TextAndWidth778630243Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2130824794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2130824794L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__356829732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-356829732L))
            info.setReturnValue("\u8B37`pI\u835Fj.5[3i\u4BA3?T\u5A94\u534E\u6EB8& /\uB77D]D/Z");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_816892985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(816892985L))
            info.setReturnValue(125819209);
    }

    @Inject(at = @At("HEAD"), method = "text()Lnet/minecraft/util/FormattedCharSequence;", cancellable = true)
    private void text_1838269271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1838269271L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width_816892489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(816892489L))
            info.setReturnValue(304342699);
    }


}
