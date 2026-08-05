package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.LootPool.class)
public class LootPool_580108564Mixin {
        @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate__2138228042(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2138228042L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "lootPool()Lnet/minecraft/world/level/storage/loot/LootPool$Builder;", cancellable = true)
    private static void lootPool_230063933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(230063933L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootPool.Builder());
    }

    @Inject(at = @At("HEAD"), method = "addRandomItems(Ljava/util/function/Consumer;Lnet/minecraft/world/level/storage/loot/LootContext;)V", cancellable = true)
    private void addRandomItems_500115791(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(500115791L))
            info.cancel();
    }


}
