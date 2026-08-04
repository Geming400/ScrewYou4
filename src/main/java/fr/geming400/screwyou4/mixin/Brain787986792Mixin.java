package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.Brain.class)
public class Brain787986792Mixin {
        @Inject(at = @At("HEAD"), method = "provider(Ljava/util/Collection;)Lnet/minecraft/world/entity/ai/Brain$Provider;", cancellable = true)
    private static void provider_817595186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(817595186L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "provider(Ljava/util/Collection;Lnet/minecraft/world/entity/ai/Brain$ActivitySupplier;)Lnet/minecraft/world/entity/ai/Brain$Provider;", cancellable = true)
    private static void provider__1406178920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1406178920L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "provider(Ljava/util/Collection;Ljava/util/Collection;Lnet/minecraft/world/entity/ai/Brain$ActivitySupplier;)Lnet/minecraft/world/entity/ai/Brain$Provider;", cancellable = true)
    private static void provider_1563750151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1563750151L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forEach(Lnet/minecraft/world/entity/ai/Brain$Visitor;)V", cancellable = true)
    private void forEach__1952989282(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1952989282L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMemory(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;Ljava/util/Optional;)V", cancellable = true)
    private void setMemory__1452816808(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1452816808L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMemory(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;Ljava/lang/Object;)V", cancellable = true)
    private void setMemory_458939461(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(458939461L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isActive(Lnet/minecraft/world/entity/schedule/Activity;)Z", cancellable = true)
    private void isActive_1661097826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1661097826L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void tick__1182349286(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1182349286L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMemory(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;)Ljava/util/Optional;", cancellable = true)
    private void getMemory__578156984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-578156984L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pack()Lnet/minecraft/world/entity/ai/Brain$Packed;", cancellable = true)
    private void pack_637096228(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(637096228L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBrainDead()Z", cancellable = true)
    private void isBrainDead_826265375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(826265375L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeAllBehaviors()V", cancellable = true)
    private void removeAllBehaviors_826261531(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(826261531L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkMemory(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;Lnet/minecraft/world/entity/ai/memory/MemoryStatus;)Z", cancellable = true)
    private void checkMemory__1435965389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1435965389L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMemoryInternal(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;)Ljava/util/Optional;", cancellable = true)
    private void getMemoryInternal__578156984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-578156984L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDefaultActivity(Lnet/minecraft/world/entity/schedule/Activity;)V", cancellable = true)
    private void setDefaultActivity_1661093982(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1661093982L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "eraseMemory(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;)V", cancellable = true)
    private void eraseMemory__968368599(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-968368599L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateActivityFromSchedule(Lnet/minecraft/world/attribute/EnvironmentAttributeSystem;JLnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void updateActivityFromSchedule__91726752(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-91726752L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMemoryWithExpiry(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;Ljava/lang/Object;J)V", cancellable = true)
    private void setMemoryWithExpiry__794222293(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-794222293L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addActivity(Lnet/minecraft/world/entity/schedule/Activity;Lcom/google/common/collect/ImmutableList;Ljava/util/Set;Ljava/util/Set;)V", cancellable = true)
    private void addActivity__79384944(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-79384944L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTimeUntilExpiry(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;)J", cancellable = true)
    private void getTimeUntilExpiry__968380131(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-968380131L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isMemoryValue(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;Ljava/lang/Object;)Z", cancellable = true)
    private void isMemoryValue_458943305(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(458943305L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSchedule(Lnet/minecraft/world/attribute/EnvironmentAttribute;)V", cancellable = true)
    private void setSchedule__434717251(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-434717251L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCoreActivities(Ljava/util/Set;)V", cancellable = true)
    private void setCoreActivities_243906064(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(243906064L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "useDefaultActivity()V", cancellable = true)
    private void useDefaultActivity_826261531(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(826261531L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getActiveNonCoreActivity()Ljava/util/Optional;", cancellable = true)
    private void getActiveNonCoreActivity_1033448214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1033448214L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stopAll(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void stopAll__1182349286(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1182349286L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clearMemories()V", cancellable = true)
    private void clearMemories_826261531(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(826261531L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRunningBehaviors()Ljava/util/List;", cancellable = true)
    private void getRunningBehaviors__1880643688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1880643688L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasMemoryValue(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;)Z", cancellable = true)
    private void hasMemoryValue__968364755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-968364755L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getActiveActivities()Ljava/util/Set;", cancellable = true)
    private void getActiveActivities__1041048694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1041048694L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setActiveActivityIfPossible(Lnet/minecraft/world/entity/schedule/Activity;)V", cancellable = true)
    private void setActiveActivityIfPossible_1661093982(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1661093982L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setActiveActivityToFirstValid(Ljava/util/List;)V", cancellable = true)
    private void setActiveActivityToFirstValid_8768204(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(8768204L))
            info.cancel();
    }


}
