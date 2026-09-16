package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.ActivityData.class)
public class ActivityData_1138217843Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_229591574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(229591574L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1908641367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1908641367L))
            info.setReturnValue("oejxs\u6C4C*\u6774YLDV=I AI\u1FC7x`-D5M>\uC633W.UWz]%GWqaR9ZiL|W=\u7C1F1\uD323Q;EvjEpX,\u258E<)df+)O[c*Jp");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1695569933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1695569933L))
            info.setReturnValue(-2089540833);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/entity/schedule/Activity;Lcom/google/common/collect/ImmutableList;Ljava/util/Set;Ljava/util/Set;)Lnet/minecraft/world/entity/ai/ActivityData;", cancellable = true)
    private static void create_912832738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(912832738L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/entity/schedule/Activity;Lcom/google/common/collect/ImmutableList;Ljava/util/Set;)Lnet/minecraft/world/entity/ai/ActivityData;", cancellable = true)
    private static void create__791419281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-791419281L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/entity/schedule/Activity;ILcom/google/common/collect/ImmutableList;)Lnet/minecraft/world/entity/ai/ActivityData;", cancellable = true)
    private static void create__875158835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-875158835L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/entity/schedule/Activity;ILcom/google/common/collect/ImmutableList;Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;)Lnet/minecraft/world/entity/ai/ActivityData;", cancellable = true)
    private static void create_1237399819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1237399819L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/entity/schedule/Activity;Lcom/google/common/collect/ImmutableList;)Lnet/minecraft/world/entity/ai/ActivityData;", cancellable = true)
    private static void create__1433997182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1433997182L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/entity/schedule/Activity;ILcom/google/common/collect/ImmutableList;Ljava/util/Set;)Lnet/minecraft/world/entity/ai/ActivityData;", cancellable = true)
    private static void create__1699318588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1699318588L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "conditions()Ljava/util/Set;", cancellable = true)
    private void conditions_928584668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(928584668L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "activityType()Lnet/minecraft/world/entity/schedule/Activity;", cancellable = true)
    private void activityType_645174429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(645174429L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "behaviorPriorityPairs()Lcom/google/common/collect/ImmutableList;", cancellable = true)
    private void behaviorPriorityPairs_1797288148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1797288148L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "memoriesToEraseWhenStopped()Ljava/util/Set;", cancellable = true)
    private void memoriesToEraseWhenStopped__605321427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-605321427L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createPriorityPairs(ILcom/google/common/collect/ImmutableList;)Lcom/google/common/collect/ImmutableList;", cancellable = true)
    private static void createPriorityPairs__780811627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-780811627L))
            info.setReturnValue(null);
    }


}
