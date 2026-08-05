package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.IntRange.class)
public class IntRange_1978790890Mixin {
        @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/storage/loot/LootContext;I)Z", cancellable = true)
    private void test_1335097626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1335097626L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "clamp(Lnet/minecraft/world/level/storage/loot/LootContext;I)I", cancellable = true)
    private void clamp_1335081289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1335081289L))
            info.setReturnValue(-1743519763);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate__739545716(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-739545716L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "exact(I)Lnet/minecraft/world/level/storage/loot/IntRange;", cancellable = true)
    private static void exact__1747288359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1747288359L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "range(II)Lnet/minecraft/world/level/storage/loot/IntRange;", cancellable = true)
    private static void range_1788027776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1788027776L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "upperBound(I)Lnet/minecraft/world/level/storage/loot/IntRange;", cancellable = true)
    private static void upperBound__1747288359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1747288359L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lowerBound(I)Lnet/minecraft/world/level/storage/loot/IntRange;", cancellable = true)
    private static void lowerBound__1747288359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1747288359L))
            info.setReturnValue(null);
    }


}
