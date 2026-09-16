package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.Brain.class)
public class Brain787986792Mixin {
        @Inject(at = @At("HEAD"), method = "provider(Ljava/util/Collection;)Lnet/minecraft/world/entity/ai/Brain$Provider;", cancellable = true)
    private static void provider_261554211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(261554211L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "provider(Ljava/util/Collection;Lnet/minecraft/world/entity/ai/Brain$ActivitySupplier;)Lnet/minecraft/world/entity/ai/Brain$Provider;", cancellable = true)
    private static void provider__1166399543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1166399543L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "provider(Ljava/util/Collection;Ljava/util/Collection;Lnet/minecraft/world/entity/ai/Brain$ActivitySupplier;)Lnet/minecraft/world/entity/ai/Brain$Provider;", cancellable = true)
    private static void provider_993755768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(993755768L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forEach(Lnet/minecraft/world/entity/ai/Brain$Visitor;)V", cancellable = true)
    private void forEach_714958728(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(714958728L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMemory(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;Ljava/lang/Object;)V", cancellable = true)
    private void setMemory__1135503608(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1135503608L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMemory(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;Ljava/util/Optional;)V", cancellable = true)
    private void setMemory__409281445(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-409281445L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isActive(Lnet/minecraft/world/entity/schedule/Activity;)Z", cancellable = true)
    private void isActive_766334098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(766334098L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void tick__494408201(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-494408201L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMemory(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;)Ljava/util/Optional;", cancellable = true)
    private void getMemory__1088056975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1088056975L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pack()Lnet/minecraft/world/entity/ai/Brain$Packed;", cancellable = true)
    private void pack_261209405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(261209405L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getActiveNonCoreActivity()Ljava/util/Optional;", cancellable = true)
    private void getActiveNonCoreActivity_616269749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(616269749L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clearMemories()V", cancellable = true)
    private void clearMemories_963006671(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(963006671L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isBrainDead()Z", cancellable = true)
    private void isBrainDead__1933819217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1933819217L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hasMemoryValue(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;)Z", cancellable = true)
    private void hasMemoryValue__293153245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-293153245L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "removeAllBehaviors()V", cancellable = true)
    private void removeAllBehaviors__1464044489(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1464044489L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMemoryWithExpiry(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;Ljava/lang/Object;J)V", cancellable = true)
    private void setMemoryWithExpiry__1919462481(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1919462481L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTimeUntilExpiry(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;)J", cancellable = true)
    private void getTimeUntilExpiry__1968036085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1968036085L))
            info.setReturnValue(-6957555507478137051L);
    }

    @Inject(at = @At("HEAD"), method = "getRunningBehaviors()Ljava/util/List;", cancellable = true)
    private void getRunningBehaviors_434429040(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(434429040L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getActiveActivities()Ljava/util/Set;", cancellable = true)
    private void getActiveActivities_1452840417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1452840417L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateActivityFromSchedule(Lnet/minecraft/world/attribute/EnvironmentAttributeSystem;JLnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void updateActivityFromSchedule_995514823(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(995514823L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSchedule(Lnet/minecraft/world/attribute/EnvironmentAttribute;)V", cancellable = true)
    private void setSchedule__1143869756(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1143869756L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stopAll(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void stopAll_858614041(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(858614041L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setActiveActivityToFirstValid(Ljava/util/List;)V", cancellable = true)
    private void setActiveActivityToFirstValid_1006779054(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1006779054L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isMemoryValue(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;Ljava/lang/Object;)Z", cancellable = true)
    private void isMemoryValue__2079077841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2079077841L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "addActivity(Lnet/minecraft/world/entity/schedule/Activity;Lcom/google/common/collect/ImmutableList;Ljava/util/Set;Ljava/util/Set;)V", cancellable = true)
    private void addActivity__132863648(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-132863648L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMemoryInternal(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;)Ljava/util/Optional;", cancellable = true)
    private void getMemoryInternal_1612439540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1612439540L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setCoreActivities(Ljava/util/Set;)V", cancellable = true)
    private void setCoreActivities_41530622(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(41530622L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setActiveActivityIfPossible(Lnet/minecraft/world/entity/schedule/Activity;)V", cancellable = true)
    private void setActiveActivityIfPossible__216658439(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-216658439L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDefaultActivity(Lnet/minecraft/world/entity/schedule/Activity;)V", cancellable = true)
    private void setDefaultActivity_1864306160(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1864306160L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "useDefaultActivity()V", cancellable = true)
    private void useDefaultActivity_1395628498(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1395628498L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkMemory(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;Lnet/minecraft/world/entity/ai/memory/MemoryStatus;)Z", cancellable = true)
    private void checkMemory_1836643562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1836643562L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "eraseMemory(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;)V", cancellable = true)
    private void eraseMemory_1339820272(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1339820272L))
            info.cancel();
    }


}
