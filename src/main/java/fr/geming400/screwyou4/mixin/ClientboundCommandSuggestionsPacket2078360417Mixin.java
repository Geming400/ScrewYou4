package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundCommandSuggestionsPacket.class)
public class ClientboundCommandSuggestionsPacket2078360417Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__2060739289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2060739289L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1169734149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1169734149L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "length()I", cancellable = true)
    private void length__630604255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-630604255L))
            info.setReturnValue(1457543138);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1446183354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1446183354L))
            info.setReturnValue("_2U33nM+tI\uD5B4v;3#\u6B2E3\u9C8CPO#8@WS^Nt9Vur\u7E08[r");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1659254788(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1659254788L))
            info.setReturnValue(-370529557);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id__616823540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-616823540L))
            info.setReturnValue(-1011601059);
    }

    @Inject(at = @At("HEAD"), method = "start()I", cancellable = true)
    private void start_452182565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(452182565L))
            info.setReturnValue(-425873933);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1782648554(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1782648554L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_486882823(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(486882823L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "suggestions()Ljava/util/List;", cancellable = true)
    private void suggestions_1767693056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1767693056L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toSuggestions()Lcom/mojang/brigadier/suggestion/Suggestions;", cancellable = true)
    private void toSuggestions_165594612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(165594612L))
            info.setReturnValue(null);
    }


}
