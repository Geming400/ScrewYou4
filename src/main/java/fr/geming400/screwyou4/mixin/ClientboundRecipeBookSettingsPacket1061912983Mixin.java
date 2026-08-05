package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundRecipeBookSettingsPacket.class)
public class ClientboundRecipeBookSettingsPacket1061912983Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__617112105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-617112105L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1847542054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1847542054L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__73546992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-73546992L))
            info.setReturnValue("W䱯v,C#Nwfsj.ebPU;龎S9#QyPG:⳯h]KIkw댜94fcᣪꀮXL@EM18隋&?\"h<쎧4ZbI+㏪1)H⾕,^n>B8dNFc*LA(h㔛BaZ>P G");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1100175725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1100175725L))
            info.setReturnValue(-1527474354);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1739981896(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1739981896L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1259420517(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1259420517L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bookSettings()Lnet/minecraft/stats/RecipeBookSettings;", cancellable = true)
    private void bookSettings__5172857(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-5172857L))
            info.setReturnValue(new net.minecraft.stats.RecipeBookSettings());
    }


}
