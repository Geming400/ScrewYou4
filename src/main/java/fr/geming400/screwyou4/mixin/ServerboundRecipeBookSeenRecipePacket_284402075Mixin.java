package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundRecipeBookSeenRecipePacket.class)
public class ServerboundRecipeBookSeenRecipePacket_284402075Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_440269664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(440269664L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__624224194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-624224194L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1054825599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1054825599L))
            info.setReturnValue(")GkE<5o@Gt\uFFC71kldLQao}K%gC:b{'_Y{*?+]yg!mB?3\uA2B7%D\uCBDD6e/zs{N}ICD\u5CCAr;B'1IV/+We-,v%RCaX;f9U\u9091)+E]zyEsq\u3452\u1C0F-T");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_841754165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(841754165L))
            info.setReturnValue(2138867700);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__11309789(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-11309789L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_921762248(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(921762248L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "recipe()Lnet/minecraft/world/item/crafting/display/RecipeDisplayId;", cancellable = true)
    private void recipe__317521936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-317521936L))
            info.setReturnValue(null);
    }


}
