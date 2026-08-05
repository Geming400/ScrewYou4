package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.warden.AngerManagement.class)
public class AngerManagement141025340Mixin {
        @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/server/level/ServerLevel;Ljava/util/function/Predicate;)V", cancellable = true)
    private void tick__780415857(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-780415857L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getActiveEntity()Ljava/util/Optional;", cancellable = true)
    private void getActiveEntity_386486762(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(386486762L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getActiveAnger(Lnet/minecraft/world/entity/Entity;)I", cancellable = true)
    private void getActiveAnger__310711813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-310711813L))
            info.setReturnValue(-731491511);
    }

    @Inject(at = @At("HEAD"), method = "increaseAnger(Lnet/minecraft/world/entity/Entity;I)I", cancellable = true)
    private void increaseAnger__950149662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-950149662L))
            info.setReturnValue(1243819496);
    }

    @Inject(at = @At("HEAD"), method = "clearAnger(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void clearAnger__310699320(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-310699320L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec(Ljava/util/function/Predicate;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_1990474763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1990474763L))
            info.setReturnValue(null);
    }


}
