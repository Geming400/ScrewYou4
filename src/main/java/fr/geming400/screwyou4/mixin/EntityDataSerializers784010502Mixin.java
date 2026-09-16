package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.syncher.EntityDataSerializers.class)
public class EntityDataSerializers784010502Mixin {
        @Inject(at = @At("HEAD"), method = "registerSerializer(Lnet/minecraft/network/syncher/EntityDataSerializer;)V", cancellable = true)
    private static void registerSerializer_657387042(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(657387042L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSerializedId(Lnet/minecraft/network/syncher/EntityDataSerializer;)I", cancellable = true)
    private static void getSerializedId__1670176331(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1670176331L))
            info.setReturnValue(-551793956);
    }

    @Inject(at = @At("HEAD"), method = "getSerializer(I)Lnet/minecraft/network/syncher/EntityDataSerializer;", cancellable = true)
    private static void getSerializer__141604606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-141604606L))
            info.setReturnValue(null);
    }


}
