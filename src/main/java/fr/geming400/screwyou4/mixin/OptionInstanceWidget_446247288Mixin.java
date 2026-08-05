package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.OptionsList.OptionInstanceWidget.class)
public class OptionInstanceWidget_446247288Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1831759546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1831759546L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__689212688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-689212688L))
            info.setReturnValue("J䰪QgjYOi)AZb?SdD댉㿛悪pfy㜄TZ0嬑>RR걱EY9>\"aQNH0BVW4j^[VI.B䱊y1K짰GmSOEt9r0ᆠ*2m⍨'|zx");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_484510029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(484510029L))
            info.setReturnValue(-588420487);
    }

    @Inject(at = @At("HEAD"), method = "optionInstance()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void optionInstance_1539834017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1539834017L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "widget()Lnet/minecraft/client/gui/components/AbstractWidget;", cancellable = true)
    private void widget__1739745526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1739745526L))
            info.setReturnValue(null);
    }


}
