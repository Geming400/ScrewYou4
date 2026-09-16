package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.warden.AngerManagement.class)
public class AngerManagement141025340Mixin {
        @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/server/level/ServerLevel;Ljava/util/function/Predicate;)V", cancellable = true)
    private void tick_1092071122(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1092071122L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec(Ljava/util/function/Predicate;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec__253235551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-253235551L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getActiveAnger(Lnet/minecraft/world/entity/Entity;)I", cancellable = true)
    private void getActiveAnger_615556710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(615556710L))
            info.setReturnValue(2110226309);
    }

    @Inject(at = @At("HEAD"), method = "getActiveEntity()Ljava/util/Optional;", cancellable = true)
    private void getActiveEntity__989263383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-989263383L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "increaseAnger(Lnet/minecraft/world/entity/Entity;I)I", cancellable = true)
    private void increaseAnger_676135069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(676135069L))
            info.setReturnValue(-1277825478);
    }

    @Inject(at = @At("HEAD"), method = "clearAnger(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void clearAnger__476704126(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-476704126L))
            info.cancel();
    }


}
