package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.npc.villager.VillagerProfession.class)
public class VillagerProfession_1062510912Mixin {
        @Inject(at = @At("HEAD"), method = "name()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void name_2002108061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2002108061L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_153884643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(153884643L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1832934436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1832934436L))
            info.setReturnValue("YP+:>0h1uBOFY&Lp| aRELG_xN_aZ\u161EBCUL*\u6E26g\uB0D57Xy\uC68CBe$nK/7I\u7E4B=G6LT");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1619863002(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1619863002L))
            info.setReturnValue(1466259626);
    }

    @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lnet/minecraft/world/entity/npc/villager/VillagerProfession;", cancellable = true)
    private static void bootstrap__1955946473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1955946473L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requestedItems()Lcom/google/common/collect/ImmutableSet;", cancellable = true)
    private void requestedItems__577202178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-577202178L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "secondaryPoi()Lcom/google/common/collect/ImmutableSet;", cancellable = true)
    private void secondaryPoi__190328510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-190328510L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "heldJobSite()Ljava/util/function/Predicate;", cancellable = true)
    private void heldJobSite__1463911428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1463911428L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tradeSetsByLevel()Lit/unimi/dsi/fastutil/ints/Int2ObjectMap;", cancellable = true)
    private void tradeSetsByLevel_1219220737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1219220737L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "acquirableJobSite()Ljava/util/function/Predicate;", cancellable = true)
    private void acquirableJobSite_888823400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(888823400L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "workSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void workSound__187123805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-187123805L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTrades(I)Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void getTrades__555648338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-555648338L))
            info.setReturnValue(null);
    }


}
