package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundPlaceGhostRecipePacket.class)
public class ClientboundPlaceGhostRecipePacket_2004684045Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_325658956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(325658956L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__904770993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-904770993L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_869224069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(869224069L))
            info.setReturnValue("Eo]");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2042946786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2042946786L))
            info.setReturnValue(620576625);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1612214339(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1612214339L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__2092775718(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2092775718L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "containerId()I", cancellable = true)
    private void containerId_2042946290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2042946290L))
            info.setReturnValue(823724044);
    }

    @Inject(at = @At("HEAD"), method = "recipeDisplay()Lnet/minecraft/world/item/crafting/display/RecipeDisplay;", cancellable = true)
    private void recipeDisplay_575736651(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(575736651L))
            info.setReturnValue(null);
    }


}
