package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundRespawnPacket.class)
public class ClientboundRespawnPacket_527382769Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1151642320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1151642320L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1912895027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1912895027L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__608077207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-608077207L))
            info.setReturnValue("ziOo-eelN;*SY&qTX_UJ3>ux9T\u3D73%|0dR>}SwFu:co}gaGhbrt2,D*f1\u7EF7oZvp*IdD\u4B995oI>\uBDE2V`gIaG:'y\u32300bN");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_565645510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(565645510L))
            info.setReturnValue(-2099284615);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1205451681(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1205451681L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_724890302(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(724890302L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dataToKeep()B", cancellable = true)
    private void dataToKeep_565638287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(565638287L))
            info.setReturnValue(71);
    }

    @Inject(at = @At("HEAD"), method = "shouldKeep(B)Z", cancellable = true)
    private void shouldKeep_1734838937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1734838937L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "commonPlayerSpawnInfo()Lnet/minecraft/network/protocol/game/CommonPlayerSpawnInfo;", cancellable = true)
    private void commonPlayerSpawnInfo__177806990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-177806990L))
            info.setReturnValue(null);
    }


}
