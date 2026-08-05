package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.report.Report.CannotBuildReason.class)
public class CannotBuildReason333430267Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1718942526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1718942526L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__802029708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-802029708L))
            info.setReturnValue("5!c|0|?3㉖_]直m,BlB寮m2E'ḧLek*L`r&D%m=6塏");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_371693009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(371693009L))
            info.setReturnValue(325622419);
    }

    @Inject(at = @At("HEAD"), method = "message()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void message__1843478898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1843478898L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tooltip()Lnet/minecraft/client/gui/components/Tooltip;", cancellable = true)
    private void tooltip_474184369(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(474184369L))
            info.setReturnValue(null);
    }


}
