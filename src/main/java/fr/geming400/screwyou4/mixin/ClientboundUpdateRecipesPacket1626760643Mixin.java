package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundUpdateRecipesPacket.class)
public class ClientboundUpdateRecipesPacket1626760643Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__52264445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-52264445L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1282694394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1282694394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_491300668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(491300668L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1665023385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1665023385L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1990137740(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1990137740L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1824268177(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1824268177L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stonecutterRecipes()Lnet/minecraft/world/item/crafting/SelectableRecipe$SingleInputSet;", cancellable = true)
    private void stonecutterRecipes_1086598665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1086598665L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemSets()Ljava/util/Map;", cancellable = true)
    private void itemSets__377862997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-377862997L))
            info.setReturnValue(null);
    }


}
