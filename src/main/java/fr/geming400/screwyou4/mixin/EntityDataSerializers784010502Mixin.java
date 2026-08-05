package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.syncher.EntityDataSerializers.class)
public class EntityDataSerializers784010502Mixin {
        @Inject(at = @At("HEAD"), method = "registerSerializer(Lnet/minecraft/network/syncher/EntityDataSerializer;)V", cancellable = true)
    private static void registerSerializer_1603029271(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1603029271L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSerializedId(Lnet/minecraft/network/syncher/EntityDataSerializer;)I", cancellable = true)
    private static void getSerializedId_1603016778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1603016778L))
            info.setReturnValue(1772608751);
    }

    @Inject(at = @At("HEAD"), method = "getSerializer(I)Lnet/minecraft/network/syncher/EntityDataSerializer;", cancellable = true)
    private static void getSerializer__542732918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-542732918L))
            info.setReturnValue(null);
    }


}
