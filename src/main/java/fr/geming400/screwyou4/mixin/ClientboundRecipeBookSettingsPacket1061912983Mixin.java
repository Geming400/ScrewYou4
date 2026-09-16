package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundRecipeBookSettingsPacket.class)
public class ClientboundRecipeBookSettingsPacket1061912983Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1217780573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1217780573L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_153286715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(153286715L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1832336508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1832336508L))
            info.setReturnValue("\u2C1D\uADC2x;=S0)2\u78ECU\u22D6X]3`n[B\uBF37\uC4A4:,\u5913iqe\u089A\u6067^PJ)h\u43CE0\u666F9RMnuk{D*&^6juB\u758BGVHw\uA1AA*Lzf\uC799l(\uA4AA\uCE46n>\uC0BF7\u5BBFxZKh5MI?");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1619265074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1619265074L))
            info.setReturnValue(562360344);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_766201120(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(766201120L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__529564611(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-529564611L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bookSettings()Lnet/minecraft/stats/RecipeBookSettings;", cancellable = true)
    private void bookSettings__842931789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-842931789L))
            info.setReturnValue(new net.minecraft.stats.RecipeBookSettings());
    }


}
