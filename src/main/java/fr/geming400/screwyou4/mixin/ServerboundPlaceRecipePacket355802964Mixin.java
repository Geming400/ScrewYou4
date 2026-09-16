package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundPlaceRecipePacket.class)
public class ServerboundPlaceRecipePacket355802964Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_511670554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(511670554L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__552823304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-552823304L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1126226489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1126226489L))
            info.setReturnValue("\u286C'\u829D\uD7B6os-4d$3IU\"HvhSaHa\u0919S)kqp*Ps\u4535[DZp1YEkh/+R$\u2303FQrR\u91B6B#Z+i");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_913155055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(913155055L))
            info.setReturnValue(1469774473);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_60091101(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(60091101L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_993163138(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(993163138L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "recipe()Lnet/minecraft/world/item/crafting/display/RecipeDisplayId;", cancellable = true)
    private void recipe__246121046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-246121046L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "containerId()I", cancellable = true)
    private void containerId__554612418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-554612418L))
            info.setReturnValue(418851628);
    }

    @Inject(at = @At("HEAD"), method = "useMaxItems()Z", cancellable = true)
    private void useMaxItems_976492424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(976492424L))
            info.setReturnValue(false);
    }


}
