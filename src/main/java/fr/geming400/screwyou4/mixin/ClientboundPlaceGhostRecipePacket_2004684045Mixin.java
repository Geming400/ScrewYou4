package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundPlaceGhostRecipePacket.class)
public class ClientboundPlaceGhostRecipePacket_2004684045Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__2134415662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2134415662L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1096057776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1096057776L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1519859727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1519859727L))
            info.setReturnValue("vbp$\u0C3C}][_%sE3XT\u9C0AM'U#\u7C00eM]tF|{\u0B57)\"V*8s:\uAB04]'G?Zcn\u11C5k+T3O<Gv\u0189.:\uBE788\"\uD1F6so\u14BC:16K2f%=/_\u6641\u1691<)?]};");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1732931161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1732931161L))
            info.setReturnValue(-658517401);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1708972181(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1708972181L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_413206450(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(413206450L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "containerId()I", cancellable = true)
    private void containerId_1094268662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1094268662L))
            info.setReturnValue(532071121);
    }

    @Inject(at = @At("HEAD"), method = "recipeDisplay()Lnet/minecraft/world/item/crafting/display/RecipeDisplay;", cancellable = true)
    private void recipeDisplay_704474231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(704474231L))
            info.setReturnValue(null);
    }


}
