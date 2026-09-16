package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundRecipeBookChangeSettingsPacket.class)
public class ServerboundRecipeBookChangeSettingsPacket_2086218913Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__2052880794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2052880794L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isOpen()Z", cancellable = true)
    private void isOpen_462994499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(462994499L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1571388210(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1571388210L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1790507049(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1790507049L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBookType()Lnet/minecraft/world/inventory/RecipeBookType;", cancellable = true)
    private void getBookType_239033170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(239033170L))
            info.setReturnValue(net.minecraft.world.inventory.RecipeBookType.CRAFTING);
    }

    @Inject(at = @At("HEAD"), method = "isFiltering()Z", cancellable = true)
    private void isFiltering_461021943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(461021943L))
            info.setReturnValue(true);
    }


}
