package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.HoverEvent.ShowEntity.class)
public class ShowEntity1112780080Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_204153812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(204153812L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1883203605(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1883203605L))
            info.setReturnValue("$h6:0=h\uA8ADpR4 \u3AE5wEy.[6a\uFF4Cl@|3A{");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1670132171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1670132171L))
            info.setReturnValue(-163639438);
    }

    @Inject(at = @At("HEAD"), method = "action()Lnet/minecraft/network/chat/HoverEvent$Action;", cancellable = true)
    private void action__27818726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-27818726L))
            info.setReturnValue(net.minecraft.network.chat.HoverEvent.Action.SHOW_ENTITY);
    }

    @Inject(at = @At("HEAD"), method = "entity()Lnet/minecraft/network/chat/HoverEvent$EntityTooltipInfo;", cancellable = true)
    private void entity_738718759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(738718759L))
            info.setReturnValue(null);
    }


}
