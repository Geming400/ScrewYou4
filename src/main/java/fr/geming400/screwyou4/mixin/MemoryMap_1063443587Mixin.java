package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.memory.MemoryMap.class)
public class MemoryMap_1063443587Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;)Lnet/minecraft/world/entity/ai/memory/ExpirableValue;", cancellable = true)
    private void get_627978007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(627978007L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_154816822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(154816822L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1833866615(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1833866615L))
            info.setReturnValue("p]l>F\u600D\uC2C1FhRqg`dh'-nG$#?&\u969B]ZLGp+s\u2ED6U}Os&+=HiD$}cL+%`(.-Ole\uFA1E2nW7[@\u68B9I6IRt>>tYgDj^s!3|m;.\uAFED&.u')1wR\u8AE1u6");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1620795181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1620795181L))
            info.setReturnValue(1616089813);
    }

    @Inject(at = @At("HEAD"), method = "of(Ljava/util/stream/Stream;)Lnet/minecraft/world/entity/ai/memory/MemoryMap;", cancellable = true)
    private static void of_2106051280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2106051280L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "iterator()Ljava/util/Iterator;", cancellable = true)
    private void iterator__1597444912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1597444912L))
            info.setReturnValue(null);
    }


}
