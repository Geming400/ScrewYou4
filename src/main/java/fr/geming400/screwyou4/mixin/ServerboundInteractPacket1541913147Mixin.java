package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundInteractPacket.class)
public class ServerboundInteractPacket1541913147Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__137111941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-137111941L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1367541890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1367541890L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_406453172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(406453172L))
            info.setReturnValue("Jv7@@T-");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1580175889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1580175889L))
            info.setReturnValue(-1952069500);
    }

    @Inject(at = @At("HEAD"), method = "location()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void location__1655324620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1655324620L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__2074985236(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2074985236L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__326708847(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-326708847L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "entityId()I", cancellable = true)
    private void entityId_1580175393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1580175393L))
            info.setReturnValue(-1773546011);
    }

    @Inject(at = @At("HEAD"), method = "hand()Lnet/minecraft/world/InteractionHand;", cancellable = true)
    private void hand__1899065425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1899065425L))
            info.setReturnValue(net.minecraft.world.InteractionHand.OFF_HAND);
    }

    @Inject(at = @At("HEAD"), method = "usingSecondaryAction()Z", cancellable = true)
    private void usingSecondaryAction_1580191730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1580191730L))
            info.setReturnValue(true);
    }


}
