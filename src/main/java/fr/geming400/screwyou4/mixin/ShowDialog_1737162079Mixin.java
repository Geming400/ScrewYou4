package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.ClickEvent.ShowDialog.class)
public class ShowDialog_1737162079Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_828535810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(828535810L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1787381693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1787381693L))
            info.setReturnValue("kJ7`KFSSry\uB307|V^MX>Yl+$8Gt^0\uD740");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2000453127(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2000453127L))
            info.setReturnValue(2140969478);
    }

    @Inject(at = @At("HEAD"), method = "action()Lnet/minecraft/network/chat/ClickEvent$Action;", cancellable = true)
    private void action_1823291260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1823291260L))
            info.setReturnValue(net.minecraft.network.chat.ClickEvent.Action.SHOW_DIALOG);
    }

    @Inject(at = @At("HEAD"), method = "dialog()Lnet/minecraft/core/Holder;", cancellable = true)
    private void dialog_1020612370(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1020612370L))
            info.setReturnValue(null);
    }


}
