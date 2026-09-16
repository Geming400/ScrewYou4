package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.HoverEvent.ShowItem.class)
public class ShowItem_254178272Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__654447997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-654447997L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1024601796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1024601796L))
            info.setReturnValue(".!*XZIz\u0F4Ca_xb\uCA3BV(\u55AE4RP:kUI");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_811530362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(811530362L))
            info.setReturnValue(-1490326613);
    }

    @Inject(at = @At("HEAD"), method = "action()Lnet/minecraft/network/chat/HoverEvent$Action;", cancellable = true)
    private void action__886420535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-886420535L))
            info.setReturnValue(net.minecraft.network.chat.HoverEvent.Action.SHOW_ITEM);
    }

    @Inject(at = @At("HEAD"), method = "item()Lnet/minecraft/world/item/ItemStackTemplate;", cancellable = true)
    private void item_102141756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(102141756L))
            info.setReturnValue(null);
    }


}
