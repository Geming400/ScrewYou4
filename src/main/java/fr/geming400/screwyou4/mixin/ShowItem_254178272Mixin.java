package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.HoverEvent.ShowItem.class)
public class ShowItem_254178272Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1639690530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1639690530L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__881281704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-881281704L))
            info.setReturnValue("M4ou*ds&*H `jhj4Vhsf}3>刮oO7ᾫn)Lr-;ELU^㇃WK%Mli^ybⅅsgꩇ&");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_292441013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(292441013L))
            info.setReturnValue(1391145452);
    }

    @Inject(at = @At("HEAD"), method = "action()Lnet/minecraft/network/chat/HoverEvent$Action;", cancellable = true)
    private void action__1312946413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1312946413L))
            info.setReturnValue(net.minecraft.network.chat.HoverEvent.Action.SHOW_ENTITY);
    }

    @Inject(at = @At("HEAD"), method = "item()Lnet/minecraft/world/item/ItemStackTemplate;", cancellable = true)
    private void item_2008065577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2008065577L))
            info.setReturnValue(null);
    }


}
