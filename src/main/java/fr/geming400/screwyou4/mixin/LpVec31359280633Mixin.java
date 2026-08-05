package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.LpVec3.class)
public class LpVec31359280633Mixin {
        @Inject(at = @At("HEAD"), method = "write(Lio/netty/buffer/ByteBuf;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private static void write_1302481291(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1302481291L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "read(Lio/netty/buffer/ByteBuf;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void read__327630929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-327630929L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasContinuationBit(I)Z", cancellable = true)
    private static void hasContinuationBit__1721765599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1721765599L))
            info.setReturnValue(true);
    }


}
