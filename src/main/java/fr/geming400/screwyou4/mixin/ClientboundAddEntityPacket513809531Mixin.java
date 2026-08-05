package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundAddEntityPacket.class)
public class ClientboundAddEntityPacket513809531Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_669677121(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(669677121L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId__1144514064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1144514064L))
            info.setReturnValue(1809681143);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/entity/EntityType;", cancellable = true)
    private void getType__1746710985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1746710985L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_218097668(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(218097668L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__1077668063(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1077668063L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getY()D", cancellable = true)
    private void getY_1417242041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1417242041L))
            info.setReturnValue(6.29830100977199E8D);
    }

    @Inject(at = @At("HEAD"), method = "getData()I", cancellable = true)
    private void getData_87797313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(87797313L))
            info.setReturnValue(796207077);
    }

    @Inject(at = @At("HEAD"), method = "getX()D", cancellable = true)
    private void getX_1388612890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1388612890L))
            info.setReturnValue(6.298301003518106E8D);
    }

    @Inject(at = @At("HEAD"), method = "getZ()D", cancellable = true)
    private void getZ_1445871192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1445871192L))
            info.setReturnValue(6.298301002475672E8D);
    }

    @Inject(at = @At("HEAD"), method = "getMovement()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getMovement__945010129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-945010129L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getYHeadRot()F", cancellable = true)
    private void getYHeadRot__119787254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-119787254L))
            info.setReturnValue(6.298301E8F);
    }

    @Inject(at = @At("HEAD"), method = "getUUID()Ljava/util/UUID;", cancellable = true)
    private void getUUID__350243809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-350243809L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getXRot()F", cancellable = true)
    private void getXRot__1672504951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1672504951L))
            info.setReturnValue(6.298301E8F);
    }

    @Inject(at = @At("HEAD"), method = "getYRot()F", cancellable = true)
    private void getYRot_815007882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(815007882L))
            info.setReturnValue(6.298301E8F);
    }


}
