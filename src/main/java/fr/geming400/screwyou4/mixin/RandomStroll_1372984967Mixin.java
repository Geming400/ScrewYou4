package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.RandomStroll.class)
public class RandomStroll_1372984967Mixin {
        @Inject(at = @At("HEAD"), method = "stroll(F)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void stroll__1615296567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1615296567L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stroll(FII)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void stroll_1798521758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1798521758L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stroll(FZ)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void stroll_141076647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(141076647L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "swim(F)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void swim_454706644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(454706644L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fly(F)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void fly__1757289527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1757289527L))
            info.setReturnValue(null);
    }


}
