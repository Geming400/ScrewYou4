package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.LpVec3.class)
public class LpVec31359280633Mixin {
        @Inject(at = @At("HEAD"), method = "write(Lio/netty/buffer/ByteBuf;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private static void write__126710260(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-126710260L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "read(Lio/netty/buffer/ByteBuf;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void read_1290183749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1290183749L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasContinuationBit(I)Z", cancellable = true)
    private static void hasContinuationBit__380262019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-380262019L))
            info.setReturnValue(false);
    }


}
