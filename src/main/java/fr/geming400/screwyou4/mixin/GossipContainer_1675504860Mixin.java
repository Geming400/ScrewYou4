package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.gossip.GossipContainer.class)
public class GossipContainer_1675504860Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Ljava/util/UUID;Lnet/minecraft/world/entity/ai/gossip/GossipType;)V", cancellable = true)
    private void remove_2124558680(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2124558680L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/world/entity/ai/gossip/GossipType;)V", cancellable = true)
    private void remove__1774772052(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1774772052L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "remove(Ljava/util/UUID;Lnet/minecraft/world/entity/ai/gossip/GossipType;I)V", cancellable = true)
    private void remove__1556295811(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1556295811L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_889677153(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(889677153L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/world/entity/ai/gossip/GossipContainer;", cancellable = true)
    private void copy_328210464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(328210464L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "add(Ljava/util/UUID;Lnet/minecraft/world/entity/ai/gossip/GossipType;I)V", cancellable = true)
    private void add_1068289216(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1068289216L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "putAll(Lnet/minecraft/world/entity/ai/gossip/GossipContainer;)V", cancellable = true)
    private void putAll_1851938701(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1851938701L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "transferFrom(Lnet/minecraft/world/entity/ai/gossip/GossipContainer;Lnet/minecraft/util/RandomSource;I)V", cancellable = true)
    private void transferFrom_1537206115(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1537206115L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getGossipEntries()Ljava/util/Map;", cancellable = true)
    private void getGossipEntries__1226926984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1226926984L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "decay()V", cancellable = true)
    private void decay_1470193684(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1470193684L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getReputation(Ljava/util/UUID;Ljava/util/function/Predicate;)I", cancellable = true)
    private void getReputation__2139345835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2139345835L))
            info.setReturnValue(-685391948);
    }

    @Inject(at = @At("HEAD"), method = "getCountForType(Lnet/minecraft/world/entity/ai/gossip/GossipType;Ljava/util/function/DoublePredicate;)J", cancellable = true)
    private void getCountForType_1977186854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1977186854L))
            info.setReturnValue(8838366369558407205L);
    }


}
