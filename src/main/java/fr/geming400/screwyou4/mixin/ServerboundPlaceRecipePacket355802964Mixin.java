package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundPlaceRecipePacket.class)
public class ServerboundPlaceRecipePacket355802964Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1323222124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1323222124L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1741315223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1741315223L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__779657011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-779657011L))
            info.setReturnValue("OAP..\uFCE4{\u6F5FzP(<\u94D0|<t0[59");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_394065706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(394065706L))
            info.setReturnValue(1719926957);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1033871877(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1033871877L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1512819030(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1512819030L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "recipe()Lnet/minecraft/world/item/crafting/display/RecipeDisplayId;", cancellable = true)
    private void recipe_1514228984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1514228984L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "containerId()I", cancellable = true)
    private void containerId_394065210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(394065210L))
            info.setReturnValue(1923074376);
    }

    @Inject(at = @At("HEAD"), method = "useMaxItems()Z", cancellable = true)
    private void useMaxItems_394081547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(394081547L))
            info.setReturnValue(true);
    }


}
