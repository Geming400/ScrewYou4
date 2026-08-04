package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.CampfireBlockEntity.class)
public class CampfireBlockEntity1461187371Mixin {
        @Inject(at = @At("HEAD"), method = "getItems()Lnet/minecraft/core/NonNullList;", cancellable = true)
    private void getItems_291025251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(291025251L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeComponentsFromTag(Lnet/minecraft/world/level/storage/ValueOutput;)V", cancellable = true)
    private void removeComponentsFromTag_242056019(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(242056019L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUpdateTag(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getUpdateTag_294565823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(294565823L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cooldownTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/CampfireBlockEntity;)V", cancellable = true)
    private static void cooldownTick__1489895890(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1489895890L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "particleTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/CampfireBlockEntity;)V", cancellable = true)
    private static void particleTick__1489895890(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1489895890L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getUpdatePacket_446634309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(446634309L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/game/ClientboundBlockEntityDataPacket;", cancellable = true)
    private void getUpdatePacket_464335599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(464335599L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "preRemoveSideEffects(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void preRemoveSideEffects__1057522207(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1057522207L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "cookTick(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/CampfireBlockEntity;Lnet/minecraft/world/item/crafting/RecipeManager$CachedCheck;)V", cancellable = true)
    private static void cookTick_1438070776(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1438070776L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "placeFood(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void placeFood_439750534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(439750534L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clearContent()V", cancellable = true)
    private void clearContent_1499462110(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1499462110L))
            info.cancel();
    }


}
