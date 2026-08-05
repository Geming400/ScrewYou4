package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.gossip.GossipContainer.class)
public class GossipContainer_1675504860Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Ljava/util/UUID;Lnet/minecraft/world/entity/ai/gossip/GossipType;)V", cancellable = true)
    private void remove_1839778772(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1839778772L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/world/entity/ai/gossip/GossipType;)V", cancellable = true)
    private void remove_660222760(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(660222760L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "remove(Ljava/util/UUID;Lnet/minecraft/world/entity/ai/gossip/GossipType;I)V", cancellable = true)
    private void remove__1794538367(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1794538367L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_1713779598(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1713779598L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/world/entity/ai/gossip/GossipContainer;", cancellable = true)
    private void copy_1590924523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1590924523L))
            info.setReturnValue(new net.minecraft.world.entity.ai.gossip.GossipContainer());
    }

    @Inject(at = @At("HEAD"), method = "add(Ljava/util/UUID;Lnet/minecraft/world/entity/ai/gossip/GossipType;I)V", cancellable = true)
    private void add__1794538367(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1794538367L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "putAll(Lnet/minecraft/world/entity/ai/gossip/GossipContainer;)V", cancellable = true)
    private void putAll_1948994271(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1948994271L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "transferFrom(Lnet/minecraft/world/entity/ai/gossip/GossipContainer;Lnet/minecraft/util/RandomSource;I)V", cancellable = true)
    private void transferFrom_1676922232(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1676922232L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "decay()V", cancellable = true)
    private void decay_1713779598(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1713779598L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getReputation(Ljava/util/UUID;Ljava/util/function/Predicate;)I", cancellable = true)
    private void getReputation__1228162780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1228162780L))
            info.setReturnValue(546527187);
    }

    @Inject(at = @At("HEAD"), method = "getGossipEntries()Ljava/util/Map;", cancellable = true)
    private void getGossipEntries__329118781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-329118781L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCountForType(Lnet/minecraft/world/entity/ai/gossip/GossipType;Ljava/util/function/DoublePredicate;)J", cancellable = true)
    private void getCountForType_1935492252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1935492252L))
            info.setReturnValue(8519897014793915119L);
    }


}
