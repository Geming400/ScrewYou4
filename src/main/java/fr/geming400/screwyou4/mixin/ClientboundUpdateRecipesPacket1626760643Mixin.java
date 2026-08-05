package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundUpdateRecipesPacket.class)
public class ClientboundUpdateRecipesPacket1626760643Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1782628233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1782628233L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_718134375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(718134375L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1897783128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1897783128L))
            info.setReturnValue("c\"C\u1910r\u15B5d6yNrB\u98E9s%MX?XPw_#\"e'N1s\uB5C6GI\u0F76]\uAB53L8OvIh]o7U6\u13FBL\u8A36\u5D1E)\u2F2D6I");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2110854562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2110854562L))
            info.setReturnValue(624657485);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1331048780(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1331048780L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_35283049(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(35283049L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stonecutterRecipes()Lnet/minecraft/world/item/crafting/SelectableRecipe$SingleInputSet;", cancellable = true)
    private void stonecutterRecipes__1566973400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1566973400L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemSets()Ljava/util/Map;", cancellable = true)
    private void itemSets__1715085273(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1715085273L))
            info.setReturnValue(null);
    }


}
