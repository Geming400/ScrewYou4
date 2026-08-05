package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.ActivityData.class)
public class ActivityData_1138217843Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1771237195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1771237195L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2757867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2757867L))
            info.setReturnValue("\u7133\u481D4ot,,A\uD297(>B");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1176480584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1176480584L))
            info.setReturnValue(-1594913305);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/entity/schedule/Activity;Lcom/google/common/collect/ImmutableList;Ljava/util/Set;Ljava/util/Set;)Lnet/minecraft/world/entity/ai/ActivityData;", cancellable = true)
    private static void create_1908698206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1908698206L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/entity/schedule/Activity;Lcom/google/common/collect/ImmutableList;Ljava/util/Set;)Lnet/minecraft/world/entity/ai/ActivityData;", cancellable = true)
    private static void create__179361165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-179361165L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/entity/schedule/Activity;ILcom/google/common/collect/ImmutableList;)Lnet/minecraft/world/entity/ai/ActivityData;", cancellable = true)
    private static void create_2063531473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2063531473L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/entity/schedule/Activity;ILcom/google/common/collect/ImmutableList;Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;)Lnet/minecraft/world/entity/ai/ActivityData;", cancellable = true)
    private static void create_727140743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(727140743L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/entity/schedule/Activity;Lcom/google/common/collect/ImmutableList;)Lnet/minecraft/world/entity/ai/ActivityData;", cancellable = true)
    private static void create_1293198590(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1293198590L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/entity/schedule/Activity;ILcom/google/common/collect/ImmutableList;Ljava/util/Set;)Lnet/minecraft/world/entity/ai/ActivityData;", cancellable = true)
    private static void create_94613824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(94613824L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "activityType()Lnet/minecraft/world/entity/schedule/Activity;", cancellable = true)
    private void activityType__803067404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-803067404L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "behaviorPriorityPairs()Lcom/google/common/collect/ImmutableList;", cancellable = true)
    private void behaviorPriorityPairs_2105996375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2105996375L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createPriorityPairs(ILcom/google/common/collect/ImmutableList;)Lcom/google/common/collect/ImmutableList;", cancellable = true)
    private static void createPriorityPairs_2088509614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2088509614L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "memoriesToEraseWhenStopped()Ljava/util/Set;", cancellable = true)
    private void memoriesToEraseWhenStopped__690817644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-690817644L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "conditions()Ljava/util/Set;", cancellable = true)
    private void conditions__690817644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-690817644L))
            info.setReturnValue(null);
    }


}
