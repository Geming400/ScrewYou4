package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.CampfireBlockEntity.class)
public class CampfireBlockEntity1461187371Mixin {
        @Inject(at = @At("HEAD"), method = "getItems()Lnet/minecraft/core/NonNullList;", cancellable = true)
    private void getItems_1884521069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1884521069L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cookTick(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/CampfireBlockEntity;Lnet/minecraft/world/item/crafting/RecipeManager$CachedCheck;)V", cancellable = true)
    private static void cookTick_684767251(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(684767251L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "placeFood(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void placeFood__1840945845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1840945845L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "preRemoveSideEffects(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void preRemoveSideEffects_861041669(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(861041669L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getUpdatePacket__661586498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-661586498L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/game/ClientboundBlockEntityDataPacket;", cancellable = true)
    private void getUpdatePacket_927792982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(927792982L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdateTag(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getUpdateTag_883047492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(883047492L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "removeComponentsFromTag(Lnet/minecraft/world/level/storage/ValueOutput;)V", cancellable = true)
    private void removeComponentsFromTag_1348359113(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1348359113L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clearContent()V", cancellable = true)
    private void clearContent_696035314(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(696035314L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "particleTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/CampfireBlockEntity;)V", cancellable = true)
    private static void particleTick_880953163(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(880953163L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "cooldownTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/CampfireBlockEntity;)V", cancellable = true)
    private static void cooldownTick_1102332806(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1102332806L))
            info.cancel();
    }


}
