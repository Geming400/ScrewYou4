package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.OptionsList.OptionInstanceWidget.class)
public class OptionInstanceWidget_446247288Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__462378981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-462378981L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1216670812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1216670812L))
            info.setReturnValue("\uAF0Dl0]Y\uFD05uYweer!uo\u2C62i\u7B65^sr-AN\uFF15o\u5A93 =;:]k>gR: SCwoqVDh6Oj\u4561]S6#)/I}%7\u58F1E)s%L@TgPy.gD\uFA7Dr4'`1j\"]zy8tqz");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1003599378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1003599378L))
            info.setReturnValue(1988706785);
    }

    @Inject(at = @At("HEAD"), method = "optionInstance()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void optionInstance_253492151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(253492151L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "widget()Lnet/minecraft/client/gui/components/AbstractWidget;", cancellable = true)
    private void widget__1362012850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1362012850L))
            info.setReturnValue(null);
    }


}
