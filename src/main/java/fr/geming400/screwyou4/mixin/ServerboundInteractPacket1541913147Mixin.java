package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundInteractPacket.class)
public class ServerboundInteractPacket1541913147Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1697780737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1697780737L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_633286879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(633286879L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1982630624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1982630624L))
            info.setReturnValue("A\u36E4FSWI8G\u94D73?7Oo$.\u9383%\uC1EF6(s1&\u44EB>9i*)\"FTe6ZS1!T!wy\uC0C9zYvb9!MI\uC475q}fR\u1B55J>s\u7BDCD}");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2099265238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2099265238L))
            info.setReturnValue(404698124);
    }

    @Inject(at = @At("HEAD"), method = "location()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void location_1717345375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1717345375L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1246201284(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1246201284L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__2115693975(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2115693975L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hand()Lnet/minecraft/world/InteractionHand;", cancellable = true)
    private void hand__1588078560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1588078560L))
            info.setReturnValue(net.minecraft.world.InteractionHand.MAIN_HAND);
    }

    @Inject(at = @At("HEAD"), method = "usingSecondaryAction()Z", cancellable = true)
    private void usingSecondaryAction__1221808116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1221808116L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "entityId()I", cancellable = true)
    private void entityId_2024970883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2024970883L))
            info.setReturnValue(-99238247);
    }


}
