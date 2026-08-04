package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.TargetBlockTrigger.class)
public class TargetBlockTrigger_1565524350Mixin {
        @Inject(at = @At("HEAD"), method = "trigger(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;I)V", cancellable = true)
    private void trigger_973473190(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(973473190L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec_1173558723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1173558723L))
            info.setReturnValue(null);
    }


}
