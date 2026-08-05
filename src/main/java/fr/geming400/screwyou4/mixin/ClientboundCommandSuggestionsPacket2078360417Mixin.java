package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundCommandSuggestionsPacket.class)
public class ClientboundCommandSuggestionsPacket2078360417Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_399335329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(399335329L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__831094620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-831094620L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "length()I", cancellable = true)
    private void length_2116622663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2116622663L))
            info.setReturnValue(446350081);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_942900442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(942900442L))
            info.setReturnValue("\u6C94C}n\u7BE2S1=MeX]]L7fUYH\u4A73/si;V(N\uB132r\uB006UNF:\u4988&\"Y|g_YdXcl6eUh{gEQvm@0sn8*nmEY;}\u32C1\u6FF4Pck@^uNg(\u613DJs\u5E85\"3");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2116623159(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2116623159L))
            info.setReturnValue(267826591);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id_2116622663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2116622663L))
            info.setReturnValue(446350081);
    }

    @Inject(at = @At("HEAD"), method = "start()I", cancellable = true)
    private void start_2116622663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2116622663L))
            info.setReturnValue(446350081);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1538537966(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1538537966L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__2019099345(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2019099345L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "suggestions()Ljava/util/List;", cancellable = true)
    private void suggestions__590270063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-590270063L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toSuggestions()Lcom/mojang/brigadier/suggestion/Suggestions;", cancellable = true)
    private void toSuggestions_1502455016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1502455016L))
            info.setReturnValue(null);
    }


}
