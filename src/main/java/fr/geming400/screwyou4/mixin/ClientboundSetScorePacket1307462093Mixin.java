package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetScorePacket.class)
public class ClientboundSetScorePacket1307462093Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1463329683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1463329683L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_398835825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(398835825L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2077885618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2077885618L))
            info.setReturnValue(">\u9D50:R4|6!5v\u6186");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1864814184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1864814184L))
            info.setReturnValue(930918475);
    }

    @Inject(at = @At("HEAD"), method = "owner()Ljava/lang/String;", cancellable = true)
    private void owner_65086409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(65086409L))
            info.setReturnValue("8OR");
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1011750230(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1011750230L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__284015501(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-284015501L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "display()Ljava/util/Optional;", cancellable = true)
    private void display_352792125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(352792125L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "numberFormat()Ljava/util/Optional;", cancellable = true)
    private void numberFormat__448249829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-448249829L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "score()I", cancellable = true)
    private void score__1456657311(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1456657311L))
            info.setReturnValue(-2055215423);
    }

    @Inject(at = @At("HEAD"), method = "objectiveName()Ljava/lang/String;", cancellable = true)
    private void objectiveName_182356410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(182356410L))
            info.setReturnValue("IG-Zc\u66E8L6?hC`At3");
    }


}
