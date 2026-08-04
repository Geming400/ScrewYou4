package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundRecipeBookChangeSettingsPacket.class)
public class ServerboundRecipeBookChangeSettingsPacket_2086218913Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_407193824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(407193824L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isOpen()Z", cancellable = true)
    private void isOpen_2124497495(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2124497495L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_217596918(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(217596918L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1530679471(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1530679471L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFiltering()Z", cancellable = true)
    private void isFiltering_2124497495(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2124497495L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBookType()Lnet/minecraft/world/inventory/RecipeBookType;", cancellable = true)
    private void getBookType__1551590311(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1551590311L))
            info.setReturnValue(null);
    }


}
