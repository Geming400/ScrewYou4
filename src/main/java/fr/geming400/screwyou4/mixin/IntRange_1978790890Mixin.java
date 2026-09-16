package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.IntRange.class)
public class IntRange_1978790890Mixin {
        @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/storage/loot/LootContext;I)Z", cancellable = true)
    private void test_1381761836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1381761836L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "clamp(Lnet/minecraft/world/level/storage/loot/LootContext;I)I", cancellable = true)
    private void clamp__1876692412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1876692412L))
            info.setReturnValue(-1813048020);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate_960072118(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(960072118L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "exact(I)Lnet/minecraft/world/level/storage/loot/IntRange;", cancellable = true)
    private static void exact__1375259496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1375259496L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "range(II)Lnet/minecraft/world/level/storage/loot/IntRange;", cancellable = true)
    private static void range__1811641949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1811641949L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "upperBound(I)Lnet/minecraft/world/level/storage/loot/IntRange;", cancellable = true)
    private static void upperBound_1124184021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1124184021L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lowerBound(I)Lnet/minecraft/world/level/storage/loot/IntRange;", cancellable = true)
    private static void lowerBound__339864042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-339864042L))
            info.setReturnValue(null);
    }


}
