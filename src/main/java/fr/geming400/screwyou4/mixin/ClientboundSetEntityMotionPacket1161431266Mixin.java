package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetEntityMotionPacket.class)
public class ClientboundSetEntityMotionPacket1161431266Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__517593822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-517593822L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1748023771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1748023771L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_25971291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(25971291L))
            info.setReturnValue("\u2DA0,k;rt\u5BB5w-#wx\u9498T+Nm@M\uB374\uBD9DX=o+S\u5945&\uC336qX_CUjxk4/a\u3D52J\"-\uFE22eUD\uCB85|b-\"\u317BEyb5EZ\u617A!h}\u38E40yd\uAF72BI1\uC069");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1199694008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1199694008L))
            info.setReturnValue(1507659323);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id_1199693512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1199693512L))
            info.setReturnValue(2119010001);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1839500179(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1839500179L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1358938800(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1358938800L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "movement()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void movement__2035806501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2035806501L))
            info.setReturnValue(null);
    }


}
