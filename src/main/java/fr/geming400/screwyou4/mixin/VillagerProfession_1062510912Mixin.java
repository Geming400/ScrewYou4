package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.npc.villager.VillagerProfession.class)
public class VillagerProfession_1062510912Mixin {
        @Inject(at = @At("HEAD"), method = "name()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void name__1114398254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1114398254L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1846944126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1846944126L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__72949064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-72949064L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1100773653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1100773653L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lnet/minecraft/world/entity/npc/villager/VillagerProfession;", cancellable = true)
    private static void bootstrap_273645509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(273645509L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "heldJobSite()Ljava/util/function/Predicate;", cancellable = true)
    private void heldJobSite_412625933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(412625933L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "secondaryPoi()Lcom/google/common/collect/ImmutableSet;", cancellable = true)
    private void secondaryPoi_1983178252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1983178252L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requestedItems()Lcom/google/common/collect/ImmutableSet;", cancellable = true)
    private void requestedItems_1983178252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1983178252L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "acquirableJobSite()Ljava/util/function/Predicate;", cancellable = true)
    private void acquirableJobSite_412625933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(412625933L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "workSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void workSound__2142243487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2142243487L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTrades(I)Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void getTrades__1208282519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1208282519L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tradeSetsByLevel()Lit/unimi/dsi/fastutil/ints/Int2ObjectMap;", cancellable = true)
    private void tradeSetsByLevel__295803095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-295803095L))
            info.setReturnValue(null);
    }


}
