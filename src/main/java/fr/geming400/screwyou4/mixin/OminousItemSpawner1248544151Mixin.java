package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.OminousItemSpawner.class)
public class OminousItemSpawner1248544151Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/entity/OminousItemSpawner;", cancellable = true)
    private static void create_1275906817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1275906817L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1286818890(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1286818890L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getItem()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItem_1771962811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1771962811L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_799114316(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(799114316L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getPistonPushReaction()Lnet/minecraft/world/level/material/PushReaction;", cancellable = true)
    private void getPistonPushReaction__1155544308(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1155544308L))
            info.setReturnValue(net.minecraft.world.level.material.PushReaction.PUSH_ONLY);
    }

    @Inject(at = @At("HEAD"), method = "isIgnoringBlockTriggers()Z", cancellable = true)
    private void isIgnoringBlockTriggers_1286822734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1286822734L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "addParticles()V", cancellable = true)
    private void addParticles_1286818890(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1286818890L))
            info.cancel();
    }


}
